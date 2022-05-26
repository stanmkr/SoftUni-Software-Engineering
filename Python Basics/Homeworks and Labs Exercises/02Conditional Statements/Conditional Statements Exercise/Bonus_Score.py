initial_points = int(input())
bonus_points = 0

if initial_points <= 100:
    bonus_points = 5
elif initial_points <= 1000:
    bonus_points = initial_points * 0.20
else:
    bonus_points = initial_points * 0.10


if initial_points % 2 == 0:
    bonus_points = bonus_points + 1
elif initial_points % 10 == 5:
    bonus_points = bonus_points + 2

final_points = initial_points + bonus_points
print(bonus_points)
print(final_points)