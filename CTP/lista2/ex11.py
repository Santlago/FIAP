sal = float(input("Digite o seu salário: "))

if sal <= 1247.7:
    inss = sal * 0.08
elif sal <= 2079.5:
    inss = sal * 0.09
elif sal <= 4159:
    inss = sal * 0.11
else:
    inss = sal - 468

salLiq = sal - inss

print(f"""
    Salário...............: R${sal:.2f}
    INSS..................: R${inss:.2f}
    Salário líquido.......: R${salLiq:.2f}
""")