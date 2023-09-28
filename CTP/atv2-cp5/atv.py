def validar_email(email):
    # Verifica se o email começa com letra
    if not email[0] in "abcdefghijklmnopqrstuvwxyz":
        return False

    # Verifica se não há caracteres especiais no nome e sobrenome do email
    def tem_caractere_especial(email):
        separado = email.split('@')
        nome = separado[0]
        caracteres_especiais = "!#$%^&*()+=[]{};:'\"<>/?\\|"
        for elem in nome:
            if elem in caracteres_especiais:
                return True

    if tem_caractere_especial('edsonoliveira@fiap.com.br'):
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
    if email.endswith('.'):
        return False

    # Verifica se há um ou dois pontos no sobrenome do email
    parts = email.split('@')
    if parts[1].count('.') not in [1, 2]:
        return False

    return True

while True:
    email = input("Digite um endereço de e-mail: ")
    if validar_email(email):
        print("Email correto")
        break
    else:
        print("Email incorreto. Tente novamente.")