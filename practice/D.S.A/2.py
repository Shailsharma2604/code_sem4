a=int(input("Pls Enter First number :- "))
b=input("Pls Enter the operation you wnat to do :- ")
c=int(input("Pls Enter Second number :- "))
if b == "+":
    print(a+c)
elif b=="-":
    print(a-c)
elif b=="/":
    print(a/c)
elif b=="*":
    print(a*c)
elif b=="%":
    print(a%c)
elif b=="//":
    print(a//c)
else:
    print("Wrong input")