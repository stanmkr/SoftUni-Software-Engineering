hours = int(input())
minutes = int(input())

minutes = minutes + 15
hours = hours + ( minutes // 60 )
minutes = minutes % 60

if hours > 23:
    hours = hours % 24

if minutes <= 9:
    print(f"{hours}:0{minutes}")
else:
    print(f"{hours}:{minutes}")
