number_of_dancers = int(input())
points = float(input())
season = input()
place = input()
price = points * number_of_dancers

if place == "Bulgaria":
    if season == "summer":
        price *= 0.95
    elif season == "winter":
        price *= 0.92
elif place == "Abroad":
    price *= 1.5
    if season == "summer":
        price *= 0.9
    elif season == "winter":
        price *= 0.85

price_after_charity = price * 0.75
total = price - price_after_charity
print(f"Charity - {price_after_charity:.2f}")
print(f"Money per dancer - {total / number_of_dancers:.2f}")