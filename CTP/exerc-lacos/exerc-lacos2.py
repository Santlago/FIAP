# #---------------------Exercício 1-------------------
# n = int(input("Digite um número: "))
# i = 0

# for i in range (n, n * 11, n):
#     print(i)


# -----------------------Exercício 1-V2-------------------
# n = int(input("Digite um número: "))

# i = 0
# v = 1

# for i in range (n, n * 11, n):
#     print(n, "*", v, "=", i)
#     v += 1


#-----------------------Exercício 1-V3-------------------
# n = int(input("Digite um número: "))
# p = int(input("Digite um número: "))

# i = 0
# v = 1

# for i in range (n, p * (n + 1), n):
#     print(n, "*", v, "=", i)
#     v += 1


#-----------------------Exercício 2-V1-------------------
# n = 1
# soma = 0

# while n != 0:
#     n = int(input("Digite um número: "))
#     soma += n
    
# print(soma)

#-----------------------Exercício 2-V2-------------------
# n = 1
# soma = 0

# while n > 0:
#     n = int(input("Digite um número: "))
#     soma += n
    
# print(soma)

#-----------------------Exercício 2-V3-------------------
# n = 1
# soma = 0

# while n > 0:
#     n = int(input("Digite um número: "))
#     if n > 0:
#         soma += n
    
# print(soma)

#-----------------------Exercício 3-V1-------------------
# hg = 0
# zz = 0
# lz = 0

# voto = 1

# while voto != 0:
#     voto = int(input("Digite um número: "))
#     if voto == 1:
#         hg += 1
#     elif voto == 2:
#         zz += 1
#     elif voto == 3:
#         lz += 1
#     elif voto == 0:
#         break
#     else:
#         print("Número inválido! ")
        
# print(f"""
#       HUGUINHO          {hg} votos
#       ZEZINHO           {zz} votos
#       LUIZINHO          {lz} votos
#       """)

#-----------------------Exercício 3-V2-------------------
# hg = 0
# zz = 0
# lz = 0
# qr = "s"

# voto = 1

# while voto != 0:
#     if qr.lower() == "s":
#         voto = int(input("Digite um número: "))
#         if voto == 1:
#             hg += 1
#         elif voto == 2:
#             zz += 1
#         elif voto == 3:
#             lz += 1
#         elif voto == 0:
#             break
#         else:
#             print("Número inválido! ")
#         qr = input("Quer continuar? ")
#     else:
#         break
        
# print(f"""
#       HUGUINHO          {hg} votos
#       ZEZINHO           {zz} votos
#       LUIZINHO          {lz} votos
#       """)

#-----------------------Exercício 3-V3-------------------
# hg = 0
# zz = 0
# lz = 0
# qr = "s"

# voto = 1

# while voto != 0:
#     if qr.lower() == "s":
#         voto = int(input("Digite um número: "))
#         if voto == 1:
#             hg += 1
#         elif voto == 2:
#             zz += 1
#         elif voto == 3:
#             lz += 1
#         elif voto == 0:
#             break
#         else:
#             print("Número inválido! ")
#         qr = input("Quer continuar? ")
#     elif qr.lower() == "n":
#         break
#     else:
#         print("erro")
#         qr = input("Quer continuar? ")
        
# print(f"""
#       HUGUINHO          {hg} votos
#       ZEZINHO           {zz} votos
#       LUIZINHO          {lz} votos
#       """)