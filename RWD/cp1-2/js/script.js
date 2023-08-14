tarefa = document.getElementById('idTarefa')
listaOut = document.getElementById('idLista')
btn = document.getElementById('idBtnAdd')
lista = []

btn.addEventListener('click', inserir)

function inserir() {
    lista.push(tarefa.value)
    listaOut.innerHTML = ''
    lista.forEach((elem, i) => {
        listaOut.innerHTML += `<li>${elem}</li>`
    });
}


