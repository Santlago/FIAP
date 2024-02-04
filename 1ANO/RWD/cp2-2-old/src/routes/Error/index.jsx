import { Link } from "react-router-dom"

export default function Error() {

    return(
        <main>
            <h1>Erro 404 - Página não encontrada</h1>
            <Link to='/'>Home</Link>
        </main>
    )
}