gradus = float(input())
if 26 <= gradus <= 35:
    print("Hot")
elif 20.1 <= gradus <= 25.9:
    print("Warm")
elif 15 <= gradus <= 20:
    print("Mild")
elif 12 <= gradus <= 14.9:
    print("Cool")
elif 5 <= gradus <= 11.9:
    print("Cold")
else:
    print("unknown")



