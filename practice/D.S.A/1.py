
######## 1 ########

# print("Hello World")
# print(5)

######## 2 ########

# import cv2

# #Loading The Cascade File
# face_cascade = cv2.CascadeClassifier('haarcascade_frontalface_default.xml')

# #Reading the Input Image
# # image= cv2.imread('1.jpg')
# image= cv2.imread('1.png')

# #Resizing the Image
# img = cv2.resize(image,None,fx=0.3,fy=0.3)

# #Converting the image into grayscale image
# imgGray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

# #Detecting The Faces
# faces = face_cascade.detectMultiScale(imgGray, 1.2, 5)

# #Pointing The Faces
# for (x,y,w,h) in faces:
# 	cv2.rectangle(img, (x,y), (x+w, y+h), (255,0,0),2)

# #Displaying The Output Image
# cv2.imshow('img', img)
# cv2.waitKey()

######## 3 ########



######## 4 ########

# print("Hello World", 7)
# print(5)
# print("Bye")
# print(17*13)

######## 5 ########

######## 6 ########

a=complex(1,2)
b=True
c="Harry"
d=None
print(a)
print("The type of a is", type(a))
print(b)
print("The type of b is", type(b))
print(c)
print("The type of c is", type(c))
print(d)
print("The type of d is", type(d))
print(a+b)
print("The type of d is", type(a+b))