month = input()
number_of_nights = int(input())
discount = 0
price_studio = 0
price_apartment = 0
apartment = 0
studio = 0

if month == "May" or month == "October":
    studio = 50
    apartment = 65
    price_studio = number_of_nights * studio
    price_apartment = number_of_nights * apartment
    if 7 < number_of_nights < 14:
        price_studio *= 0.95
    elif number_of_nights > 14:
        price_studio *= 0.7
elif month == "June" or month == "September":
    studio = 75.2
    apartment = 68.7
    price_studio = number_of_nights * studio
    price_apartment = number_of_nights * apartment
    if number_of_nights > 14:
        price_studio *= 0.8
elif month == "July" or month == "August":
    studio = 76
    apartment = 77
    price_studio = number_of_nights * studio
    price_apartment = number_of_nights * apartment
if number_of_nights > 14:
    price_apartment *= 0.9

print(f"Apartment: {price_apartment:.2f} lv.")
print(f"Studio: {price_studio:.2f} lv.")
