l1 = float(input("Lado 1: "))
l2 = float(input("Lado 2: "))
l3 = float(input("Lado 3: "))

if (l2 + l3 > l1) and (l1 + l3 > l2) and (l1 + l2 > l3):
    print("Forma um triângulo")
else:
    print("Não forma um triângulo")