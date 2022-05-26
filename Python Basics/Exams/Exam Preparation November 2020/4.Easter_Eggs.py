number_of_painted_eggs = int(input())
red_eggs = 0
orange_eggs = 0
blue_eggs = 0
green_eggs = 0
max_eggs = 0
color_max_eggs = ""
for eggs in range(number_of_painted_eggs):
    color_of_egg = input()
    if color_of_egg == "red":
        red_eggs += 1
        if red_eggs > max_eggs:
            color_max_eggs = "red"
            max_eggs = red_eggs
    elif color_of_egg == "orange":
        orange_eggs += 1
        if orange_eggs > max_eggs:
            color_max_eggs = "orange"
            max_eggs = orange_eggs
    elif color_of_egg == "blue":
        blue_eggs += 1
        if blue_eggs > max_eggs:
            color_max_eggs = "blue"
            max_eggs = blue_eggs
    elif color_of_egg == "green":
        green_eggs += 1
        if green_eggs > max_eggs:
            color_max_eggs = "green"
            max_eggs = green_eggs

print(f"Red eggs: {red_eggs}")
print(f"Orange eggs: {orange_eggs}")
print(f"Blue eggs: {blue_eggs}")
print(f"Green eggs: {green_eggs}")
print(f"Max eggs: {max_eggs} -> {color_max_eggs}")
