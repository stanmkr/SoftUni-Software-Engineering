# парите на Лили = играчки (бр. играчки * цена на играчка) + спестени пари

age_lily = int(input())
price_laundry = float(input())
price_per_toy = float(input())

count_toys = 0
saved_money = 0
birthday_money = 9
# за всеки рожден ден от [1 до възрастта] -> проверяваме какво е получила

for birthday in range(1, age_lily + 1):
    if birthday % 2 != 0:
        count_toys = count_toys + 1
    else:
        saved_money = saved_money + birthday_money
        birthday_money = birthday_money + 10

money_lily = saved_money + (count_toys * price_per_toy)

left_money = abs(money_lily - price_laundry)
if money_lily >= price_laundry:
    print(f"Yes! {left_money:.2f}")
else:
    print(f"No! {left_money:.2f}")
