import cv2
import numpy as np
import apriltag

class AprilTagHandler:
    "Class to make apriltag handling easier"

    def __init__(self, cv_handler):
        self.cv = cv_handler

    def check(self):
        frame = self.cv.get_frame()
        gray = frame.get_gray()
        options = apriltag.DetectorOptions(families="tag16h5")
        detector = apriltag.Detector(options)
        self.results = detector.detect(gray)

        return len(self.results)

    def add_rectangle(self):
        frame = self.cv.get_frame()
        for r in self.results:
            # extract the bounding box (x, y)-coordinates for the AprilTag
            # and convert each of the (x, y)-coordinate pairs to integers
            (ptA, ptB, ptC, ptD) = r.corners
            ptB = (int(ptB[0]), int(ptB[1]))
            ptC = (int(ptC[0]), int(ptC[1]))
            ptD = (int(ptD[0]), int(ptD[1]))
            ptA = (int(ptA[0]), int(ptA[1]))
            # draw the bounding box of the AprilTag detection
            frame.add_line(ptA, ptB, (0, 255, 0), 2)
            frame.add_line(ptB, ptC, (0, 255, 0), 2)
            frame.add_line(ptC, ptD, (0, 255, 0), 2)
            frame.add_line(ptD, ptA, (0, 255, 0), 2)
            # draw the center (x, y)-coordinates of the AprilTag
            (cX, cY) = (int(r.center[0]), int(r.center[1]))
            frame.add_circle((cX, cY), 5, (0, 0, 255), -1)
            # draw the tag family on the image
            tagFamily = r.tag_family.decode("utf-8")
            frame.add_text((ptA[0], ptA[1] - 15), tagFamily, 0.5, (0, 255, 0))
