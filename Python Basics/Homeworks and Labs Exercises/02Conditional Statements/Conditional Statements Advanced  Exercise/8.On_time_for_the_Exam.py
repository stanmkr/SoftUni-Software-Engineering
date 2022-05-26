# Студент трябва да отиде на изпит в определен час (например в 9:30 часа). Той идва в изпитната зала в даден
# час на пристигане (например 9:40). Счита се, че студентът е дошъл навреме, ако е пристигнал в часа на
# изпита или до половин час преди това. Ако е пристигнал по-рано повече от 30 минути, той е подранил. Ако е
# дошъл след часа на изпита, той е закъснял. Напишете програма, която прочита време на изпит и време на
# пристигане и отпечатва дали студентът е дошъл навреме, дали е подранил или е закъснял и с колко часа или
# минути е подранил или закъснял.

# Вход
# От конзолата се четат 4 цели числа (по едно на ред), въведени от потребителя:
#  Първият ред съдържа час на изпита - цяло число от 0 до 23;
#  Вторият ред съдържа минута на изпита - цяло число от 0 до 59;
#  Третият ред съдържа час на пристигане - цяло число от 0 до 23;
#  Четвъртият ред съдържа минута на пристигане - цяло число от 0 до 59.

# Изход
# На първия ред отпечатайте:
#  Late;, ако студентът пристига по-късно от часа на изпита;
#  On time;, ако студентът пристига точно в часа на изпита или до 30 минути по-рано;
#  Early;, ако студентът пристига повече от 30 минути преди часа на изпита.
# Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
#  mm minutes before the start&quot; за идване по-рано с по-малко от час;
#  hh:mm hours before the start&quot; за подраняване с 1 час или повече. Минутите винаги печатайте с 2
# цифри, например "1:05”;
#  ;mm minutes after the start&quot; за закъснение под час;
#  ;hh:mm hours after the start&quot; за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри,
# например "1:03”.

hour_of_exam = int(input())
minute_of_exam = int(input())
hour_of_arriving = int(input())
minute_of_arriving = int(input())

time_of_exam = hour_of_exam * 60 + minute_of_exam
time_of_arriving = hour_of_arriving * 60 + minute_of_arriving

if time_of_arriving > time_of_exam:
    print("Late")
elif time_of_exam - 30 <= time_of_arriving <= time_of_exam:
    print("On time")
else:
    print("Early")
if time_of_exam - 60 < time_of_arriving < time_of_exam:
    print(f"{time_of_exam - time_of_arriving} minutes before the start")
elif time_of_arriving <= time_of_exam - 60:
    difference = time_of_exam - time_of_arriving
    hours = difference // 60
    minutes = difference % 60
    print(f"{hours}:{minutes:0>2d} hours before the start")
elif time_of_exam < time_of_arriving < time_of_exam + 60:
    print(f"{time_of_arriving - time_of_exam} minutes after the start")
elif time_of_arriving >= time_of_exam + 60:
    difference = time_of_arriving - time_of_exam
    hours = difference // 60
    minutes = difference % 60
    print(f"{hours}:{minutes:0>2d} hours after the start")
