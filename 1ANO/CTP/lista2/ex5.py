n1 = float(input("Digite a primeira nota: "))
n2 = float(input("Digite a segunda nota: "))

media = (n1 + n2) / 2

if media < 5:
    print("Você está reprovado")
else:
    print("Você está aprovado")