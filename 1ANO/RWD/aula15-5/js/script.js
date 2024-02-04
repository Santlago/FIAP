let box = document.querySelector('#div1')

box.addEventListener('mouseenter', entrar)
box.addEventListener('mouseout', sair)
box.addEventListener('click', clicar)
box.addEventListener('contextmenu', clickDireito)
box.addEventListener('dblclick', clickDuplo)
box.addEventListener('mousemove', mover)
box.addEventListener('mousedown', apertou)
box.addEventListener('mouseup', soltou)

function apertou(){
    box.innerHTML = `Botão apertado`
    box.style.background = 'aqua'
}

function soltou(){
    box.innerHTML = 'Botão solto'
    box.style.background = 'lime'
}

function mover(e){
    let x = e.offsetX
    let y = e.offsetY
    let res = document.querySelector('#res')
    res.innerHTML = `Posição X: ${x} e Y: ${y}`
}

function clickDuplo(){
    box.innerHTML = 'Click Duplo'
    box.style.background = 'red'
}

function clickDireito(e){
    e.preventDefault()
    box.innerHTML = 'Click Direito'
    box.style.background = 'pink'
}

function clicar(){
    box.style.background = 'orange'
}

function sair(){
    box.innerHTML = 'Você saiu'
    box.style.background = 'green'
}

function entrar(){
    box.innerHTML = 'Você entrou!'
    box.style.background = 'blue'
}