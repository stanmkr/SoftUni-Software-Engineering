goal = 10000
going_home = False
total_steps = 0
while total_steps < goal:
    command = input()
    if command == "Going home":
        going_home = True
        break
    current_steps = int(command)
    total_steps += current_steps

if going_home:  # if going_home = True
    last_steps = int(input())
    total_steps += last_steps

difference = abs(total_steps - goal)

if total_steps < goal:
    print(f"{abs(difference)} more steps to reach goal.")
else:
    print(f"Goal reached! Good job!")
    print(f"{difference} steps over the goal!")

