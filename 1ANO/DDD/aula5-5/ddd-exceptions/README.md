# Aula 5/5

## Lidando com exceções

Try catch: utilizado para lidar com exceções
O try é o bloco onde eu vou tentar fazer o código
O catch é onde eu vou tratar as exceções
```
try{
    System.out.println("Digite um valor numérico");
    valor = numero.nextDouble();
} catch (InputMismatchException e) {
    System.out.println("Valor informado não é um número!");
}
```
<br>

Throwable é a superclasse de todas as exceções:
```
public class TesteExcecao extends Throwable {
```
<br>

O "e" é um objeto da classe InputMismatchException
```
} catch (InputMismatchException e) {
```
<br>

Independente da exceptio o bloco finally será executado:
```
} finally {
            System.out.println("Bloco finally");
        }
```