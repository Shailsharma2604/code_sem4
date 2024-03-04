import cv2
import numpy as np
from statistics import mean

class OpenCVColor:
    "Class to make opencv color handling easier"

    def __init__(self, cv_handler):
        self.cv = cv_handler

        # Example Red
        self.lower_color = np.array([150,100,100], dtype=np.uint8)
        self.upper_color = np.array([220,255,255], dtype=np.uint8)
        self.average_color = np.array([255,255,255], dtype=np.uint8)

    def set(self):

        frame = self.cv.get_frame()

        hsv = frame.get_hsv()
                # Now we want to find the high and low colors, then print them
        low = hsv[0][0]
        high = hsv[0][0]

        h = []
        s = []
        v = []

        width = len(hsv[0])
        height = len(hsv)
        x = int(width/2) - 50
        y = int(height/2) - 50

        for i in range(x, x + 100):
            for j in range(y, y + 100):

                h.append(hsv[j][i][0])
                s.append(hsv[j][i][1])
                v.append(hsv[j][i][2])

                if hsv[j][i][0] < low[0]:
                    low = hsv[j][i]
                if hsv[j][i][0] > high[0]:
                    high = hsv[j][i]

        self.average_color[0] = int(mean(h))
        self.average_color[1] = int(mean(s))
        self.average_color[2] = int(mean(v))

        h = self.average_color[0]
        s = self.average_color[1]
        v = self.average_color[2]

        hl = h - 50
        if hl < 0: hl = 0
        sl = s - 50
        if sl < 0: sl = 0
        vl = v - 50
        if vl < 0: vl = 0
        self.lower_color = np.array([hl,sl,vl], dtype=np.uint8)

        hh = h + 50
        if hh > 255: hl = 255
        sh = s + 50
        if sh > 255: sh = 255
        vh = v + 50
        if vh > 255: vh = 255
        self.upper_color = np.array([hh,sh,vh], dtype=np.uint8)

    def get_contours(self):
        # To detect a color we need to set an upper and lower bound on the
        # color. The array of numbers is HSV format which is not a standard
        # in any way.
        # You can use the color-picker.py script to help figure
        # these numbers out, it's much easier than trying to figure this
        # out by hand

        frame = self.cv.get_frame()
        hsv = frame.get_hsv()

        # We now take the lower and upper bound colors and look for
        # anything that falls inside of this range.
        mask = cv2.inRange(hsv, self.lower_color, self.upper_color)

        # Bitwise-AND mask and original image
        res = cv2.bitwise_and(frame.frame,frame.frame, mask= mask)

        # Convert the image to grayscale
        imgray = cv2.cvtColor(res,cv2.COLOR_BGR2GRAY)

        # This turns the image into a black and white. Lighter pixels are
        # turned white, darker pixels turn black
        ret,thresh = cv2.threshold(imgray,127,255,0)

        # This step looks for shapes in the black and white image
        contours, hierarchy = cv2.findContours(imgray,cv2.RETR_TREE,cv2.CHAIN_APPROX_SIMPLE)

        return contours

    def add_rectangle(self):

        frame = self.cv.get_frame()
        contours = self.get_contours()
        # This variable is going to hold the largest rectangle we find. We
        # can do multiple object tracking, but it's easier for us to track
        # just the largest rectangle
        rectangle = {
            "area": 0,
            "x": 0,
            "y": 0,
            "w": 0,
            "h": 0
        }

        # We will loop over all the rectangles found
        for cnt in contours:

            # Get the rectangle dimensions
            x,y,w,h = cv2.boundingRect(cnt)

            # If this rectangle is larger than the currently largest
            # recrangle, store it
            if w * h > rectangle["area"]:
                rectangle["area"] = w * h
                rectangle["x"] = x
                rectangle["y"] = y
                rectangle["w"] = w
                rectangle["h"] = h

        # Only frame the biggest rectangle
        x = rectangle["x"]
        y = rectangle["y"]
        w = rectangle["w"]
        h = rectangle["h"]

        # We draw the rectangle onto the screen here
        frame.add_rectangle((x,y),(x+w,y+h),[255,0,0],2)
