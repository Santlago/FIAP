# Aula 28/04

## Subalgoritmos (função e procedimento)

def é como se fosse método em POO, você define uma função e depois chama ela podendo passar alguns parâmetros<br>

Procedimento: Um conjunto de comandos com a mesma finalidade que não retorna valor ao programa principal<br>

```
import math

# ---------------SUBALGORITMOS-------------
# PROCEDIMENTO
# Sintaxe:
# def <nome_subalgoritmo> ([parametros]) -> [retorno] o que está entre [] é opcional
# <corpo do subalgoritmo>
def saudacao1() -> None:
    print("Bom dia, Edson! ")

def saudacao2(nome: str) -> None:
    print(f"Bom dia, {nome}! ")
    
def saudacao3(nome: str, hora: int) -> None:
    if hora < 12:
        msg = "Bom dia"
    elif hora < 18:
        msg = "Boa tarde"
    else:
        msg = "Boa noite"
    print(f"{msg}, {nome}!")

# FUNÇÂO
def pi() -> float:
    return 3.14159

def area_circunferencia(r: float) -> float:
    return pi() * r ** 2

def raiz_quadrada(n: float) -> float:
    resposta = n ** (1/2)
    return resposta

# *************************************
# PROGRAMA PRINCIPAL
# *************************************

# ---------EXECUÇÃO DOS PROCEDIMENTOS
saudacao1()
saudacao2("Breno")
saudacao3("Breno", 10)

# ---------EXECUÇÃO DAS FUNÇÕES
r = 5
print(f"Area da circunferência com raio {r} é {area_circunferencia(r)}")

# já ta pronto
print(math.sqrt(25))

# construído no código
print(raiz_quadrada(25))
```

Exercícios:
```
'''
Exercícios:
PROCEDIMENTO    
1. Dado um número por parâmetro, exibir o próximo.
    prox_num(6)
    >>> 7

2. Dado um numero por parâmetro, exibir o próximo múltipo de 5.
    prox_mult_5(12)
    >>> 15

3. Dado um número por parâmetro, exibir os dez primeiros múltiplos deste número.
    dez_mult_n(12)
    >>> 2 4 6 8 10 12 14 16 20

4. Dados dois números por parâmetro, exibir os números do intervalo
    intervalo(5, 17)
    >>> 5 6  7 8 9 10 11 12 13 14 15 16 17
    
FUNÇÃO
5. Transformar os procedimentos 1 e 2 em função.

6. Dados 3 valores por parâmetro, retornar o valor de delta
    x = delta(1, 2, 3)
    >>> x valera -8
    
7. Dado um número por parâmetro, calcular o seu fatorial.
    x = fatorial(4)
    >>> 4 * 3 * 2 * 1
'''
```