# #-----------------Exercício 1----------------
# def verificaPrimo(n: float) -> bool:
    
#     if n < 2:
#         return False
    
#     i = 0
#     for i in range(2, n):
#         if n % i == 0:
#             return False
    
#     return True

        
# print(verificaPrimo(1))

#-----------------Exercício 2----------------
def mostrarPrimo():
    n1 = int(input("Digite um número: "))
    n2 = int(input("Digite um número: "))

    prime_numbers = 0
    i = 0
    
    for i in range(n1, n2, 1):
        v = 0
        for v in range(2, i):
            if i % v == 0:
                break
            else:
                prime_numbers += 1
    print(prime_numbers)
    
mostrarPrimo()