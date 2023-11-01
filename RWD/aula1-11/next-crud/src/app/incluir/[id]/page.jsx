"use client"

import { useEffect, useState } from "react"

export default function Incluir({params}) {

    const prodId = params.id == 0 ? '' : params.id

    const [novo, setNovo] = useState({
        titulo: '',
        quantidade: '',
        preco: ''
    })

    let metodo = 'post'

    if(prodId) metodo = 'put'

    const handleChange = e => {
        setNovo({...novo, [e.target.name] : e.target.value})
    }

    const handleSubmit = e => {
        e.preventDefault()
        fetch(`http://localhost:5000/produto/${prodId}`, {
        method: metodo,
        headers: {"Content-Type":"application/json"},
        body: JSON.stringify(novo)
        })
        .then(window.location = '/')
        .catch(error => console.error(error))
    }

    useEffect(()=>{
        if(prodId) {
            fetch(`http://localhost:5000/produto/${prodId}`)
            .then(resp => resp.json())
            .then(resp => setNovo(resp))
            .catch(error => console.error(error))
        }
    },[prodId])

    return(
        <main>

        </main>
    )
}