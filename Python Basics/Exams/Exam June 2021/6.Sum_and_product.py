number = int(input())
found_number = False
for n in range(1, number + 1):
    for a in range(1, 10):
        for b in range(9, a - 1, -1):
            for c in range(0, 10):
                for d in range(9, c - 1, -1):
                    if (a + b + c + d) == (a * b * c * d) and number % 10 == 5:
                        found_number = True
                        print(f"{a}{b}{c}{d}")
                        quit()
                    if (a * b * c * d) // (a + b + c + d) == 3 and number % 3 == 0:
                        found_number = True
                        print(f"{d}{c}{b}{a}")
                        quit()

if not found_number:
    print(f"Nothing found")

