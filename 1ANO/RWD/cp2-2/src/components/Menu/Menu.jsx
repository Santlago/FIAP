import { Link } from "react-router-dom"

export const Menu = () => {
    return (
        <nav>
            <Link to='/' >Home</Link>
            <span> | </span>
            <Link to='/aparelhos'>Aparelhos</Link>
        </nav>
    )
}