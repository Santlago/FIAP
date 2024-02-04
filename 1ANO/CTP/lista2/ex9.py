av1 = float(input("Nota 1: "))
av2 = float(input("Nota 2: "))
av3 = float(input("Nota 3: "))

menor = av1

if av2 < menor:
    menor = av2
if av3 < menor:
    menor = av3

media = (av1 + av2 + av3 - menor) / 3

if media < 6:
    print(f"Média: {media:.2f} - você está reprovado")
if media >= 6:
    print(f"Média: {media:.2f} - você está aprovado")