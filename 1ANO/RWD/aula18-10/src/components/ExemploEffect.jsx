import { useEffect, useState } from "react"

export default function ExemploEffect(props) {

    useEffect(
        () => {
            console.log('Todas as vezes eu sou chamado!!')
        }
    )

    useEffect(
        () => {
            console.log("Somente quando a página for carregada!")
        }, []
    )

    useEffect(
        () => {
            console.log(`Sempre que o valor for alterado - ${props.valor}`)
        }, [props.valor]
    )

    useEffect(
        () => {
            return () => console.log("Ops, me apagaram")
        }, []
    )

    const [numero, setNumero] = useState(0)

    return(
        <div>
            <h2>Exemplo Effect</h2>
            <p>Valor: {props.valor}</p>
            <button onClick={() => props.setValor(props.valor + 1)}>Aumentar</button>
            <p>Número: {numero}</p>
            <button onClick={() => setNumero(numero + 1)}>Número</button>
        </div>
    )
}