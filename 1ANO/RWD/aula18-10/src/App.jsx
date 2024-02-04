import { useState } from 'react'
import './App.css'
import ExemploEffect from './components/ExemploEffect'
import Aviao from './components/Aviao'

function App() {

  const [valor, setValor] = useState(0)
  const [filho, setFilho] = useState(true)
  const [altura, setAltura] = useState(0)

  return (
    <>
      <h1>Componente App</h1>
      <button onClick={() => setFilho(!filho)}>
        {filho ? "Apagar" : "Criar"}
      </button>
      {filho ? <ExemploEffect valor={valor} setValor={setValor}/> : ''}
      <h2>Componente avião</h2>
      <Aviao altura={altura} setAltura={setAltura}/>
    </>
  )
}

export default App
