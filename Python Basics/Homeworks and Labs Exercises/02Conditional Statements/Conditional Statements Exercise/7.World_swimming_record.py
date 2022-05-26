import math

world_record = float(input())   # "Рекордът в секунди:  "
distance = float(input())   # "Разстоянието в метри: "
time_per_meter = float(input())    # Времето в секунди, за което плува разстояние от 1 м:

time_swimming = distance * time_per_meter
delay_time = math.floor(distance / 15) * 12.5
total_time = time_swimming + delay_time    # В секунди

if total_time < world_record:
    print(f"Yes, he succeeded! The new world record is {total_time:.2f} seconds.")
else:
    needed_time = total_time - world_record
    print(f"No, he failed! He was {needed_time:.2f} seconds slower.")

