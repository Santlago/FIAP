sal = float(input("Digite o seu salário: "))
ded = 0

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
salLiq = sal - ir

print(f"""
    Salario..................: R${sal:.2f}
    IR.......................: R${ir:.2f}
    Salário líquido..........: R${salLiq:.2f}
""")