sal = float(input("Digite o seu salário: "))
sexo = int(input("Digite o sexo [1 - masculino, 2- feminino]: "))
idade = int(input("Digite a sua idade: "))

if idade <= 20:
    if sexo == 1:
        al = 0.0534
    else:
        al = 0.0356
elif idade <= 40:
    if sexo == 1:
        al = 0.0844
    else:
        al = 0.0643
else:
    if sexo == 1:
        al = 0.1012
    else:
        al = 0.0802

valConv = sal * al

print(f"Valor do convênio: R${valConv:.2f}")
