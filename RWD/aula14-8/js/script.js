// Exercícios

// let salarios = [2500, 3570, 1800, 4500, 1310, 5500, 2150, 3250, 1400, 2000]

// let salarioAtual = salarios.map(sal => sal <= 2000 ? sal * 1.15 : sal * 1.10)

// console.log(salarioAtual);

// let salAlto = salarios.filter(sal => sal > 2500)

// console.log(salAlto);

// let salTotal = salAlto.reduce((acc, sal) => acc + sal)

// console.log(salTotal);

const pessoa = {
    nome: 'Luis',
    idade: 30,
    sexo: 'M',
    altura: 1.80,
    peso: 80,
    andar: function(){
        console.log('Estou andando');
    }
}

console.log(pessoa.nome);

pessoa.nome = 'Douglas' // Alterar

console.log(pessoa.nome);

pessoa.cabelo = 'Castanho' // Adicionar

console.log(pessoa);

console.log(pessoa['cabelo']);

pessoa['olhos'] = 'Castanho'

delete pessoa.casado // Deletar atributo

console.log(pessoa);

const produtos = [
    {nome: 'Teclado', preco: 150},
    {nome: 'Mouse', preco: 120},
    {nome: 'Monitor', preco: 950}
]

console.log(produtos[1].preco);

pessoa.andar()

pessoa.falar = function(){ // adicionar função
    console.log('Fala pra caramba!!!');
}

console.log(pessoa);

pessoa.falar()

pessoa['pular'] = function(){
    console.log('Pulando alto!!!');
}

pessoa.pular()

delete pessoa.pular

console.log(pessoa);

let frutas = ['maça', 'uva', 'laranja', 'pera']

console.log(frutas);

frutas.sort()

console.log(frutas)

produtos.sort(function(a,b){
    if(a.preco < b.preco){
        return -1
    } else {
        return true
    }
})

console.log(produtos);