# #-------------------------Exercício 1------------------------------
# n = int(input("Digite um número: "))
# p = int(input("Digite um número: "))
# i = 0
# v = 1

# for i in range (n, p * n, n):
#     print (n, " * ", v, " = ", i)
#     v += 1
# '''

# #------------------------Exercício 2-------------------------------
# n = 1
# soma = 0

# while n >= 0:
#     n = int(input("Digite um número: "))

#     if n < 0:
#         break

#     soma += n

# print(soma)

# #-----------------------Exercício 3 V1-------------------------------
# print("""
#     1 - HUGUINHO
#     2 - ZEZINHO
#     3 - LUIZINHO
#     0 - SAIR
# """)
# v = 1
# vh = 0
# vz = 0
# vl = 0

# while v != 0:
#     v = int(input("Digite um número: "))
#     if v == 1:
#         vh += 1
#     if v == 2:
#         vz += 1
#     if v == 3:
#         vl += 1

# print(f"""
#     1 - HUGUINHO:    {vh} VOTOS
#     2 - ZEZINHO:     {vz} VOTOS
#     3 - LUIZINHO:    {vl} VOTOS
# """)

# #-----------------------Exercício 3 V2-------------------------------
# print("""
#     1 - HUGUINHO
#     2 - ZEZINHO
#     3 - LUIZINHO
#     0 - SAIR
# """)
# v = 1
# vh = 0
# vz = 0
# vl = 0

# while v != 0:
#     v = int(input("Digite um número: "))
#     if v == 1:
#         vh += 1
#     elif v == 2:
#         vz += 1
#     elif v == 3:
#         vl += 1
#     else:
#         print("Número inválido. Digite um número correspondente a um candidato.")
#         continue
    
#     c = input("Deseja continuar, [S]im ou [N]ão? ")
#     if (c == "N" or c == "n"):
#         break

# print(f"""
#     1 - HUGUINHO:    {vh} VOTOS
#     2 - ZEZINHO:     {vz} VOTOS
#     3 - LUIZINHO:    {vl} VOTOS
# """)

# #-----------------------Exercício 3 V3-------------------------------
# print("""
#     1 - HUGUINHO
#     2 - ZEZINHO
#     3 - LUIZINHO
#     0 - SAIR
# """)
# v = 1
# vh = 0
# vz = 0
# vl = 0

# while v != 0:
#     v = int(input("Digite um número: "))
#     if v == 1:
#         vh += 1
#     elif v == 2:
#         vz += 1
#     elif v == 3:
#         vl += 1
#     else:
#         print("Número inválido. Digite um número correspondente a um candidato.")
#         continue

#     while True:
#         c = input("Deseja continuar? [S]im ou [N]ão: ")
#         if c.lower() == "n":
#             break
#         elif c.lower() != "s":
#             print("Resposta inválida. Digite [S]im ou [N]ão.")
#         else:
#             break
    
#     if c.lower() == "n":
#             break

# print(f"""
#     1 - HUGUINHO:    {vh} VOTOS
#     2 - ZEZINHO:     {vz} VOTOS
#     3 - LUIZINHO:    {vl} VOTOS
# """)