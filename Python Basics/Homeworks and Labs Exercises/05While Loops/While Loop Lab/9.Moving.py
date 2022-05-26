shirochina_svobodno_mqsto = int(input())
duljina_svobodno_mqsto = int(input())
visochina_svobodno_mqsto = int(input())
number_of_kashoni = input()
free_space = shirochina_svobodno_mqsto * duljina_svobodno_mqsto * visochina_svobodno_mqsto

while number_of_kashoni != "Done":
    number_of_kashoni = int(number_of_kashoni)
    free_space -= number_of_kashoni
    if free_space <= 0:
        break
    number_of_kashoni = input()
if free_space > 0:
    print(f"{free_space} Cubic meters left.")
else:
    print(f"No more free space! You need {abs(free_space)} Cubic meters more.")