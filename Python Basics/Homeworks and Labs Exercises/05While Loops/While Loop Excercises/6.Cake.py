# cake_height = int(input())
# cake_width = int(input())
# cake_size = cake_height * cake_width
# cake_pieces = 0
# stop = False
#
# while cake_pieces <= cake_size:
#     command = input()
#     if command == "STOP":
#         stop = True
#         break
#     command = int(command)
#     cake_pieces += command
#
# cake_pieces_left = abs(cake_size - cake_pieces)
# if stop:    # Stop == True
#     print(f"{cake_pieces_left} pieces are left.")
# else:
#     print(f"No more cake left! You need {cake_pieces_left} pieces more.")




# variant 2 -------------------------- IVAN SHOPOV

cake_height = int(input())
cake_width = int(input())
cake_pieces = cake_height * cake_width
cake_is_over = False
command = input()

while command != "STOP":
    current_pieces = int(command)
    cake_pieces -= current_pieces
    if cake_pieces < 0:
        cake_is_over = True
        break
    command = input()
if cake_is_over:    # cake_is_over = TRUE
    print(f"No more cake left! You need {abs(cake_pieces)} pieces more.")
else:
    print(f"{cake_pieces} pieces are left.")
