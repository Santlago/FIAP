// Cadastrar alguns carros

let carro1 = 'Gol'
let carro2 = 'Polo'
let carro3 = 'Civic'

let carros = ['Versa', 'Jetta', 'Corolla']

carros[3] = 'City'

// insere no ifnal da array
carros.push('Yaris')
carros[carros.length] = 'Cronos'

// ordena em ordem alfabetica
carros.sort()

// ordena em ordem alfabetica reversa
carros.sort().reverse()

// remove o ultimo item da array
let ultimo = carros.pop()

// insere item no inicio da array
carros.unshift('Toro')

// remove item no inicio da array
carros.shift()

// altera o item (posicao, quantidade de itens para apagar, itens para adicionar)
carros.splice(1, 1, 'Tcross')
carros.splice(1, 2, 'Tcross', 'Astra')

console.log(carros);
console.log(carros[0]);
console.log(ultimo);

let numeros = [1, 3, 8, 5, 9]

let posicoes = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

console.log(posicoes[0][1]);

let pessoas = [
    {nome: 'Luis', idade: 30},
    {nome: 'Maria', idade: 25},
    {nome: 'Maria', idade: 25},
]

console.log(pessoas[0].nome)