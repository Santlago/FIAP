n1 = int(input("Número 1: "))
n2 = int(input("Número 2: "))
n3 = int(input("Número 3: "))

inter = n1

if (n1 != n2) and (n1 != n3) and (n2 != n3):
    if (n1 > n2 and n1 < n3) or (n1 > n3 and n1 < n2):
        print(n1)
    if (n2 > n1 and n2 < n3) or (n2 > n3 and n2 < n1):
        print(n2)
    if (n3 > n1 and n3 < n2) or (n3 > n2 and n3 < n1):
        print(n3)
else:
    print("Os números não são diferentes")