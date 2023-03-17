n1 = int(input("Número 1...: "))
n2 = int(input("Número 2...: "))
n3 = int(input("Número 3...: "))

#FORMA 1

if n1 > n2 and n1 > n3:
    nmax = n1
elif n2 > n1 and n2 > n3:
    nmax = n2
elif n3 > n1 and n3 > n2:
    nmax = n3
else:
    nmax = "um ou mais números são iguais"

print(nmax)
