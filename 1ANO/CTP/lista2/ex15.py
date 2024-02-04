n1 = float(input("Digite o primeiro número: "))
n2 = float(input("Digite o segundo número: "))
n3 = float(input("Digite o terceiro número: "))

if n1 == n2 and n1 == n3:
    print("3 números iguais")
elif n1 == n2 or n1 == n3 or n2 == n3:
    print("2 números iguais")
else:
    print("3 números diferentes")