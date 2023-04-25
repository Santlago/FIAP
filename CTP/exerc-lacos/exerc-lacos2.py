# #---------------------Exercício 1-------------------
# n = int(input("Digite um número: "))
# i = 0

# for i in range (n, n * 11, n):
#     print(i)

#-----------------------Exercício 1-V2-------------------
n = int(input("Digite um número: "))
p = int(input("Digite um número: "))

i = 0
v = 1

for i in range (n, p, n):
    print(n, "*", v, "=", i)
    v += 1