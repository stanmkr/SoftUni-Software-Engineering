import sys
n = int(input())
max = -sys.maxsize
min = sys.maxsize
for i in range(1, n+1):
    number = int(input())
    if number > max:
        max = number
    if number < min:
        min = number

print(f"Max number: {max}")
print(f"Min number: {min}")