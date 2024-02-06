# Polymorphism: The ability to use a common interface for multiple forms (data types).
# Inheritance is required for Polymorphism to work.


import math

class Shape:
    def area(self):
        pass

class Rectangle(Shape):
    def __init__(self, length, width):
        self.length = length
        self.width = width

    def area(self):
        return self.length * self.width

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return math.pi * self.radius ** 2

class Triangle(Shape):
    def __init__(self, base, height):
        self.base = base
        self.height = height

    def area(self):
        return 0.5 * self.base * self.height

# Create instances of different shapes
rectangle = Rectangle(156,654)
circle = Circle(879)
triangle = Triangle(789,456)

# Calculate the area of each shape
rectangle_area = rectangle.area()
circle_area = circle.area()
triangle_area = triangle.area()

# Print the areas of each shape
print("Area of rectangle:", rectangle_area)
print("Area of circle:", circle_area)
print("Area of triangle:", triangle_area)
