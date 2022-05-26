number = int(input())
counter = 1
all_is_printed = False
for redove in range(1, number + 1):
    for coloni in range(1, redove + 1):
        print(counter, end=" ")
        counter += 1
        if counter > number:
            all_is_printed = True
            break
    if all_is_printed:  # all_is_printed = TRUE
        break
    print(chr(107))