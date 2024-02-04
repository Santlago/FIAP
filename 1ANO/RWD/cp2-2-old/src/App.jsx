import './App.css'
import { Outlet } from 'react-router-dom'
import Cabecalho from './components/Cabecalho'
import Menu from './components/Menu'
import Rodape from './components/Rodape'

function App() {

  return (
    <>
      <Cabecalho/>
      <Menu/>
      <Outlet/>
      <Rodape/>
    </>
  )
}

export default App
