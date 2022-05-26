# # Марин и Нели си купуват къща недалеч от София. Нели толкова много обича цветята, че Ви убеждава да
# # напишете програма, която да изчисли колко ще им струва, за да засадят определен брой цветя и дали
# # наличният бюджет ще им е достатъчен. Различните цветя са с различни цени:
#
# Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена;
#  Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена;
#  Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена;
#  Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%;
#  Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%.

# Да се отпечата на конзолата на един ред:
#  Ако бюджетът им е достатъчен - &quot;Hey, you have a great garden with {броя цвета} {вид
# цветя} and {останалата сума} leva left.&quot;;
#  Ако бюджета им е НЕ достатъчен - &quot;Not enough money, you need {нужната сума} leva
# more.&quot;.

flower_type = input()
flower_count = int(input())
budget = int(input())
price_flower = 0

if flower_type == "Roses":
    price_flower = 5
    if flower_count > 80:
        price_flower *= 0.9

elif flower_type == "Dahlias":
    price_flower = 3.8
    if flower_count > 90:
        price_flower *= 0.85

elif flower_type == "Tulips":
    price_flower = 2.8
    if flower_count > 80:
        price_flower *= 0.85
elif flower_type == "Narcissus":
    price_flower = 3
    if flower_count < 120:
        price_flower *= 1.15
elif flower_type == "Gladiolus":
    price_flower = 2.5
    if flower_count < 80:
        price_flower *= 1.2

total_price = flower_count * price_flower
left_money = abs(budget - total_price)
if flower_count > 0:
    if flower_type == "Roses" \
            or flower_type == "Dahlias" \
            or flower_type == "Tulips" \
            or flower_type == "Narcissus" \
            or flower_type == "Gladiolus":
        if budget >= total_price:
            print(
                f"Hey, you have a great garden with {round(flower_count)} {flower_type} and {left_money:.2f} leva left.")
        else:
            print(f"Not enough money, you need {left_money:.2f} leva more.")
    else:
        print("")
else:
    print("")
