account_balance = 0
vnoska = input()

while vnoska != "NoMoreMoney":
    vnoska = float(vnoska)
    if vnoska < 0:
        print("Invalid operation!")
        vnoska = input("Please re-enter a valid vnoska, must be greater than 0: ")
        continue
    account_balance += float(vnoska)
    print(f"\nIncrease: {float(vnoska):.2f}")
    vnoska = input()

print(f"Total: {account_balance:.2f}")
