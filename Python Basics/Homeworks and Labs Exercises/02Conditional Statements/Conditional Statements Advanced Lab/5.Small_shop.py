product = input()
city = input()
quantity = float(input())
price = 0
# ----------------------------- VARIANT 1
if city == "Sofia" and product == "coffee":
    price = 0.5
elif city == "Sofia" and product == "water":
    price = 0.8
elif city == "Sofia" and product == "beer":
    price = 1.2
elif city == "Sofia" and product == "sweets":
    price = 1.45
elif city == "Sofia" and product == "peanuts":
    price = 1.6
elif city == "Plovdiv" and product == "coffee":
    price = 0.4
elif city == "Plovdiv" and product == "water":
    price = 0.7
elif city == "Plovdiv" and product == "beer":
    price = 1.15
elif city == "Plovdiv" and product == "sweets":
    price = 1.3
elif city == "Plovdiv" and product == "peanuts":
    price = 1.5
elif city == "Varna" and product == "coffee":
    price = 0.45
elif city == "Varna" and product == "water":
    price = 0.7
elif city == "Varna" and product == "beer":
    price = 1.1
elif city == "Varna" and product == "sweets":
    price = 1.35
elif city == "Varna" and product == "peanuts":
    price = 1.55
price_per_city = quantity * price
print(price_per_city)


#   ------------------------------- VARIANT 2
if city == "Sofia":
    if product == "coffee":
        price = 0.5
    elif product == "water":
        price = 0.8
    elif product == "beer":
        price = 1.2
    elif product == "sweets":
        price = 1.45
    elif product == "peanuts":
        price = 1.6
elif city == "Plovdiv":
    if product == "coffee":
        price = 0.4
    elif product == "water":
        price = 0.7
    elif product == "beer":
        price = 1.15
    elif product == "sweets":
        price = 1.3
    elif product == "peanuts":
        price = 1.5
elif city == "Varna":
    if product == "coffee":
        price = 0.45
    elif product == "water":
        price = 0.7
    elif product == "beer":
        price = 1.1
    elif product == "sweets":
        price = 1.35
    elif product == "peanuts":
        price = 1.55