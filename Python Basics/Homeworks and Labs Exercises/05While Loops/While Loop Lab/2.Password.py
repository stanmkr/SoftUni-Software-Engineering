username = input()
password = input()
text = input()

while text != password:
    text = input()
print(f"Welcome {username}!")