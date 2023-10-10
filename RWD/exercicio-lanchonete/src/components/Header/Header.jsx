import './Header.scss'

import { Link } from "react-router-dom"

export const Header = () => {
    return(
        <header>                
            <div className="logo">
                <Link to='/'>
                    <h1>Burguer House</h1>
                    <img src="/images/logo-burguer-house.png" alt="bh-logo" />
                </Link>
            </div>
            <nav>
                <Link to='/pedidos' id='men1'>Pedidos</Link>
                <span> | </span>
                <Link to='/cardapio' id='men2'>Cardapio</Link>
            </nav>
        </header>
    )
}