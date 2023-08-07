let list = []
let btn = document.querySelector('button')
let lista = document.querySelector('ul')
let tarefa = document.getElementById('#idTarefa')


btn.addEventListener('click', function(){
    list.push(tarefa.value)
    console.log(list);
    lista.innerHTML = ''
    list.forEach((item, i)=>{
        lista.innerHTML += `<li>${item} <button onclick="apagar('${i}')"> X </button></li>`
    })
    tarefa.value = ''
});

function apagar(i){
    list.splice(i, 1)
    lista.innerHTML = ''
    list.forEach((item, i)=>{
        lista.innerHTML += `<li>${item} <button onclick="apagar('${i}')"> X </button></li>`
    })
}