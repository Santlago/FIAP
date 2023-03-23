l1 = float(input("Lado 1: "))
l2 = float(input("Lado 2: "))
l3 = float(input("Lado 3: "))

if (l1 < (l2 + l3)) and (l2 < (l1 + l3)) and (l3 < (l1 + l2)):
    if l1 == l2:
        if l2 == l3:
            print("Triângulo equilátero")
        else:
            print("Triângulo isóceles")
    elif l2 == l3:
        if l3 == l1:
            print("Triângulo equilátero")
        else:
            print("Triângulo isóceles")
    elif l3 == l1:
        if l1 == l2:
            print("Triângulo equilátero")
        else:
            print("Triângulo isóceles")
    else:
        print("Triângulo escaleno")
else:
    print("Não forma um triângulo")
