def validar_email(email):
    # Verifica se o email começa com letra
    if not email[0].lower() in "abcdefghijklmnopqrstuvwxyz":
        return False

    # Verifica se não há caracteres especiais no nome e sobrenome do email
    separado = email.split('@')
    nome = separado[0]
    caracteres_especiais = "!#$%^&*()+=[]{};:'\"<>/?\\|_."
    for elem in nome:
        if elem in caracteres_especiais:
            return False


    # Verifica se há somente um arroba
    if email.count('@') != 1:
        return False

    # Verifica se o ponto não está na sequência do arroba
    if '@.' in email:
        return False

    # Verifica se o ponto não está junto de outro ponto
    if '..' in email:
        return False

    # Verifica se o ponto não está no final do email
    if email[-1] == '.':
        return False

    # Verifica se há um ou dois pontos no sobrenome do email
    parte = email.split('@')
    if parte[1].count('.') not in [1, 2]:
        return False

    return True

while True:
    email = input("Digite um endereço de e-mail: ")
    if validar_email(email):
        arq = open("RM552270.txt", "w", encoding="utf-8")
        arq.write(email)
        print("Gravado com sucesso!")
        break
    else:
        print("E-mail inválido, digite outro correto!")