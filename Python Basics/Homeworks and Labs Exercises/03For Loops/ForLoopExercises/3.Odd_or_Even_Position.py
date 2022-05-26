import sys

count_of_numbers = int(input())
chetna_summary = 0
nechetna_summary = 0
chetno_minimum = sys.maxsize
chetno_maximum = -sys.maxsize
nechetno_minimum = sys.maxsize
nechetno_maximum = -sys.maxsize

for position in range(1, count_of_numbers + 1):
    current_number = float(input())
    if position % 2 == 0:
        chetna_summary = chetna_summary + current_number
        if current_number > chetno_maximum:
            chetno_maximum = current_number
        if current_number < chetno_minimum:
            chetno_minimum = current_number
    elif position % 2 != 0:
        nechetna_summary = nechetna_summary + current_number
        if current_number > nechetno_maximum:
            nechetno_maximum = current_number
        elif current_number < nechetno_minimum:
            nechetno_minimum = current_number

print(f"OddSum={nechetna_summary:.2f},")
print(f"OddMin={chetno_minimum:.2f},")
print(f"OddMax={nechetno_maximum:.2f},")
print(f"EvenSum={chetna_summary:.2f},")
print(f"EvenMin={nechetno_minimum:.2f},")
print(f"EvenMax={chetno_maximum:.2f}")
