metre_greening = float(input())  # metrite

metre = 7.61  # cenata v lv
final_metre = metre_greening * metre
discount = 0.18 * final_metre
final_metre = (metre_greening * metre) - discount


print(f"The final price is: {final_metre} lv.")
print(f"The discount is {discount} lv.")
