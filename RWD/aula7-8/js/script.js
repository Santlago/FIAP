let notas = [8, 7, 9, 5, 3, 6, 4]

let notasAtuais = notas.map( nota => nota/2)
// percorre todo o array fazendo alterações item por item
// devolve sempre ocm a mesma qyuantidade de elemntos do array original

console.log(notas);
console.log(notasAtuais);

let cursos = [
    {nome: 'HTML5', duracao: '3 meses'},
    {nome: 'CSS3', duracao: '4 meses'},
    {nome: 'JavaScript', duracao: '5 meses'}
]

console.log(cursos);

let propCursos = cursos.map(curso => `O ${curso.nome} só dura ${curso.duracao}`)

console.log(propCursos);

for(let curso of propCursos){
    console.log(curso);
}

let listaCursos = cursos.map( (curso, i) => `Curso ${i+1} - ${curso.nome}` )

console.log(listaCursos);

let aprov = notas.filter( nota => nota >= 6 )
// mesmo que o map mas só tras pra dentro do array os valores que forem verdadeiros

console.log(aprov);

let alunos = [
    {nome: 'Alberto', senha: 123},
    {nome: 'Ricardo', senha: 456},
    {nome: 'Alexandre', senha: 789}
]

let logado = alunos.filter(aluno => aluno.nome === 'Ricardo' && aluno.senha === 456)

console.log(logado);
console.log(...logado);
// spread (tira os colchetes de volta)

let numbers = [4 ,5, 8, 6, 7]

let soma = numbers.reduce( (acumulador, atual) => acumulador + atual)

console.log(soma);