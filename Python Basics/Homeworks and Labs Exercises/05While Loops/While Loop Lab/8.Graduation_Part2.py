students_name = input()
current_class = 1
number_of_grades = 0
sum_of_grades = 0
fails = 0

while current_class <= 12:
    grade = float(input())
    if grade >= 4:
        current_class += 1
    else:
        fails += 1
    if fails == 2:
        break
    number_of_grades += 1
    sum_of_grades += grade
    average_grade = sum_of_grades / number_of_grades
    
if fails < 2:
    print(f"{students_name} graduated. Average grade: {average_grade:.2f}")
else:
    print(f"{students_name} has been excluded at {current_class} grade")