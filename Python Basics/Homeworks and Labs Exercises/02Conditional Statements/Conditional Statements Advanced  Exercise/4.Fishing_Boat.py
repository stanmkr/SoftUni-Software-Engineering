# Тони и приятели много обичат да ходят за риба и са толкова запалени по риболова, че решават да отидат на
# риболов с кораб. Цената за наема на кораба зависи от сезона и броя рибари:

# В зависимост от сезона:
#  Цената за наем на кораба през пролетта е 3000 лв.;
#  Цената за наем на кораба през лятото и есента е 4200 лв.;
#  Цената за наем на кораба през зимата е 2600 лв.
#
#
# В зависимост от броя на групата има различна отстъпка:
#  Ако групата е до 6 човека включително - отстъпка от 10%;
#  Ако групата е от 7 до 11 човека включително - отстъпка от 15%;
#  Ако групата е от 12 нагоре - отстъпка от 25%.

# Рибарите ползват допълнително 5% отстъпка, ако са четен брой, освен ако не е есен - тогава нямат
# допълнителна отстъпка, която се начислява след като се приспадне отстъпката по горните критерии.
# Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.

# Вход
# От конзолата се четат три реда:
#  Бюджет на групата - цяло число;
#  Сезон - текст: &quot;Spring&quot;, &quot;Summer&quot;, &quot;Autumn&quot; или &quot;Winter&quot;;
#  Брой рибари - цяло число.

budget = float(input())
season = input()
number_fishermans = float(input())
price = 0

if season == "Spring":
    price = 3000
elif season == "Summer" or season == "Autumn":
    price = 4200
elif season == "Winter":
    price = 2600

if number_fishermans <= 6:
    price *= 0.90
elif 7 <= number_fishermans <= 11:
    price *= 0.85
elif number_fishermans > 12:
    price *= 0.75


if season != "Autumn" and number_fishermans % 2 == 0:
    price = price - (price * 0.05)


left_money = abs(budget - price)
if number_fishermans > 0 and budget > 0:
    if season == "Summer" or season == "Spring" or season == "Winter" or season == "Autumn":
        if budget >= price:
            print(f"Yes! You have {left_money:.2f} leva left.")
        else:
            print(f"Not enough money! You need {left_money:.2f} leva.")

