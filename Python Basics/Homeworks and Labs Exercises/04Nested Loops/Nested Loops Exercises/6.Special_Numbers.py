number = int(input())
for current_number in range(1111, 10000):
    number_is_special = True
    for digit in (str(current_number)):
        current_digit = int(digit)
        if current_digit == 0 or number % current_digit != 0:
            number_is_special = False
            break
    if number_is_special:
        print(current_number, end=" ")
