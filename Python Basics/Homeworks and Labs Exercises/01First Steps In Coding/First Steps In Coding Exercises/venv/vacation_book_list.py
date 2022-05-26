pages = int(input("Put pages number: "))
pages_hour = int(input("Put pages per hour: "))
number_days = int(input("Put number of days: "))

time_per_book = pages / pages_hour
hours_needed = time_per_book / number_days
print (f"We need this amount of hours per day to read the pages:  {hours_needed}")
