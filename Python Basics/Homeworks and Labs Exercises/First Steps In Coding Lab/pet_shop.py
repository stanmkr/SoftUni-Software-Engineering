can_dog = 2.5
can_others = 4

number_of_dogs = int(input())
number_of_others = int(input())

price_dogs = can_dog * number_of_dogs
price_others = can_others * number_of_others

final_price = price_dogs + price_others

print(f"{final_price} lv.")
