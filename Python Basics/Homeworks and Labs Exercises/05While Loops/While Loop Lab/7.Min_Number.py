import sys
your_number = input()
minimum_number = sys.maxsize
while your_number != "Stop":
    your_number = int(your_number)
    if your_number < minimum_number:
        minimum_number = your_number
    your_number = input()
print(minimum_number)