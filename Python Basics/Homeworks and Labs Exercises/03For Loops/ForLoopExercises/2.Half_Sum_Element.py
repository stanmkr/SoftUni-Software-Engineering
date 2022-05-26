import sys

count_of_numbers = int(input())
max_number = -sys.maxsize
sum_of_numbers = 0

for i in range(0, count_of_numbers):
    current_number = int(input())
    if current_number > max_number:
        max_number = current_number
    sum_of_numbers = sum_of_numbers + current_number

if max_number == sum_of_numbers - max_number:
    print(f"Yes\nSum = {max_number}")
else:
    difference = abs(max_number - ( sum_of_numbers - max_number))
    print(f"No\nDiff = {difference}")