import math

depozit_suma = float(input())
srok_depozit = int(input())
lihva_anual = float(input())

lihva = depozit_suma * (lihva_anual)/100
lihva_moth = lihva / 12
total_suma = depozit_suma + srok_depozit * lihva_moth


print (total_suma)

print (math.floor(total_suma))



