import math

radius_circle = float(input())

circle_area = math.pi * (pow(radius_circle, 2))
circle_perimeter = 2 * math.pi * radius_circle
print(f"{circle_area:.2f}")
print(f"{circle_perimeter:.2f}")


