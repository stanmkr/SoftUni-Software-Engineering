text = input()
sum = 0
for i in text:
    if i == "a":
        sum = sum + 1
    elif i == "e":
        sum += 2
    elif i == "i":
        sum += 3
    elif i == "o":
        sum += 4
    elif i == "u":
        sum += 5
print (sum)