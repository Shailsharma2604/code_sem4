
############## 1 #############

# a="1"
# b="2"
# print(a+b)
# a=1
# b=2
# print(a+b)

############## 2 #############

# x=int(input())
# match x:
#     case 0:
#         print("x is zero")
#     case 4 if x % 2 == 0:
#         print("x % 2 == 0 and case is 4")

############## 2 #############

# from typing import *

# def areaSwitchCase(ch: int, a: List[float]):
#     # Write your code here
#     match areaSwitchCase:
#         case 1:
#             return ((22/7)*ch*ch)
#         case 2:
#             return (multiply(a))

############## 2 #############

import math
from typing import *

def areaSwitchCase(ch: int, a: List[float]):
    area = 0.0

    # Using if-elif-else statements to calculate the area based on the shape.
    if ch == 1:  # Circle
        area = math.pi * a[0] * a[0]
    elif ch == 2:  # Rectangle
        area = a[0] * a[1]

    # Returning the calculated area upto 5 decimal places.
    return "{:.5f}".format(area)