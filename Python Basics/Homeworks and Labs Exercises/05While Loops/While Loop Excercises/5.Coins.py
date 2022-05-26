summary = float(input())
summary = int(summary * 100)
coins_counter = 0
while summary > 0:
    if summary - 200 >= 0:
        summary -= 200
        coins_counter += 1
    elif summary - 100 >= 0:
        summary -= 100
        coins_counter += 1
    elif summary - 50 >= 0:
        summary -= 50
        coins_counter += 1
    elif summary - 20 >= 0:
        summary -= 20
        coins_counter += 1
    elif summary - 10 >= 0:
        summary -= 10
        coins_counter += 1
    elif summary - 5 >= 0:
        summary -= 5
        coins_counter += 1
    elif summary - 2 >= 0:
        summary -= 2
        coins_counter += 1
    elif summary - 1 >= 0:
        summary -= 1
        coins_counter += 1

print(coins_counter)
