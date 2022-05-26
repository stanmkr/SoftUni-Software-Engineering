n = int(input())

#   LEFT SIDE
left_summary = 0
for i in range(0, n):
    number = int(input())
    left_summary = left_summary + number

# RIGHT SIDE
right_summary = 0
for i in range(0, n):
    number = int(input())
    right_summary = right_summary + number

if left_summary == right_summary:
    print(f"Yes, sum = {left_summary}")
else:
    difference = abs(left_summary - right_summary)
    print(f"No, diff = {difference}")
