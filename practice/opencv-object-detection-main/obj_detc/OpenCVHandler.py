import cv2
import numpy as np
from statistics import mean

class Frame:
    "Class for modifying an OpenCV frame"

    def __init__(self, frame):
        self.frame = frame
        self.hsv = None
        self.gray = None

    def flip(self):
        self.frame = cv2.flip(self.frame, 1)

    def get_hsv(self):
        if self.hsv is None:
            self.hsv = cv2.cvtColor(self.frame, cv2.COLOR_BGR2HSV)
        return self.hsv

    def get_gray(self):
        if self.gray is None:
            self.gray = cv2.cvtColor(self.frame, cv2.COLOR_BGR2GRAY)
        return self.gray

    def get_height(self):
        return len(self.frame)

    def get_width(self):
        return len(self.frame[0])

    def add_rectangle(self, start, end, color, thickness=2):
        self.frame = cv2.rectangle(self.frame, start, end, color, thickness)

    def add_circle(self, center, radius, color, thickness):
        self.frame = cv2.circle(self.frame, center, radius, color, thickness)

    def add_line(self, start, end, color, thickness=2):
        self.frame = cv2.line(self.frame, start, end, color, thickness)

    def add_text(self, coords, text, size = 1, color = (0, 0, 255)):
        self.frame = cv2.putText(self.frame, text, coords, cv2.FONT_HERSHEY_SIMPLEX, size, color, 2)

    def get_jpg_bytes(self, flipped=False):
        if flipped is True:
            self.flip()
        ret, buffer = cv2.imencode('.jpg', self.frame)
        jpg = buffer.tobytes()
        return jpg

class OpenCVHandler:
    "Class to make opencv easier"

    def __init__(self):
        self.frame = None
        self.camera = cv2.VideoCapture(0)

    def update(self):
        success, frame = self.camera.read()
        if success:
            self.frame = Frame(frame)

    def get_frame(self):
        return self.frame

