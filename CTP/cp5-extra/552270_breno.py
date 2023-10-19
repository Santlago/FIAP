# Breno Lemes Santiago - RM: 552270

# Abrindo o arquivo dados.txt
with open("dados.txt", "r") as arq:
    # Criando arrays para colocar os logins e emails
    logins = []
    emails = []

    # Lendo cada linha do dados.txt
    for linha in arq:
        # Dividindo login e email pela vírgula
        partes = linha.strip().split(", ")
        # Adicionando os logins e emails nas arrays criadas
        if len(partes) == 2:
            login, email = partes
            logins.append(login)
            emails.append(email)

# Colocando os dados da array logins no login.txt
with open("login.txt", "w") as arq:
    for login in logins:
        arq.write(login + "\n")

# Colocando os dados da array e-mails no email.txt
with open("email.txt", "w") as arq:
    for email in emails:
        arq.write(email + "\n")

# Mostrando os logins do login.txt
with open("login.txt", "r", encoding="utf-8") as arq:
    print(f"login.txt \n{arq.read()}")

# Mostrando os emails do email.txt
with open("email.txt", "r", encoding="utf-8") as arq:
    print(f"email.txt \n{arq.read()}")