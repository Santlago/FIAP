sal = float(input("Digite o seu salário: "))

#Calculo INSS
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

#Calculo IR
if sal <= 1903.98:
    ir = sal * 0
elif sal <= 2826.65:
    ir = sal * 0.075 - 142.80
elif sal <= 3751.05:
    ir = sal * 0.15 - 354.8
elif sal <= 4664.68:
    ir = sal * 0.225 - 636.13
else:
    ir = sal * 0.275 - 869.36

sal_liq = sal - ir - inss
print("Salário: ", sal)
print("INSS: ", inss)
print("IR: ", ir)
print("Salário líquido: ", sal_liq)
