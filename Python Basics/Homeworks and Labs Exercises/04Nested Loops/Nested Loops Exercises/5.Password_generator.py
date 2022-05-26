first_number = int(input())
second_number = int(input())

for first in range(1, first_number+1):
    for second in range(1, first_number+1):
        for third in range(97, 97 + second_number):
            for forth in range(97, 97 + second_number):
                for fifth in range(1, first_number+1):
                    if fifth > first and fifth > second:
                        print(f"{first}{second}{chr(third)}{chr(forth)}{fifth}", end=" ")


