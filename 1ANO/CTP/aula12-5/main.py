#------------------------------VETOR-------------------------------------
# """
# Vetor: apenas dados homogeneos
# Lista: permite dados heterogenios, é mais flexível quanto ao tamanho
# """
# v = [34, 56, 78, 12, 13]

# # Exibe os valores do vetor
# def exibe_vetor(vet: list) -> None:
#     for i in range(0, len(vet), 1):
#         print(f"v[{i}] = [vet[i]]")

# # Esta função retorna o último elemento do vetor 
# def ultimo_elemento(vet: list) -> int:
#     return vet[len(vet) - 1]

# # Esta função soma os calores do vetor
# def soma_vetor(vet: list) -> int:
#     soma = 0
#     for i in range(0, len(vet), 1):
#         soma += vet[i]
#     return soma



#-------------------------------LISTA-----------------------------------
# O append sempre adiciona na última posição
# O insert sempre adiciona na posição desejada e empurra todos os outros CUIDADO!
# O pop remove elemento pelo índice, remove o último por padrão
# O remove remove pelo elemento pelo valor
# O index retorna o indice do elemento passado por parametro
# O count retorna a quantidade de elemntos que tem na lista
# Método: l.insert() -> Orientado ao objeto
# Função: len(vet) -> Estruturada

# l = list()
# l = []
# l = ["Edson", 56, 75.8, False]

# print(l[0], l[1])

# l = []

# l.append(45)
# l.append("Fiap")
# l.append(True)
# l.append(12.5)
# print(l)

# l = ["Edson", 56, 75.8, False, 75.8, 75.8]
# print(l)
# l.insert(1, "Novo")
# print(l)

# l.pop()
# print(l)
# l.pop(1)
# print(l)

# l.remove("Edson")
# print(l)

# x = l.index(56)
# print(x)

# qtd = l.count(75.8)
# print(qtd)