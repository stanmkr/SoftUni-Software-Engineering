number_ot_the_groups = int(input())
vruh = ""
total_sum_all_group = 0
people_musala = 0
people_monblan = 0
people_kalimandjari = 0
people_k2 = 0
people_everest = 0
for i in range(1, number_ot_the_groups + 1):
    number_of_people_in_group = int(input())
    total_sum_all_group += number_of_people_in_group
    if number_of_people_in_group <= 5:
        people_musala += number_of_people_in_group
    elif number_of_people_in_group <= 12:
        people_monblan += number_of_people_in_group
    elif number_of_people_in_group <= 25:
        people_kalimandjari += number_of_people_in_group
    elif number_of_people_in_group <= 40:
        people_k2 += number_of_people_in_group
    else:
        people_everest += number_of_people_in_group
percent_musala = (people_musala / total_sum_all_group) * 100
percent_monblan = (people_monblan / total_sum_all_group) * 100
percent_kalimandjaro = (people_kalimandjari / total_sum_all_group) * 100
percent_k2 = (people_k2 / total_sum_all_group) * 100
percent_everest = (people_everest / total_sum_all_group) * 100

print(f"{percent_musala:.2f}%")
print(f"{percent_monblan:.2f}%")
print(f"{percent_kalimandjaro:.2f}%")
print(f"{percent_k2:.2f}%")
print(f"{percent_everest:.2f}%")
