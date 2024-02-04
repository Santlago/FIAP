Uma classe abstrata é uma classe que nao pode ser instanciada, mas outras classes podem herdar dela <br>

Uma classe abstrata pode ter métodos abstratos, a classe comum não pode:
```
public abstract double doTotal
```
<br>

E ela obriga todas as classes que herdam da superclasse devem crair o método abstrato
```
@override
public double doTotal() {
    return setPreco()
}
```
<br>
No java tudo que aparece com um @ significa uma sobrescrita