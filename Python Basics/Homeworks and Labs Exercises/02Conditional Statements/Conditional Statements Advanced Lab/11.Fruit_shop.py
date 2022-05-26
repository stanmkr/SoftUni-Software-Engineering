# плод banana apple orange grapefruit kiwi pineapple grapes
# цена 2.50 1.20 0.85 1.45 2.70 5.50 3.85

# През събота и неделя магазинът работи на по-високи цени:
# плод banana apple orange grapefruit kiwi pineapple grapes
# цена 2.70 1.25 0.90 1.60 3.00 5.60 4.20

fruit = input()
day_of_the_week = input()
quantity = float(input())
price = 0
is_working_day = day_of_the_week == "Monday" or \
    day_of_the_week == "Tuesday" or \
    day_of_the_week == "Wednesday" or \
    day_of_the_week == "Thursday" or \
    day_of_the_week == "Friday"

is_weekend = day_of_the_week == "Saturday" or day_of_the_week == "Sunday"

if is_working_day:
    if fruit == "banana":
        price = 2.5
    elif fruit == "apple":
        price = 1.2
    elif fruit == "orange":
        price = 0.85
    elif fruit == "grapefruit":
        price = 1.45
    elif fruit == "kiwi":
        price = 2.7
    elif fruit == "pineapple":
        price = 5.5
    elif fruit == "grapes":
        price = 3.85
elif is_weekend:
    if fruit == "banana":
        price = 2.7
    elif fruit == "apple":
        price = 1.25
    elif fruit == "orange":
        price = 0.9
    elif fruit == "grapefruit":
        price = 1.6
    elif fruit == "kiwi":
        price = 3
    elif fruit == "pineapple":
        price = 5.6
    elif fruit == "grapes":
        price = 4.2

if price == 0:
    print("error")
else:
    final_price = price * quantity
    print(f"{final_price:.2f}")