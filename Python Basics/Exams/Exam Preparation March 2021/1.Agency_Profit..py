name_of_company = input()
count_of_adult_tickets = int(input())
count_of_kids_tickets = int(input())
price_neto_of_adult_tickets = float(input())
price_service_tax = float(input())

final_price_of_kids_tickets = (price_neto_of_adult_tickets * 0.3 + price_service_tax) * count_of_kids_tickets
final_price_of_adult_tickets = count_of_adult_tickets * (price_neto_of_adult_tickets + price_service_tax)
agency_profit = (final_price_of_adult_tickets + final_price_of_kids_tickets) * 0.2


print(f"The profit of your agency from {name_of_company} tickets is {agency_profit:.2f} lv.")
