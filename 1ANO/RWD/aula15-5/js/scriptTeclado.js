let texto = document.querySelector('#texto')

texto.addEventListener('keydown', ()=>{
    let resultado = document.querySelector('#res')
    resultado.innerHTML = ''
    texto.value = ''
})

document.addEventListener('keyup', (e)=>{
    let resultado = document.querySelector('#res')
    resultado.innerHTML = `Esta é a tecla: ${e.key}`
})