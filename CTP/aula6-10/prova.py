perguntas = {
    'Pergunta 1':
    {
        "pergunta": "Quanto é 2 + 2",
        "respostas":
        {
            'a': '1',
            'b': '4',
            'c': '8',
        },
        'resposta_certa': 'b',
    },

    'Pergunta 2':
    {
        "pergunta": "Quanto é 2 + 5",
        "respostas":
        {
            'a': '7',
            'b': '45',
            'c': '2',
        },
        'resposta_certa': 'a',
    }

}
import os
os.system("cls")

respostas_certas = 0
for pergunta, dados_pergunta in perguntas.items():
    print(f"{pergunta}: \n\t{dados_pergunta['pergunta']}")
    #exibir as alternativa
    print("Respostas:")
    for resposta, dados_resposta in dados_pergunta['respostas'].items():
        print(f"\t\t({resposta}) {dados_resposta}")
        
    print ()

    resposta_usuario = input("Sua resposta: ")

    # verifica se acretou ou não
    if resposta_usuario == dados_pergunta['resposta_certa']:
        print("Resposta correta =)")
        respostas_certas += 1
    else:
        print("Resposta incorreta =,(")

    print()

quantidade_perguntas = (len(perguntas))
porcentagem_acerto = respostas_certas / quantidade_perguntas * 100
print("-"*40)
print(f"Voce acertou {respostas_certas} pergunta(s)")
print(f"A sua porcentagem de acerto foi {porcentagem_acerto}%.")

