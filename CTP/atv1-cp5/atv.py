# Procedimento que preenche um registro
def preenche_registro(t: list, reg: dict) -> None:
    # permite ao usuário preencher o dicionário
    print("PREENCHENDO O REGISTRO")
    reg['instagram'] = input("Instagram...........: ")
    reg['nome'] = input("Nome..........: ")
    reg['celular'] = input("Celular.......: ")
    # cria uma cópia do ponteiro
    t.append(reg.copy())

# procedimento que exibe um registro especifico
def exibe_registro(t: list, i: int) -> None:
    print(f"REGISTRO {i}:")
    print("Instagram.......:" + t[i]['instagram'])
    print("Nome......:" + t[i]['nome'])
    print("Celular...:" + t[i]['celular'])
    print()

# Procedimento que exibe todos os registros da tabela
def exibe_tabela(t: list) -> None:
    qtd_registros = len(t)
    for indice in range(qtd_registros):
        exibe_registro(t, indice)

# Procedimento que preenche múltiplos registros
def preenche_mult_registros(t: list, reg: dict) -> None:
    while True:
        # permite ao usuário preencher o dicionário
        print("PREENCHENDO O REGISTRO")
        var = input("Instagram...........: ")
        if var == '.':
            break
        reg['instagram'] = var
        reg['nome'] = input("Nome..........: ")
        reg['celular'] = input("Celular.......: ")
        # cria uma cópia do ponteiro
        t.append(reg.copy())

# Lista de registros
registros = []


while True:
    print("""
    -------------------------------
    0 - SAIR
    1 - CADASTRAR UM CONTATO
    2 - EXIBIR OS CONTATOS CADASTRADOS
    3 - PREENCHA REGISTROS
    -------------------------------
          """)
    opcao = input("Digite uma opção: ")
    match opcao:
        case '1':
            reg = {}
            preenche_registro(registros, reg)
        case '2':
            exibe_tabela(registros)
        case '3':
            reg = {}
            preenche_mult_registros(registros, reg)
        case '0':
            break
        case _:
            print("Opção inválida")
