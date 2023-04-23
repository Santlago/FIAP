#---------------------------------Exercício 1--------------------------------
# n1 = int(input("Digite um número: "))
# n2 = int(input("Digite um número: "))
# n3 = int(input("Digite um número: "))
# n4 = int(input("Digite um número: "))

# media = (n1 + n2 + n3 + n4) / 4

# print(media)

#---------------------------------Exercício 2--------------------------------
# km = float(input("Kilometragem: "))
# lg = float(input("Litros gastos: "))

# print(km / lg)

#---------------------------------Exercício 3--------------------------------
# p = float(input("Preço do maço de cigarros: "))
# qtMacos = int(input("Quantidade de maços por dia: "))
# tempo = int(input("Tempo em anos que a pessoa fuma: "))

# gasto = p * qtMacos * 365 * tempo

# print(gasto)


#---------------------------------Exercício 4--------------------------------
# valor = float(input("Digite o valor: "))

# a = 0
# b = 0
# c = 0

# if valor <= 10:
#     print("Valor inválido!!")
#     exit()

# while valor >= 50:
#     valor -= 50
#     a += 1
# while valor >= 20:
#     valor -= 20
#     b += 1
# while valor >= 10:
#     valor -= 10
#     c += 1

# print(f"""
#     50: {a}
#     20: {b}
#     10: {c}
# """)

#---------------------------------Exercício 5--------------------------------
# val = int(input("Digite o número de minutos: "))

# horas = val // 60
# min = val % 60

# print(f"{horas}h {min}m")

#---------------------------------Exercício 5--------------------------------
# seg = int(input("Digite a quantidade de segundos: "))

# horas = seg // 3600
# seg %= 3600
# min = seg // 60
# seg %= 60

# print(f"{horas}h {min}m {seg}s")