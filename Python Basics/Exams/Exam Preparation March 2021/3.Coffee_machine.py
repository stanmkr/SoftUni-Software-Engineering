drink = input()
sugar = input()
number_of_drinks = int(input())
price = 0

if drink == "Espresso":
    if sugar == "Without":
        price = 0.9
        price *= 0.65
    elif sugar == "Normal":
        price = 1
    elif sugar == "Extra":
        price = 1.2
    if number_of_drinks >= 5:
        price *= 0.75

elif drink == "Cappuccino":
    if sugar == "Without":
        price = 1
        price *= 0.65
    elif sugar == "Normal":
        price = 1.2
    elif sugar == "Extra":
        price = 1.6

elif drink == "Tea":
    if sugar == "Without":
        price = 0.5
        price *= 0.65
    elif sugar == "Normal":
        price = 0.6
    elif sugar == "Extra":
        price = 0.7

total_price = price * number_of_drinks
if total_price > 15:
    total_price *= 0.8

print(f"You bought {number_of_drinks} cups of {drink} for {total_price:.2f} lv.")


