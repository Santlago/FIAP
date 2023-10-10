import './Header.scss'

import { Link } from "react-router-dom"

export const Header = () => {
    return(
        <header>
            <h1>Burguer House</h1>
            <nav>
                <Link to='/' >Home</Link>
                <span> | </span>
                <Link to='/pedidos'>Pedidos</Link>
                <span> | </span>
                <Link to='/cardapio'>Cardapio</Link>
            </nav>
        </header>
    )
}