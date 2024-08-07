"use client" // client component - Ele tem conteúdo dinâmico

import { useEffect, useState } from "react"

export default function Home() {

  const [produtos, setProdutos] = useState([])

  useEffect(
    () => {
      fetch(`http://localhost:5000/produto`) // promise acessa o endereco
      .then(resp => resp.json()) // promise transforma em json
      .then(resp => setProdutos(resp))
      .catch(error => console.error(error))
    }, []
  )

  const handleDelete = (id) => {
    fetch(`http://localhost:5000/produto/${id}`, {
      method: 'delete'
    })
    .then(window.location = '/')
    .catch(error => console.error(error))
  }

  return (
    <main>
      <h1>Lista de Produtos</h1>


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
          produtos.map(prod => (
            <tr key={prod.id}>
              <td>{prod.titulo}</td>
              <td>{prod.quantidade}</td>
              <td>R${parseFloat(prod.preco).toFixed(2)}</td>
              <td>
                <button onClick={handleDelete.bind(this, prod.id)}>Excluir</button>
              </td>
            </tr>
          ))
        }
      </tbody>
      <tfoot>
        <tr>
          <td colSpan={4}>Produtos vindos do Servidor</td>
        </tr>
      </tfoot>
    </table>
    </main>
  )
}
