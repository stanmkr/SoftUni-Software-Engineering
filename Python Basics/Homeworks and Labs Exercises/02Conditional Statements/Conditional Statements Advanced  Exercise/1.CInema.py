# В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони. Има три вида прожекции с
# билети на различни цени:
#  Premiere - премиерна прожекция, на цена 12.00 лева;
#  Normal - стандартна прожекция, на цена 7.50 лева;
#  Discount - прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

# Напишете програма, която чете тип прожекция (текст), брой редове и брой колони в залата (цели числа),
# въведени от потребителя, и изчислява общите приходи от билети при пълна зала. Резултатът да се отпечата
# във формат 2 знака след десетичната точка.

premiere = 12
normal = 7.5
discount = 5
price = 0

projection_type = input()
number_rows = int(input())
number_columns = int(input())

cinema_capacity = number_rows * number_columns

if projection_type == "Premiere":
    price = 12
    price *= cinema_capacity
elif projection_type == "Normal":
    price = 7.5
    price *= cinema_capacity
elif projection_type == "Discount":
    price = 5
    price *= cinema_capacity

if price != 0:
    print(f"{price:.2f} leva")
