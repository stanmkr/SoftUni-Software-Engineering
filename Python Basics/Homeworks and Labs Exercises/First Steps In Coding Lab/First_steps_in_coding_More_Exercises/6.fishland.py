price_skumria = float(input())
price_caca = float(input())
kg_palamud = float(input())
kg_safrid = float(input())
kg_midi = float(input())

#price_midi_per_kg = 7.5

price_palamud = price_skumria + price_skumria * 0.60
total_palamud = price_palamud * kg_palamud

price_safrid = price_caca + price_caca * 0.80
total_safrid = price_safrid * kg_safrid

total_midi = kg_midi * 7.5


total_to_pay = total_palamud + total_midi + total_safrid
print(f"{total_to_pay:.2f}")

