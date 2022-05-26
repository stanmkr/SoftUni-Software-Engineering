needed_money = float(input())
owned_money = float(input())
days = 0
days_spending = 0
spending_too_many_days = False

while owned_money < needed_money:
    action = input()
    money = float(input())
    days += 1
    if action == "save":
        owned_money += money
        days_spending = 0
    elif action == "spend":
        owned_money -= money
        if owned_money < 0:
            owned_money = 0
        days_spending += 1
        if days_spending == 5:
            spending_too_many_days = True
            break

if spending_too_many_days:
    print(f"You can't save the money.")
    print(f"{days}")
else:
    print(f"You saved the money for {days} days.")

