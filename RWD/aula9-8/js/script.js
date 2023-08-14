let notas = [4,6,8,9,5,7,3]

let notasAtuais = notas.map(nota => nota/2)

console.log(notas);
console.log(notasAtuais);

let cursos = [
    {nome: 'HTML5', duracao: '3 meses'},
    {nome: 'CSS3', duracao: '4 meses'},
    {nome: 'JavaScript', duracao: '5 meses'}
]

let prop = cursos.map(curso => `O ${curso.nome} tem a duração de ${curso.duracao}`)

console.log(prop);

let lista = cursos.map((curso,i)=> `${i+1}º curso ${curso.nome}`)

console.log(lista);
let notas1 = [4,6,8,9,5,7,3]

let aprov = notas1.filter(nota => nota >= 6)
console.log(aprov);

let usuarios = [
    {nome: 'Artur', senha: 123},
    {nome: 'Douglas', senha: 456},
    {nome: 'Breno', senha: 789}
]

let logado = usuarios.filter(user => user.nome === 'Artur')
console.log(logado);

let vendedores = [
    {nome: 'Artur', vendas: 250},
    {nome: 'Douglas', vendas: 350},
    {nome: 'Breno', vendas: 150}
]

let totalVendas = vendedores.reduce((acc, vendedor)=> acc + vendedor.vendas)
console.log(totalVendas);

let filaBrinquedo = [
    {nome: 'Luis', altura: 1.80},
    {nome: 'Adriana', altura: 1.50},
    {nome: 'Ronqui', altura: 1.70},
]

let liberado = filaBrinquedo.every(cliente => cliente.altura >= 1.60);

console.log(liberado ? "Podem começar" : "Monte outro grupo");

let apto = filaBrinquedo.some(cliente = cliente.altura >= 1.60);

console.log(apto ? "Quem for maior volte para fila" : "Vocês não pode brincar");

let repres = filaBrinquedo.find(cliente => cliente.altura >= 1.60)

console.log(repres.nome);

let convidados = ['prof Luis', 'Douglas', 'prof Rafael', 'Breno', 'prof Cordeiro']

let prof = convidados.filter(conv => conv.includes('prof'))
console.log(prof);

sal = [1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000]
let ajuste = sal.map(sal >= 2000 ? sal*1.15)