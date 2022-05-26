price_kg_vegetable = float(input())
price_kg_fruit = float(input())
kg_vegetable = float(input())
kg_fruit = int(input())

price_vegetable = price_kg_vegetable * kg_vegetable
price_fruits = price_kg_fruit * kg_fruit

total = (price_vegetable + price_fruits) / 1.94
print(f"{total:.2f}")
