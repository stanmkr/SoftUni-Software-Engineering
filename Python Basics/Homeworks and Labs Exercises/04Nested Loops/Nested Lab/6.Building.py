flours_number = int(input())
rooms_number = int(input())
for floor in range(flours_number, 0, -1):
    for room in range(0, rooms_number):
        if floor == flours_number:
            print(f"L{floor}{room}", end=" ")
        elif floor % 2 == 0:
            print(f"O{floor}{room}", end=" ")
        elif floor % 2 == 1:
            print(f"A{floor}{room}", end=" ")
    print("")