people = int(input())
number_of_nights = int(input())
number_of_cards = int(input())
number_of_tickets = int(input())

night = 20
karta_transport = 1.6
bilet_muzei = 6

total_nights = number_of_nights * night
total_cards = number_of_cards * karta_transport
total_bilet_muzei = number_of_tickets * bilet_muzei

total_per_person = total_nights + total_cards + total_bilet_muzei

total_persons = total_per_person * people
total_of_total = total_persons * 1.25

print(f"{total_of_total:.2f}")
