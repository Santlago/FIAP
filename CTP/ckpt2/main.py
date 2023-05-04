#Nome: Breno Lemes Santiago - RM: 552270
#Nome: Daniel dos Santos Araujo Faria - RM: 99067   

print("Digite os nomes dos candidatos: ")
c1 = input("1: ")
c2 = input("2: ")
c3 = input("3: ")

print(f"""
    CANDIDATOS
    
    1 - {c1}
    2 - {c2}
    3 - {c3}
    0 - FIM DA VOTAÇÂO
""")

vt_1 = 0
vt_2 = 0
vt_3 = 0
vt_nulo = 0
total_votos = 0

voto = 1

while True:
    voto = int(input("VOTO: "))
    if voto == 1:
        vt_1 += 1
    elif voto == 2:
        vt_2 += 1
    elif voto == 3:
        vt_3 += 1
    elif voto == 0:
        break
    else:
        vt_nulo += 1
    total_votos += 1

def calculaPorcentagem(var: int) -> float:
    return var / total_votos * 100 

if total_votos > 0:
    prc_c1 = calculaPorcentagem(vt_1)
    prc_c2 = calculaPorcentagem(vt_2)
    prc_c3 = calculaPorcentagem(vt_3)
    prc_nulo = calculaPorcentagem(vt_nulo)
else:
    prc_c1 = prc_c2 = prc_c3 = prc_nulo = 0
    

print(f"""
    CANDIDATOS
    TOTAL DE VOTOS: {total_votos}
    1 - {c1} -> {vt_1} votos -> {prc_c1:.1f}%
    2 - {c2} -> {vt_2} votos -> {prc_c2:.1f}%
    3 - {c3} -> {vt_3} votos -> {prc_c3:.1f}%
        NULOS -> {vt_nulo} votos -> {prc_nulo:.1f}%
""")
