"use client"

import Link from "next/link"
import { useEffect, useState } from "react"

export default function Home() {

  const [cursos, setCursos] = useState([])

  useEffect(
    () => {
      fetch(`http://localhost:5000/curso`)
      .then(response => response.json())
      .then(response => setCursos(response))
      .catch(error => console.error(error))
      console.log(cursos)
    }, []
  )

  const handleDelete = (id) => {
    fetch(`http://localhost:5000/curso/${id}`, {
      method: 'delete'
    })
    .then(window.location = '/')
    .catch(error => console.error(error))
  }

  return (
    <main className='lista'>
      <h1>Lista de Cursos</h1>
      <Link href={'/incluir/0'}>Incluir Curso</Link>
      <table>
        <thead>
          <tr>
            <th>Curso</th>
            <th>Módulos</th>
            <th>Carga horária</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          {
            cursos.map(cursos => (
              <tr key={cursos.id}>
                <td>{cursos.curso}</td>
                <td>{cursos.modulos}</td>
                <td>{cursos.duracao}h</td>
                <td>
                  <Link href={`/incluir/${cursos.id}`}>Editar</Link>
                  <button onClick={handleDelete.bind(this, cursos.id)}>Excluir</button>
                </td>
              </tr>

            ))
          }
        </tbody>
        <tfoot>
          <tr>
            <td colSpan={4}>Cursos fornecidos</td>
          </tr>
        </tfoot>
      </table>
    </main>
  )
}
