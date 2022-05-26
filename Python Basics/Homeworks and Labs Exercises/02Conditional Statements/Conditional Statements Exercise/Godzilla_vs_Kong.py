budget = float(input())     # Budget
number_statistics = int(input())    # Number statistics:
price_statistics_dress = float(input())     # Cena obleklo edin statist: "

price_dress_total = price_statistics_dress * number_statistics
dekor = budget * 0.10
expenses = price_dress_total + dekor

if number_statistics > 150:
    price_dress_total -= price_dress_total * 0.10

if expenses > budget:
    needed_money = expenses - budget
    print("Not enough money!")
    print(f"Wingard needs {needed_money:.2f} leva more.")
elif expenses <= budget:
    left_money = budget - expenses
    print("Action!")
    print(f"Wingard starts filming with {left_money:.2f} leva left.")




