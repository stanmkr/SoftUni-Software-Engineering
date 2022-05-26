budget = float(input())
season = input()
price = 0
destination = ""
type_holiday = ""

if budget <= 100:
    destination = "Bulgaria"
    if season == "summer":
        type_holiday = "Camp"
        price = budget * 0.3
    if season == "winter":
        type_holiday = "Hotel"
        price = budget * 0.7
elif budget <= 1000:
    destination = "Balkans"
    if season == "summer":
        type_holiday = "Camp"
        price = budget * 0.4
    elif season == "winter":
        type_holiday = "Hotel"
        price = budget * 0.8
else:
    destination = "Europe"
    type_holiday = "Hotel"
    price = budget * 0.9

print(f"Somewhere in {destination}")
print(f"{type_holiday} - {price:.2f}")
