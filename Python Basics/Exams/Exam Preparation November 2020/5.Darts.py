initial_points = 301
failed_points = 0
successful_points = 0
game_is_over = False
name_player = input()
command = input()
while command != "Retire":
    pole = command
    current_points = float(input())
    if pole == "Double":
        current_points *= 2
    elif pole == "Triple":
        current_points *= 3
    if current_points > initial_points:
        failed_points += 1
    else:
        successful_points += 1
        initial_points -= current_points
    if initial_points == 0:
        game_is_over = True
        break
    command = input()

if game_is_over:
    print(f"{name_player} won the leg with {successful_points} shots.")
else:
    print(f"{name_player} retired after {failed_points} unsuccessful shots.")
