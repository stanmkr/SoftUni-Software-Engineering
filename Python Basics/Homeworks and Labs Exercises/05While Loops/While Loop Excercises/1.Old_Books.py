ani_favourite_book = input()
count_of_books = 0

while True:
    book = input()
    if book == ani_favourite_book:
        print(f"You checked {count_of_books} books and found it.")
        break
    if book == "No More Books":
        print(f"The book you search is not here!\nYou checked {count_of_books} books.")
        break
    count_of_books += +1

