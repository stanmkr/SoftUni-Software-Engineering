first_number = int(input())
second_number = int(input())
operator = input()

result = 0
odd_or_even = ""
if operator == "+" or operator == "-" or operator == "*":
    if operator == "+":
        result = first_number + second_number
    elif operator == "-":
        result = first_number - second_number
    elif operator == "*":
        result = first_number * second_number
    if result % 2 == 0:
        odd_or_even = "even"
    elif result % 2 != 0:
        odd_or_even = "odd"
    print(f"{first_number} {operator} {second_number} = {result} - {odd_or_even} ")
elif operator == "/" or operator == "%":
    if second_number == 0:
        print(f"Cannot divide {first_number} by zero")
    else:
        if operator == "/":
            result = first_number / second_number
            print(f"{first_number} {operator} {second_number} = {result:.2f}")
        elif operator == "%":
            result = first_number % second_number
            print(f"{first_number} {operator} {second_number} = {result}")
