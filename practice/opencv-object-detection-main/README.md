# opencv-object-detection
A Flask Web-App to stream live from local webcam and identify a colored
object in the frame.

This project is based on the code at https://github.com/NakulLakhotia/Live-Streaming-using-OpenCV-Flask

## Usage

You should run this app using a Python virtual environment
```
python3 -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
python app.py
```

When you run the app it will print out the URL to access it

## How to use
By default the app will look for red objects and draw a triangle around the
largest red object it sees.

There is a button labeled "Color Picker" that will bring up another screen
with a small blue rectangle in the middle. Place the color you are
interested in detecting in the middle then click the "Set Color" button.

After a new color is picked it will return you to the detection screen

### [Reference](https://blog.miguelgrinberg.com/post/video-streaming-with-flask)
