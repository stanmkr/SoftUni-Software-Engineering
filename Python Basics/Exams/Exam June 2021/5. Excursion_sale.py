number_of_vacations_sea = int(input())
number_of_vacations_mountain = int(input())
price_sea = 680
price_mountain = 499
total = 0
command = input()
all_sold = False
while command != "Stop":
    paket = command
    if paket == "sea":
        if number_of_vacations_sea > 0:
            total += price_sea
            number_of_vacations_sea -= 1
    elif paket == "mountain":
        if number_of_vacations_mountain > 0:
            total += price_mountain
            number_of_vacations_mountain -= 1
    if number_of_vacations_mountain == 0 and number_of_vacations_sea == 0:
        all_sold = True
        break
    command = input()

if all_sold:
    print(f"Good job! Everything is sold.")

print(f"Profit: {total} leva.")

