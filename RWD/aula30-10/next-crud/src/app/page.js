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

  return (
    <main>
      <h1>Aula de CRUD</h1>
    </main>
  )
}
