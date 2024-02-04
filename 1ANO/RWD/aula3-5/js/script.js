// // Comentário de uma linha

// alert("Este aviso está vindo de um arquivo externo")

// document.write("<h1>Neste exemplo eu escrevo diretamente da página</h1>")

// console.log("Este texto vai para o console do navegador!")

// let nome = "Luis Carlos"

// console.log(nome)

// nome = "Andréia"

// console.log(nome)

// const curso = "JS"

// curso = "Java"

// console.log(curso)
// console.log(idade)

let nome = "Luis Carlos"
console.log(nome)
console.log(typeof nome)

let idade = 18
console.log(idade)
console.log(typeof idade)

let valor = 15.45
console.log(valor)
console.log(typeof valor)

let frutas = ['Maça', 'Banana', 'Pera', 'Uva']
console.log(frutas)
console.log(frutas[0])
console.log(frutas[1])
console.log(frutas[2])
console.log(frutas[3])
console.log(typeof frutas)

let carro = {
    marca: "Honda",
    modelo: "Civic",
    ano: 2023,
    cor: "Preto",
    correr: function(){
        // alert("O carro está correndo")
    }
}

console.log(carro.modelo)
carro.correr()

let num1 = 5

let num2 = "6.7668"

console.log(num1 + parseInt(num2)) // faz casting para int
console.log(num1 + parseFloat(num2)) // faz casting para float
console.log(num1 + Number(num2)) // identifica e faz casting para number

let frase = "Estão chegando as provas"

console.log(frase.indexOf("as")) // mostra a posição da string
console.log(frase.lastIndexOf("as"))
console.log(frase.slice(0, 5))
console.log(frase.replace("provas", "avaliações")) // substitui a palavra
console.log(frase.toLocaleLowerCase())
console.log(frase.toUpperCase())
console.log(nome.slice(0, nome.indexOf(" "))) // vai cortar o nome até o espaço (vai cortar apenas o primeiro nome)

let saldo = 45.321312312
console.log(saldo.toPrecision(5)) // limita o numero de casas mostradas
console.log(saldo.toFixed(2)) // limita o numero de casas APÓS a vírgula

let num3 = 9
let num4 = 3

console.log(num3 + num4)
console.log(num3 - num4)
console.log(num3 / num4)
console.log(num3 * num4)
console.log(num3 % num4)
console.log(num3 ** num4)

let matricula = confirm("Efetuar matricula?")
console.log(matricula)

let nomeCompleto = prompt("Digite o seu nome completo.")
console.log(nomeCompleto)

let primeiro = Number(prompt("Digite o primeiro número"))
let segundo = Number(prompt("Digite o segundo número"))

console.log(primeiro + segundo)