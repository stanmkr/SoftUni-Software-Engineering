yearly_tax = float(input())
basketball_trainers = yearly_tax * 0.6
basketball_equipment = basketball_trainers * 0.8
basketball_ball = basketball_equipment * 0.25
basketball_accessories = basketball_ball * 0.2

total = yearly_tax + basketball_trainers + basketball_equipment + basketball_ball + basketball_accessories
print(f"{total:.2f}")
