#   Стените имат следните размери:
# •	Предната и задната стена са квадрати със страна „x“
# 	на предната стена има правоъгълна врата с широчина 1.2м и височина 2м
# •	Страничните стени са правоъгълници със страни „x“ и „y“
# 	и на двете странични стени има по един квадратен прозорец със страна 1.5м

#   Покривът има следните размери:
# •	Два правоъгълника със страни „x“ и „y“
# •	Два равностранни триъгълника със страна „x“ и височина „h“
# Трябва да пресметнете площта на всички страни и площта на покрива, за да
# намерите колко литра от всяка боя ще са нужни.

#   ------------------- ESTO SON LOS MUROS ---------------------
casa_altura = float(input())
muro_lateral_altura = float(input())
muro_tejado_altura = float(input())

area_ventana = 1.5 * 1.5
area_puerta = 1.2 * 2

razhod__per_litre_green_paint = 3.4
razhod_per_litre_red_paint = 4.3

area_muro_lateral = casa_altura * muro_lateral_altura

total_area_muro_lateral = area_muro_lateral * 2 - (2 * area_ventana)
area_muro_trasero = casa_altura * casa_altura
area_muro_delantero = (casa_altura * casa_altura) - area_puerta
total_area_muro_trasero_y_delantero = area_muro_delantero + area_muro_trasero

area_total_muros = total_area_muro_lateral + total_area_muro_trasero_y_delantero
pintura_verde = area_total_muros / razhod__per_litre_green_paint
print(f"{pintura_verde:.2f}")

#   ------------------------ESTO ES EL TEJADO --------------------
area_tejado_lateral = (casa_altura * muro_lateral_altura) * 2
area_tejado_frontal_y_trasero = ((casa_altura * muro_tejado_altura) / 2) * 2
area_total_tejado = area_tejado_lateral + area_tejado_frontal_y_trasero
pintura_roja = area_total_tejado / razhod_per_litre_red_paint
print(f"{pintura_roja:.2f}")


