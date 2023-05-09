let cont = 0

while(cont < 5) {
    console.log(cont)
    cont++
}

do {
    console.log(cont)
    cont++
} while(cont < 5)

function aviso() {
    alert('Testando a função aviso!')
}

function somar(arg1, arg2) {
    return arg1 + arg2
}

console.log(somar(7, 5))

let aviso2 = function() {
    alert('Teste2!')
}

aviso2()