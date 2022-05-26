precio_fresas = float(input("El precio de las fresas: "))
platanos_cantidad = float(input("La cantidad de platanos en KG: "))
naranjas_cantidad = float(input("La cantidad de naranjas en KG: "))
frambuesas_cantidad = float(input("La cantidad de frambuesas en KG: "))
fresas_cantidad = float(input("La cantidad de fresas en KG: "))

precio_frambuesas = precio_fresas / 2

precio_naranjas = precio_frambuesas - (0.4 * precio_frambuesas)
precio_platanos = precio_frambuesas - (0.8 * precio_frambuesas)

total_frambuesas = precio_frambuesas * frambuesas_cantidad
total_fresas = precio_fresas * fresas_cantidad
total_platanos = precio_platanos * platanos_cantidad
total_naranjas = precio_naranjas * naranjas_cantidad
total = (total_naranjas + total_fresas + total_frambuesas + total_platanos)

print(total)
