ano = int(input("Digite o ano: "))

if ano % 4 == 0:
    if (ano % 100 == 0) and (ano % 400 != 0):
        print("Não é bissexto")
    else:
        print("É ano bissexto")
else:
    print("Não é ano bissexto")