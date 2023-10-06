"""
# criei um dicionário

dados = {
    "nome" : "Edson de Oliveira",
    "idade" : 49,
    "email" : "edson@fiap.com.br"
}

print(dados)

# Formato de um arquivo Json

{
    "nome" : "Edson de Oliveira",
    "idade" : 49,
    "email" : "edson@fiap.com.br"
},
{
    "nome" : "Maria Silva",
    "idade" : 45,
    "email" : "maria@fiap.com.br"
},
{
    "nome" : "Marcelo de Oliveira",
    "idade" : 22,
    "email" : "marcelo@fiap.com.br"
}
"""

pessoas = {
    'pessoa1' : {
        "nome" : "Edson de Oliveira",
        "idade" : 49,
        "email" : "edson@fiap.com.br"
    },
    'pessoa2' : {
        "nome" : "Maria Silva",
        "idade" : 45,
        "email" : "maria@fiap.com.br"
    },
    'pessoa3' : {
        "nome" : "Marcelo de Oliveira",
        "idade" : 22,
        "email" : "marcelo@fiap.com.br"
    }
}

# importando a biblioteca json
import json

# Exibindo o dicionário
print(f"-----------------------------\nExibindo dicionário\n{pessoas}\n-----------------------------")
pessoas_json = json.dumps(pessoas, indent=4)
print(f"-----------------------------\nExibindo JSON\n{pessoas_json}\n-----------------------------")

# abrindo um arquivo json para gravação
with open("arquivo.json", "w+", encoding="utf-8") as file:
    file.write(pessoas_json)

# lendo u marquivo em um formato json
with open("arquivo.json", "r", encoding="utf-8") as file:
    file.seek(0)
    pessoas_json = file.read()
    pessoas = json.loads(pessoas_json)

# exibição "apresentável" para o usuário
for k, v in pessoas.items():
    print(f"Registro.....: {k}")
    for k1, v1 in v.items():
        print("\t" + k1 + ":" + str(v1))