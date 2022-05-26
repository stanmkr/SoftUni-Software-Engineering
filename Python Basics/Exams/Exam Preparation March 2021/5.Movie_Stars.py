budget = float(input())
command = input()
have_budget = True
while command != "ACTION":
    name_of_actor = command
    salary_of_actor = 0
    if len(name_of_actor) > 15:
        salary_of_actor = budget * 0.2
    else:
        salary_of_actor = float(input())
    budget -= salary_of_actor
    if budget <= 0:
        have_budget = False
        break
    command = input()

if have_budget:  # == TRUE
    print(f"We are left with {budget:.2f} leva.")
else:
    print(f"We need {abs(budget):.2f} leva for our actors.")


