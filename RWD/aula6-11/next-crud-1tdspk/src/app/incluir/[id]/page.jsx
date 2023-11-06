"use client"

import Link from "next/link"
import { useEffect, useState } from "react"
import { FaLocationArrow, FaRegTimesCircle } from 'react-icons/fa'


export default function Incluir({params}){

    const prodId = params.id == 0 ? '' : params.id

    const [novo, setNovo] = useState({
        titulo:'',
        quantidade:'',
        preco:''
    })

    let metodo = 'post'
    if(prodId) metodo = 'put'

    const handleChange = e => {
        setNovo({...novo, [e.target.name]:e.target.value})
    }

    const handleSubmit = e =>{
        e.preventDefault()
        fetch(`http://localhost:5000/produto/${prodId}`,{
        method: metodo,
        headers:{"Content-Type":"application/json"},
        body: JSON.stringify(novo)
      })
      .then(window.location = '/')
      .catch(error => console.error(error))    
    }

    useEffect(()=>{
        if(prodId){
            fetch(`http://localhost:5000/produto/${prodId}`)
            .then(resp => resp.json())
            .then(resp => setNovo(resp))
            .catch(error => console.error(error))     
        }
    },[prodId])





    return(
        <main className="form">
            <h1>Formulário Produtos</h1>

            <form onSubmit={handleSubmit}>
                <input type="text" name='titulo' value={novo.titulo}
                placeholder="Título" onChange={handleChange} /> <br />
                <input type="number" name='quantidade' value={novo.quantidade}
                placeholder="Quantidade" onChange={handleChange} /> <br />
                <input type="number" name='preco' value={novo.preco}
                placeholder="Preço" onChange={handleChange} step={0.01} /> <br />
                <button type="submit" ><FaLocationArrow/>Enviar</button>
                <Link href={'/'}><FaRegTimesCircle/>Cancelar</Link>

            </form>
        </main>
    )
}