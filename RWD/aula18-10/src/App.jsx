import { useState } from 'react'
import './App.css'
import ExemploEffect from './components/ExemploEffect'

function App() {

  const [valor, setValor] = useState(0)


  return (
    <>
      <h1>Componente App</h1>
      <ExemploEffect valor={valor} setValor={setValor}/> 
    </>
  )
}

export default App
