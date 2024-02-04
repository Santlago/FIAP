sal = float(input("Digite o seu salário: "))

#INSS
if sal <= 1247.7:
    inss = sal * 0.08
elif sal <= 2079.5:
    inss = sal * 0.09
elif sal <= 4159:
    inss = sal * 0.11
else:
    inss = sal - 468

#Imposto de Renda
if sal <= 1710.78:
    al = 0
    ded: 0
elif sal <= 2563.91:
    al = 0.075
    ded = 128.31
elif sal <= 3418.59:
    al = 0.15
    ded = 320.6
elif sal <= 4271.59:
    al = 0.225
    ded = 577
else:
    al = 0.275
    ded = 790.58

ir = (sal * al) - ded

salLiq = sal - inss - ir

print(f"""
    Salario..................: R${sal:.2f}
    INSS.....................: R${inss:.2f}
    IR.......................: R${ir:.2f}
    Salário líquido..........: R${salLiq:.2f}
""")