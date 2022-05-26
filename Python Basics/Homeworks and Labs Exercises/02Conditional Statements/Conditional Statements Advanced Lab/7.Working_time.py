hour = float(input())
day_of_the_week = input()

if 10 <= hour <= 18:
    if day_of_the_week == "Monday" or day_of_the_week == "Tuesday" or day_of_the_week == "Wednesday" or day_of_the_week == "Thursday" or day_of_the_week == "Friday" or day_of_the_week == "Saturday":
        print("open")
    else:
        print("closed")

else:
    print("closed")