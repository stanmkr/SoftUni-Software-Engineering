puzzle = float(2.6)
kukla = float(3)
bear = float(4.1)
minion = float(8.2)
kamion = float(2)


cena_excursion = float(input())
number_puzzle = int(input())
number_kukla = int(input())
number_bear = int(input())
number_minion = int(input())
number_kamion = int(input())

number_toys = number_puzzle + number_kukla + number_bear + number_minion + number_kamion
total_price_igrachki = puzzle * number_puzzle + kukla * number_kukla + bear * number_bear + minion * number_minion + kamion * number_kamion

if number_toys >= 50:
    total_price_igrachki = total_price_igrachki - 0.25 * total_price_igrachki

naem = total_price_igrachki * 0.10
pechalba = total_price_igrachki - naem

if pechalba >= cena_excursion:
    left_money = pechalba - cena_excursion
    print(f"Yes! {left_money:.2f} lv left.")
else:
    needed_money = cena_excursion - pechalba
    print(f"Not enough money! {needed_money:.2f} lv needed.")
