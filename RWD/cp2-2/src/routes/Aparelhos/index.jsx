import { Link } from "react-router-dom"
import { listaAparelhos } from "../../components/listaAparelhos"

export default function Aparelhos() {
    
    return(
        <main>
            <h1>Aparelhos</h1>
            {
               listaAparelhos.map(apar => (
                <div key={apar.id}>
                    <Link to={`/aparelhos/visualizar/${apar.id}`}>
                        Visualizar o Produto: {apar.nome}
                    </Link>
                </div>
               )) 
            }
        </main>
    )
}

