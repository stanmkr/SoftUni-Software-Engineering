days = 5
djobni_per_day = float(input())
profit_per_day = float(input())
razhod_per_period = float(input())
price_of_the_gift = float(input())

djobni = djobni_per_day * days
profit = days * profit_per_day
total_spesteni = djobni + profit
razhod = total_spesteni - razhod_per_period

difference = abs(razhod - price_of_the_gift)
if razhod >= price_of_the_gift:
    print(f"Profit: {razhod:.2f} BGN, the gift has been purchased.")
else:
    print(f"Insufficient money: {difference:.2f} BGN.")
