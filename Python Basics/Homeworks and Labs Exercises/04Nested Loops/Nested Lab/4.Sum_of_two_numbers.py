start_of_interval = int(input())
end_of_interval = int(input())
magic_number = int(input())

combination_counter = 0
is_found = False
for first_number in range(start_of_interval, end_of_interval + 1):
    for second_number in range(start_of_interval, end_of_interval + 1):
        combination_counter += 1
        is_it_magic_number = first_number + second_number
        if is_it_magic_number == magic_number:
            print(f"Combination N:{combination_counter} ({first_number} + {second_number} = {magic_number})")
            is_found = True
            break
    if is_found:    # == TRUE
        break
if not is_found:    # == FALSE
    print(f"{combination_counter} combinations - neither equals {magic_number}")

