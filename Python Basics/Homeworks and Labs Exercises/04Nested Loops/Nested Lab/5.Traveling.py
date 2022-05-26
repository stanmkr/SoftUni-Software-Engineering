destination = input()
while destination != "End":
    budget = float(input())
    current_budget = 0
    while current_budget < budget:
        current_budget += float(input())
    else:
        print(f"Going to {destination}!")

    destination = input()


