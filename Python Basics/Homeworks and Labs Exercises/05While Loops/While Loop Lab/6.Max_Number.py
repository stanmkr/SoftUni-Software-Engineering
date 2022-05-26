import sys

number = input()
highest_number = -sys.maxsize

while number != "Stop":
    number = int(number)
    if number > highest_number:
        highest_number = number
    number = input()
print(highest_number)






