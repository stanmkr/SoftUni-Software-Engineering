import math

type = str(input("Tell me the type: "))
if type == "square":
    strana = float(input("Tell me stranata: "))
    area = strana * strana
    print(f"{area:.3f}")
elif type == "rectangle":
    strana1 = float(input("Tell me stranata: "))
    strana2 = float(input("Tell me stranata2: "))
    area = strana1 * strana2
    print(f"{area:.3f}")
elif type == "circle":
    radius = float(input("Tell me radioto: "))
    area = math.pow(radius, 2) * math.pi
    print(f"{area:.3f}")
elif type == "triangle":
    duljina = float(input("Tell me duljinata"))
    duljina_visochina = float(input("Tell me visochinata:  "))
    area = (duljina * duljina_visochina) / 2
    print(f"{area:.3f}")
else:
    print("Error, wrong chose")
