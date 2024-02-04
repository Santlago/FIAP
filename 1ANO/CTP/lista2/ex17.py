p1 = float(input("Prova 1: "))
p2 = float(input("Prova 2: "))
a1 = float(input("Atividade 1(0/1): "))
a2 = float(input("Atividade 2(0/1): "))
a3 = float(input("Atividade 3(0/1): "))
a4 = float(input("Atividade 4(0/1): "))

p = (((p1 + p2) / 2) * 0.6)
a = a1 + a2 + a3 + a4
av1 = p + a

if av1 < 6:
    print("Você está abaixo da média")
elif av1 == 6:
    print("Você está na média")
elif av1 > 6:
    print("Você está acima da média")