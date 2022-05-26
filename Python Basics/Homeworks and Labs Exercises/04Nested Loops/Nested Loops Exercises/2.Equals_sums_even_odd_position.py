first_number = int(input())
second_number = int(input())

for number in range(first_number, second_number + 1):
    number_string = str(number)
    sum_of_chetna_position_numbers = 0
    sum_of_nechetna_position_numbers = 0
    for index, digits in enumerate(number_string):
        if index % 2 == 0:
            sum_of_chetna_position_numbers += int(digits)
        else:
            sum_of_nechetna_position_numbers += int(digits)

    if sum_of_chetna_position_numbers == sum_of_nechetna_position_numbers:
        print(number_string, end=" ")
