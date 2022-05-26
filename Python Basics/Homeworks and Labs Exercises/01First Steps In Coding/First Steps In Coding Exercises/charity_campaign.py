torta = float(45)
gofreta = float(5.80)
palachinka = float(3.20)

dni_campania = int(input("Tell me the days the campaign will be open: "))
broi_sladkari = int(input("Tell me the numbers of chef's: "))
broi_torti = int(input("Tell me the number of the tortite: "))
broi_gofreti = int(input("Tell me the number of the gofreti: "))
broi_palachinki = int(input("Tell me the number of the palachinkite: "))

suma_torti = float(torta * broi_torti)
suma_gofreti = float(gofreta * broi_gofreti)
suma_palachinki = float(palachinka * broi_palachinki)
total_suma = (suma_torti + suma_palachinki + suma_gofreti) * broi_sladkari



total_suma = total_suma * dni_campania
total_suma = total_suma - (total_suma / 8)

print (f"{total_suma:.2f}")



