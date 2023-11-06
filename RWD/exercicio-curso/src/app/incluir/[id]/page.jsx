"use client"

import Link from "next/link"
import { useEffect, useState } from "react"

export default function Incluir({params}) {

    const cursoId = params.id == 0 ? '' : params.id

    const [novo, setNovo] = useState({
        curso: '',
        modulos: '',
        duracao: ''
    })

    let metodo = 'post'
    if (cursoId) metodo = 'put'

    const handleChange = e => {
        setNovo({...novo, [e.target.name]:e.target.value})
    }

    const handleSubmit = e => {
        e.preventDefault()
        fetch(`http://localhost:5000/curso/${cursoId}`, {
            method: metodo,
            headers:{"Content-Type":"application/json"},
            body: JSON.stringify(novo)
        })
        .then(window.location = '/')
        .catch(error => console.error(error))
    }

    useEffect(() => {
        if (cursoId) {
            fetch(`http://localhost:5000/curso/${cursoId}`)
            .then(response => response.json())
            .then(response => setNovo(response))
            .catch(error => console.error(error))
        }
    }, [cursoId])

    return(
        <main>
            <h1>Formulário de Cursos</h1>

            <form onSubmit={handleSubmit}>
                <input type="text" name="curso" value={novo.curso}
                placeholder="Nome do curso" onChange={handleChange}/> <br />
                <input type="number" name="modulos" value={novo.modulos}
                placeholder="Quantidade de módulos" onChange={handleChange}/> <br />
                <input type="text" name="duracao" value={novo.duracao}
                placeholder="Duração" onChange={handleChange}/> <br />
                <button type="submit">Enviar</button>
                <Link href={'/'}>Cancelar</Link>
            </form>
        </main>
    )
}