first_interval = int(input())
second_interval = int(input())
third_interval = int(input())

for first_number in range(1, first_interval):
    for second_number in range(2, second_interval+1):
        for third_number in range(1, third_interval):
            if first_number % 2 == 0 and third_number % 2 == 0:
                print(f"{first_number}{second_number}{third_number}")


