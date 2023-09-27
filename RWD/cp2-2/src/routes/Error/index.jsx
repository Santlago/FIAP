import { Link } from 'react-router-dom'

export default function Error(){

    return(
        <main className='error'>
            <h1>Erro 404 - Página não encontrada.</h1>
            <Link to='/'>Voltar para Home</Link>
        </main>
    )
}