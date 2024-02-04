import { useEffect, useState } from "react"

export default function Aviao(props) {

    useEffect(
        () => {
            console.log(`O avião está ligado! - ${props.altura}`)
        }, [props.altura]
    )

    return(
        <>
            <h2>Aviao</h2>
            <p>Altura: {props.altura}</p>
            <button onClick={() => props.setAltura(props.altura + 100)}>Aumentar</button>
        </>
    )
}