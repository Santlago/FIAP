import { useState } from 'react'
import './App.css'
import Cabecalho from './components/Cabecalho'
import Rodape from './components/Rodape'
import Menu from './components/Menu'

function App() {
  return (
    <>
      <Cabecalho/>
      <Menu/>
      <Rodape/>
    </>
  )
}

export default App
