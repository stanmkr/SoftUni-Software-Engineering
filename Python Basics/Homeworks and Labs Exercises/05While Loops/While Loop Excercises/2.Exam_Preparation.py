count_fail_grade = int(input())
number_of_problems = 0
failed_grades = 0
total_grade_score = 0
last_problem = ""
while True:
    name_of_problem = input()
    if name_of_problem == "Enough":
         print(f"Average score: {average_score:.2f}")
         print(f"Number of problems: {number_of_problems}")
         print(f"Last problem: {last_problem}")
         break
    grade_for_the_problem = float(input())
    if grade_for_the_problem <= 4:
        failed_grades += 1
    if count_fail_grade == failed_grades:
        print(f"You need a break, {failed_grades} poor grades.")
        break
    number_of_problems += 1
    total_grade_score += grade_for_the_problem
    average_score = total_grade_score / number_of_problems
    last_problem = name_of_problem

#   VARIANT 2 ------------------------------------------------------------

count_threshold = int(input())
numbers_of_problems = 0
has_failed = False
failed_times = 0
total_grades_score = 0

while failed_times < count_threshold:
    name_of_problem = input()
    if name_of_problem == "Enough":
        has_failed = True
        break
    grade_for_the_problem = float(input())
    if grade_for_the_problem <= 4:
        failed_times += 1
    total_grades_score += grade_for_the_problem
    numbers_of_problems += 1
    last_problem = name_of_problem

if has_failed:
    print(f"Average score: {total_grades_score / numbers_of_problems:.2f}")
    print(f"Number of problems: {numbers_of_problems}")
    print(f"Last problem: {last_problem}")
else:
    print(f"You need a break, {failed_times} poor grades.")
