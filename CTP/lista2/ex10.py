n1 = float(input("Primeiro número: "))
n2 = float(input("Segundo número: "))
n3 = float(input("Terceiro número: "))

maior = n1

if n2 > maior:
    maior = n2
if n3 > maior:
    maior = n3

print("O maior número é: ", maior)