"use client" // client component - Ele tem conteúdo dinâmico
import Link from "next/link"
import { useEffect, useState } from "react"
import {FaEdit, FaTrash} from 'react-icons/fa'


export default function Home() {

  const [produtos, setProdutos] = useState([])

  useEffect(
    ()=>{
      fetch(`http://localhost:5000/produto`)
      .then(resp=> resp.json())
      .then(resp=> setProdutos(resp))
      .catch(error=> console.error(error))
    },[]
  )

    const handleDelete = (id)=>{
      fetch(`http://localhost:5000/produto/${id}`,{
        method:'delete'
      })
      .then(window.location = '/')
      .catch(error=> console.error(error))
    }


  return (
    <main className="lista">
      <h1>Lista de Produtos</h1>
      <Link href={'/incluir/0'}>Incluir Produto</Link>

      <table>
        <thead>
          <tr>
            <th>Título</th>
            <th>Quant.</th>
            <th>Preço</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          {
            produtos.map(prod=>(
              <tr key={prod.id}>
                <td>{prod.titulo}</td>
                <td>{prod.quantidade}</td>
                <td>R$ {parseFloat(prod.preco).toFixed(2) }</td>
                <td>
                  <Link href={`/incluir/${prod.id}`}><FaEdit/>Editar</Link>
                  <button onClick={handleDelete.bind(this, prod.id)} ><FaTrash/>Excluir</button>
                </td>
              </tr>
            ))
          }
        </tbody>
        <tfoot>
          <tr>
            <td colSpan={4}>Produtos vindo do Servidor</td>
          </tr>
        </tfoot>
      </table>
    </main>
  )
}
