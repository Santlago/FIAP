const desc = document.getElementById('idDesc');
const autor = document.getElementById('idAutor');
const dep = document.getElementById('idDep');
const imp = document.getElementById('idImp');
const btn = document.getElementById('idBtnAdd');
const val = document.getElementById('idValor');
const dur = document.getElementById('idDuracao');
const opc = document.getElementById('idHabOpcional');

listaOut1 = document.getElementById('ulDiv1')
listaOut2 = document.getElementById('ulDiv2')
listaOut3 = document.getElementById('ulDiv3')
listaOut4 = document.getElementById('ulDiv4')
listaOut5 = document.getElementById('ulDiv5')
listaOut6 = document.getElementById('ulDiv6')
listaOut7 = document.getElementById('ulDiv7')

const lista = []

btn.addEventListener('click', inserir)

function inserir() {
    
    let descValue = desc.value;
    let autorValue = autor.value;
    let depValue = dep.value;
    let impValue = imp.value;
    let valValue = '-';
    let durValue = '-';

    if (val.value !== '') {
        valValue = val.value;
    }

    if (dur.value !== '') {
        durValue = dur.value;
    }
    
    if (descValue === '' || autorValue === '' || depValue === '' || impValue === '') {
        alert('Preencha todos os campos obrigatórios antes de adicionar a tarefa.');
        return;
    }

    lista.push({ desc: descValue, autor: autorValue, dep: depValue, imp: impValue, val: valValue, dur: durValue});
    listaOut1.innerHTML = ''
    listaOut2.innerHTML = ''
    listaOut3.innerHTML = ''
    listaOut4.innerHTML = ''
    listaOut5.innerHTML = ''
    listaOut6.innerHTML = ''
    listaOut7.innerHTML = ''

    lista.forEach((elem, i) => {
        listaOut1.innerHTML += `<li>${elem.desc}</li>`
        listaOut2.innerHTML += `<li>${elem.autor}</li>`
        listaOut3.innerHTML += `<li>${elem.dep}</li>`
        listaOut4.innerHTML += `<li>${elem.imp}</li>`
        listaOut5.innerHTML += `<li>${elem.val}</li>`
        listaOut6.innerHTML += `<li>${elem.dur}</li>`
        listaOut7.innerHTML += `<li><button onclick="apagar(${i})">X</button></li>`
    });

    desc.value = ''
    autor.value = ''
    dep.value = ''
    imp.value = ''
    val.value = ''
    dur.value = ''
}

function apagar(i) {

    lista.splice(i, 1)

    listaOut1.innerHTML = ''
    listaOut2.innerHTML = ''
    listaOut3.innerHTML = ''
    listaOut4.innerHTML = ''
    listaOut5.innerHTML = ''
    listaOut6.innerHTML = ''
    listaOut7.innerHTML = ''

    lista.forEach((elem, i) => {
        listaOut1.innerHTML += `<li>${elem.desc}</li>`
        listaOut2.innerHTML += `<li>${elem.autor}</li>`
        listaOut3.innerHTML += `<li>${elem.dep}</li>`
        listaOut4.innerHTML += `<li>${elem.imp}</li>`
        listaOut5.innerHTML += `<li>${elem.val}</li>`
        listaOut6.innerHTML += `<li>${elem.dur}</li>`
        listaOut7.innerHTML += `<li><button onclick="apagar(${i})">X</button></li>`
    });
}

function adicionarValor() {

}

opc.addEventListener('click', camposOpcionais)

function camposOpcionais() {
    var enableOptional = opc.checked;
    var valorOptional = document.getElementById('optionalFields');
    
    valorOptional.style.display = enableOptional ? 'block' : 'none';
}

// --------------------------Ordenar por importância-----------------------------------
btnOrdena = document.getElementById('idOrdena')
btnOrdena.addEventListener('click', ordena)

function ordena() {
    document.getElementById('divTable').style.display = 'none';

    let tabelaOrdenada =
        `<div id="divTableOrdenada">
            <div id="idDiv1"><h3>Descrição</h3>
                <ul id="ulOrdDiv1"></ul>
            </div>
            <div id="idDiv4"><h3>Importância</h3>
                <ul id="ulOrdDiv2"></ul>
            </div>
        </div>`

    main = document.getElementById('main')
    main.innerHTML += `<div id="tabelaOrdenada"></div>`
    const tabela = document.getElementById('tabelaOrdenada')
    tabela.innerHTML = tabelaOrdenada

    listaOutOrd1 = document.getElementById('ulOrdDiv1')
    listaOutOrd2 = document.getElementById('ulOrdDiv2')

    const listaOrdenada = lista.sort((a, b) => b.imp - a.imp)

    listaOrdenada.forEach((elem, i) => {
        listaOutOrd1.innerHTML += `<li>${elem.desc}</li>`
        listaOutOrd2.innerHTML += `<li>${elem.imp}</li>`
    });
}