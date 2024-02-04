# Breno Lemes Santiago - RM: 552270

# Exibe separado o nome do sobrenome
def exibeSep(n: str) -> None:
    if n != '':
        nSep = n.split()
        lName = (' '.join(nSep[1:len(nSep)]))
        print(f'Nome: {nSep[0]}')
        print(f'Sobrenome: {lName}')
    else:
        print('Nome está vazio')



# Conta quantas palavras há no nome
def contaPalavras(n: str) -> None:
    f = n.split()
    qtd = 0
    for elem in f:
        qtd += 1
    print(f"O nome {n} tem {qtd} palavras")



# Exibir em formato de bibligafia
def nomeBib(n: str) -> None:
    f = n.split()
    nome = f[-1]
    novo_nome = ''
    for elem in nome:
        novo_nome += elem.upper()
    restoNome = ' '.join(f[0:-1])
    print(f"{novo_nome}, {restoNome}")



#-----------------------------MENU PINCIPAL------------------------
temNome = False
while True:
    print("""
        MENU
        
        0 - SAIR
        1 - Digite um nome completo
        2 - Exibe separado o nomne do sobrenome
        3 - Conta quantas palavras há no nome completo
        4 - Exibir em formao de bibliografia
    """)
    opcao = input("Escolha: ")
    match opcao:
        case '1':
            nome = input("Digite um nome completo: ")
            temNome = True
        case '2':
            if (temNome):
                exibeSep(nome)
            else:
                print('Digite um nome!') 
        case '3':
            if (temNome):
                contaPalavras(nome)
            else:
                print('Digite um nome!') 
        case '4':
            if (temNome):
                nomeBib(nome)
            else:
                print('Digite um nome!') 
        case '0':
            break
        case _:
            print("Opção inválida")