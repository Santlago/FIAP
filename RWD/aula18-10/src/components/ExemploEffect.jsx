import { useEffect } from "react"

export default function ExemploEffect(props) {

    useEffect(
        () => {
            console.log('Todas as vezes eu sou chamado!!')
        }
    )

    return(
        <div>
            <h2>Exemplo Effect</h2>
            <p>Valor: {props.valor}</p>
            <button onClick={() => props.setValor(props.valor + 1)}>Aumentar</button>
        </div>
    )
}