import math
days = int(input())
kilometers = float(input())
km_meta = 1000
total = kilometers
for i in range(0, days):
    percent = int(input())
    kilometers = kilometers + (kilometers * (percent / 100))
    total += kilometers

difference = abs(km_meta - total)
if total >= km_meta:
    print(f"You've done a great job running {math.ceil(difference)} more kilometers!")
elif total < km_meta:
    print(f"Sorry Mrs. Ivanova, you need to run {math.ceil(difference)} more kilometers")
