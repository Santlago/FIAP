n1 = float(input("Digite a primeira nota: "))
n2 = float(input("Digite a segunda nota: "))

if (n1 >= 0 and n1 <= 10) and (n2 >= 0 and n2 <= 10):
    media = (n1 + n2) / 2
    if media < 5:
        print("Você está reprovado")
    else:
        print("Você está aprovado")
else:
    print("Notas inválidas")