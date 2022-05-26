salon_rental = int(input("Tell me the rental price of the salon: "))

procent_tarta = 0.20
procent_napitki = 0.45

tarta_price = (salon_rental * procent_tarta)
napitki_price = (tarta_price * procent_napitki)
napitki_price = (tarta_price - napitki_price)
animator_price = (salon_rental / 3)

needed_price = salon_rental + tarta_price + napitki_price + animator_price
print (f"The needed price is: {needed_price}")





