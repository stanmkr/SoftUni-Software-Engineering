# 10. Четна / нечетна сума

# Да се напише програма, която чете n-на брой цели числа, подадени от потребителя, и проверява дали
# сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции. При равенство да се
# отпечатат два реда: &quot;Yes&quot; и на нов ред &quot;Sum = &quot; + сумата; иначе да се отпечата &quot;No&quot; и на нов ред &quot;Diff = &quot; +
# разликата. Разликата се изчислява по абсолютна стойност.





n = int(input())
summary_chetno = 0
summary_nechetno = 0
for i in range(1, n + 1):
    number = int(input())
    if i % 2 == 0:
        summary_chetno = summary_chetno + number
    elif i % 2 != 0:
        summary_nechetno = summary_nechetno + number

if summary_chetno == summary_nechetno:
    print(f"Yes\nSum = {summary_chetno}")
else:
    difference = abs(summary_chetno - summary_nechetno)
    print(f"No\nDiff = {difference}")
