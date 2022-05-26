start_interval = input()
finish_interval = input()
skip_letter = input()

for first_letter in start_interval:
    for second_letter in finish_interval:
        print(f"{first_letter}{second_letter}", end=" ")
