count_people_juri = int(input())
final_grade = 0
count_of_grades = 0
number_of_presentations = 0
command = input()

while command != "Finish":
    current_presentation = command
    number_of_presentations += 1
    current_presentation_grade = 0
    for presentation_grade in range(count_people_juri):
        grade = float(input())
        current_presentation_grade += grade
    sredna_ocenka = current_presentation_grade / count_people_juri
    final_grade += sredna_ocenka
    print(f"{current_presentation} - {sredna_ocenka:.2f}.")
    command = input()
sredena_ocenka_final = final_grade / number_of_presentations
print(f"Student's final assessment is {sredena_ocenka_final:.2f}.")