'''
#--------------------Exercício 1---------------------------
n = 0
vpar = 0
vimpar = 0

for n in range (1, 10 + 1, 1):
    v = int(input("Digite um número: "))
    if (v % 2 == 0):
        vpar += 1
    else:
        vimpar += 1

print(f"""
    Números pares: {vpar}
    Números ímpares: {vimpar}
""")
'''



'''
    #--------------------------Exercício 2--------------------------
n = 1
npos = nneg = 0

while n != 0:
    n = int(input("Digite um número: "))
    if n < 0:
        nneg += 1
    else:
        npos += 1

print(f"""
    Números positivos: {npos}
    Números negativos: {nneg}
""")
'''