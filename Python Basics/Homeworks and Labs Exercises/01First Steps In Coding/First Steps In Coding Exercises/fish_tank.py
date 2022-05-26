# Аквариум
# За рождения си ден Любомир получил аквариум с формата на паралелепипед. Трябва да се пресметне колко
# литра вода ще събира аквариума, ако се знае, че определен процент от вместимостта му е заета от пясък,
# растения, нагревател и помпа. Размерите му – дължина, широчина и височина в сантиметри ще бъдат
# въведени от конзолата.
# Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм 3 /.
# Да се напише програма, която изчислява литрите вода, които са необходими за напълването на аквариума.
# Вход
# От конзолата се четат 4 реда:
# 1. Дължина в см – цяло число
# 2. Широчина в см – цяло число
# 3. Височина в см – цяло число
# 4. Процент зает обем – реално число
# Изход
# Да се отпечата на конзолата едно число:
#  литрите вода, които ще събира аквариума.


cm_duljina = int(input("Дължина в см: "))
cm_shirochina = int(input("Shirochina v cm: "))
cm_visochina = int(input("Visochina v cm:"))
procent_zaet_obem = float(input("Procent zaet obem; "))

obem_akvarium = cm_duljina * cm_shirochina * cm_visochina

total_litri_sabira = obem_akvarium * 0.001
procent = procent_zaet_obem * 0.01

litri_neobhodimi = total_litri_sabira*(1 - procent)

print (f"Litrite voda koito sabira akvariuma sa: {litri_neobhodimi} ")

