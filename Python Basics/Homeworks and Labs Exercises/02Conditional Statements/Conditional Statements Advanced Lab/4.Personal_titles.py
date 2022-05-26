age = float(input())
genre = input()

# VARIANT NUMBER 1
if 16 <= age and genre == "m":
    print("Mr.")
elif 16 >= age and genre == "m":
    print("Master")
elif 16 <= age and genre == "f":
    print("Ms.")
elif 16 >= age and genre == "f":
    print("Miss")


#   VARIANT NUMBER 2
if genre == "m":
    if age >= 16:
        print("Mr.")
    else:
        print("Master")
if genre == "f":
    if age >= 16:
        print("Ms.")
    else:
        print("Miss")
