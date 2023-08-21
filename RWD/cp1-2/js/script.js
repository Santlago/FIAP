const desc = document.getElementById('idDesc');
const autor = document.getElementById('idAutor');
const dep = document.getElementById('idDep');
const imp = document.getElementById('idImp');
const btn = document.getElementById('idBtnAdd');

listaOut1 = document.getElementById('ulDiv1')
listaOut2 = document.getElementById('ulDiv2')
listaOut3 = document.getElementById('ulDiv3')
listaOut4 = document.getElementById('ulDiv4')
listaOut5 = document.getElementById('ulDiv5')

const lista = []

btn.addEventListener('click', inserir)

function inserir() {

    const descValue = desc.value;
    const autorValue = autor.value;
    const depValue = dep.value;
    const impValue = imp.value;
    
    lista.push({ desc: descValue, autor: autorValue, dep: depValue, imp: impValue });

    listaOut1.innerHTML = ''
    listaOut2.innerHTML = ''
    listaOut3.innerHTML = ''
    listaOut4.innerHTML = ''
    listaOut5.innerHTML = ''

    lista.forEach((elem, i) => {
        listaOut1.innerHTML += `<li>${elem.desc}</li>`
        listaOut2.innerHTML += `<li>${elem.autor}</li>`
        listaOut3.innerHTML += `<li>${elem.dep}</li>`
        listaOut4.innerHTML += `<li>${elem.imp}</li>`
        listaOut5.innerHTML += `<li><button onclick="apagar(${i})">X</button></li>`
    });
}

function apagar(i) {

    lista.splice(i, 1)

    listaOut1.innerHTML = ''
    listaOut2.innerHTML = ''
    listaOut3.innerHTML = ''
    listaOut4.innerHTML = ''
    listaOut5.innerHTML = ''

    lista.forEach((elem, i) => {
        listaOut1.innerHTML += `<li>${elem.desc}</li>`
        listaOut2.innerHTML += `<li>${elem.autor}</li>`
        listaOut3.innerHTML += `<li>${elem.dep}</li>`
        listaOut4.innerHTML += `<li>${elem.imp}</li>`
        listaOut5.innerHTML += `<li><button onclick="apagar(${i})">X</button></li>`
    });
}

function adicionarValor() {
    
}