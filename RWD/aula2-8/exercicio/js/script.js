let btn = document.getElementById('botao')
let lista = document.getElementById('lista')
let tarefa = document.getElementById('valor')

let list = []

btn.addEventListener('click', () => {
    list.push(valor.value)
    for (let i = 0; i < list.length; i++) {
        list.splice(i, 1, `<li>${list[i]}</li>`)
    }
    lista.innerHTML = list
    
});