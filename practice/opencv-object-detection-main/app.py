

from threading import Thread
from flask import Flask, render_template, Response, redirect
import time

from obj_detc import OpenCVHandler
from obj_detc import OpenCVColor
from obj_detc import AprilTagHandler

old_h = 0
old_s = 0
old_v = 0

app = Flask(__name__)

def gen_hsv(app):  # generate frame by frame from camera

    global old_h
    global old_s
    global old_v

    while True:
        # Capture frame-by-frame
        app.open_cv.update()
        frame = app.open_cv.get_frame()

        height = frame.get_height()
        width = frame.get_width()

        x = int(width/2)
        y = int(height/2)

        hsv = frame.get_hsv()
        h, s, v = hsv[x][y]

        old_h = ((old_h * 99) + h) / 100
        old_s = ((old_s * 99) + s) / 100
        old_v = ((old_v * 99) + v) / 100

        frame.add_line((x-50,y), (x+50, y), [255, 0, 0])
        frame.add_line((x,y-50), (x, y+50), [255, 0, 0])

        frame.flip()

        frame.add_text((10, 25), "H: %d" % old_h)
        frame.add_text((10, 50), "S: %d" % old_s)
        frame.add_text((10, 75), "V: %d" % old_v)

        jpg = frame.get_jpg_bytes()
        yield (b'--frame\r\n'
               b'Content-Type: image/jpeg\r\n\r\n' + jpg + b'\r\n')  # concat frame one by one and show result

def c_picker(app):  # generate frame by frame from camera

    while True:
        # Capture frame-by-frame
        app.open_cv.update()
        frame = app.open_cv.get_frame()

        height = frame.get_height()
        width = frame.get_width()

        x = int(width/2) - 50
        y = int(height/2) - 50

        frame.add_rectangle((x,y), (x+100, y+100), [255,0,0])
        jpg = frame.get_jpg_bytes(flipped=True)
        yield (b'--frame\r\n'
               b'Content-Type: image/jpeg\r\n\r\n' + jpg + b'\r\n')  # concat frame one by one and show result

# This function gets called by the /video_feed route below
def gen_frames(app):  # generate frame by frame from camera

    # We want to loop this forever
    while True:
        # Capture frame-by-frame
        app.open_cv.update()

        if app.apriltag.check():
            app.apriltag.add_rectangle()

        app.cv_color.add_rectangle()

        frame = app.open_cv.get_frame()
        (h, s, v) = app.cv_color.average_color

        frame.add_text((10, 25), "H: %d" % h)
        frame.add_text((10, 50), "S: %d" % s)
        frame.add_text((10, 75), "V: %d" % v)

        jpg = frame.get_jpg_bytes()
        # Return the image to the browser
        yield (b'--frame\r\n'
               b'Content-Type: image/jpeg\r\n\r\n' + jpg + b'\r\n')  # concat frame one by one and show result


@app.route('/video_feed')
def video_feed():
    #Video streaming route. Put this in the src attribute of an img tag
    return Response(gen_frames(app), mimetype='multipart/x-mixed-replace; boundary=frame')

@app.route('/color_picker')
def color_picker():
    #Video streaming route. Put this in the src attribute of an img tag
    return Response(c_picker(app), mimetype='multipart/x-mixed-replace; boundary=frame')

@app.route('/show_hsv')
def show_hsv():
    #Video streaming route. Put this in the src attribute of an img tag
    return Response(gen_hsv(app), mimetype='multipart/x-mixed-replace; boundary=frame')

@app.route('/')
def index():
    """Video streaming home page."""
    return render_template('index.html')

@app.route('/picker')
def picker():
    """Video streaming home page."""
    return render_template('picker.html')

@app.route('/see_hsv')
def see_hsv():
    """Video streaming home page."""
    return render_template('see_hsv.html')

@app.route("/set_color")
def do_set():
    app.cv_color.set()

    return redirect("/")


if __name__ == '__main__':

    cv_handler = OpenCVHandler()
    cv_color = OpenCVColor(cv_handler)
    apriltag = AprilTagHandler(cv_handler)

    app.open_cv = cv_handler
    app.cv_color = cv_color
    app.apriltag = apriltag


    thread = Thread(target=app.run)
    thread.start()

    while True:
        # We control when opencv updates the image now
        #cv_handler.update()

        time.sleep(1)
