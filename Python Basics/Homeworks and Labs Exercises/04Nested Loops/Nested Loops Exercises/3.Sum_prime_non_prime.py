sum_of_prime_numbers = 0  # PROSTI CHISLA
sum_of_non_prime_numbers = 0  # NE PROSTI CHISLA
my_input = input()
while my_input != "stop":
    is_prime = True
    current_number = int(my_input)
    if current_number < 0:
        print("Number is negative.")
        my_input = input()
        continue
    for number in range(2, current_number):
        if current_number % number == 0:
            is_prime = False
            break
    if is_prime:
        sum_of_prime_numbers += current_number
    else:
        sum_of_non_prime_numbers += current_number
    my_input = input()
print(f"Sum of all prime numbers is: {sum_of_prime_numbers}")
print(f"Sum of all non prime numbers is: {sum_of_non_prime_numbers}")