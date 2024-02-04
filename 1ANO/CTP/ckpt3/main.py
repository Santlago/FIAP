'''
Nome: Breno Lemes Santiago - RM: 552270
Nome: Daniel dos Santos Araujo Faria - RM: 99067
'''

#---------------------Subalgoritmos----------------
def opcao1():
    n1 = int(input("Digite o primeiro número: "))
    n2 = int(input("Digite o segundo número: "))
    i = 1
    if n1 < n2:
        print(f"[ ", end="")
        for i in range(n1, n2 + 1, i):
            print(f"{i} ", end="")
        print(f"] ", end="")
    else:
        print(f"[ ", end="")
        for i in range(n2, n1 + 1, i):
            print(f"{i} ", end="")
        print(f"] ", end="")

def opcao2():
    n1 = int(input("Digite o primeiro número: "))
    n2 = int(input("Digite o segundo número: "))
    af = input("][ - Aberto ou [] Fechado? ")
    if af == "[]":
        i = 1
        if n1 < n2:
            print("[ ", end="")
            for i in range(n1, n2 + 1, i):
                print(f"{i} ", end="")
            print("]", end="")
        else:
            print("[ ", end="")
            for i in range(n2, n1 + 1, i):
                print(f"{i} ", end="")
            print("]", end="")
    elif af == "][":
        i = 1
        if n1 < n2:
            print("] ", end="")
            for i in range(n1 + 1, n2, i):
                print(f"{i} ", end="")
            print("[", end="")
        else:
            print("] ", end="")
            for i in range(n2 + 1, n1, i):
                print(f"{i} ", end="")
            print("[", end="")
    else:
        print("Opcao inválida: ")

def opcao3():
    n1 = int(input("Digite o primeiro número: "))
    n2 = int(input("Digite o segundo número: "))
    i = 1
    if n1 < n2:
        print(f"[ ", end="")
        for i in range(n1, n2 + 1, i):
            print(f"{i} ", end="")
        print(f"] ", end="")

    else:
        print(f"[ ", end="")
        for i in range(n1, n2 - 1, -i):
            print(f"{i} ", end="")
        print(f"] ", end="")


#----------------------Codigo-----------------------
print(f""""
    MENU
    1 - Intervalo
    2 - Intervalo Aberto e Fechado
    3 - Intervalo em ordem crescente ou decrescente
    0 - Sair
""")

i = 1
op1 = 0
op2 = 0
op3 = 0

while i != 0:
    digito = int(input("\nEscolha: "))
    match digito:
        case 1:
            print("\nINTERVALO\n")
            opcao1()
            op1 += 1
        case 2:
            print("\nINTERVALO - Aberto e Fechado\n")
            opcao2()
            op2 += 1
        case 3:
            print("\nINTERVALO - Em ordem crescente ou decrescente\n")
            opcao3()
            op3 += 1
        case 0:
            break
        case _:
            print("Opção inválida! ")

print(f"1 - Intervalo - {op1} vezes")
print(f"2 - Intervalo Aberto e Fechado - {op2} vezes")
print(f"3 - Intervalo em ordem crescente ou decrescente - {op3} vezes")