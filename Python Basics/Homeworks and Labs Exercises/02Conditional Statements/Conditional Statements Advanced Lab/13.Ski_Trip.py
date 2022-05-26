days = int(input())
room_type = input()
feedback = input()
price = 0.0
nights = days - 1

if room_type == "room for one person":
    price = 18
elif room_type == "apartment":
    price = 25
    if days < 10:
        price = price * 0.7    # price - (price * 0.3)
    elif 10 <= days <= 15:
        price *= 0.65
    elif days > 15:
        price *= 0.5
elif room_type == "president apartment":
    price = 35
    if days < 10:
        price = price * 0.9    # price - (price * 0.3)
    elif 10 <= days <= 15:
        price *= 0.85
    elif days > 15:
        price *= 0.8

final_price = nights * price

if feedback == "positive":
    final_price = final_price * 1.25
elif feedback == "negative":
    final_price = final_price * 0.9

print(f"{final_price:.2f}")


