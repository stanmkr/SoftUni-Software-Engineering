time_for_shooting = int(input())
number_of_scenes = int(input())
time_per_scene = int(input())

podgotovka_teren = time_for_shooting * 0.15
time_for_scenes = number_of_scenes * time_per_scene
total_time_shooting = podgotovka_teren + time_for_scenes
difference = abs(total_time_shooting - time_for_shooting)

if time_for_shooting >= total_time_shooting:
    print(f"You managed to finish the movie on time! You have {round(difference)} minutes left!")
else:
    print(f"Time is up! To complete the movie you need {round(difference)} minutes.")