# Forma 1 utilizando if encadeado
sal = float(input("Digite o seu salário: "))

if sal <= 1302:
    inss = sal * 0.075
elif sal < 2571.29:
    inss = sal * 0.09
elif sal < 3856.94:
    inss = sal * 0.12
elif sal < 7507.49:
    inss = sal * 0.14
else:
    inss = 1051.84

sal_liq = sal - inss

print("O seu INSS é: ", inss)

# Forma 2 utilizando if simples e operadores lógicos
sal = float(input("Digite o seu salário: "))

if sal > 0 and sal <= 1302:
    inss = sal * 0.075
elif sal > 1302 and sal <= 2571.29:
    inss = sal * 0.09
elif sal > 2571.29 and sal <= 3856.94:
    inss = sal * 0.12
elif sal > 3856.94 and sal <=7507.49:
    inss = sal * 0.14
if sal > 7507.49:
    inss = 1051.84

sal_liq = sal - inss

print("O seu INSS é: ", inss)
