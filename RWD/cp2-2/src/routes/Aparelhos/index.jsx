import { Link } from "react-router-dom";
import { listaAparelhos } from "../../components/listaAparelhos";

export default function Produtos () {
    return (
        <main>
            <h1>Aparelhos</h1>
            <div className="lista-aparelhos">
                {
                    listaAparelhos.map(prod => (
                        <div className="aparelhos" key={prod.id}>
                            <h3>{prod.nome}</h3>
                            <img src={`/imagens/aparelho${prod.id}.jpg`} alt="Aparelho Image" />
                            <Link to={`/aparelho/visualizar/${prod.id}`}>
                               Visualizar o aparelho
                            </Link>
                        </div>
                    ))
                }
            </div>
        </main>
    )
}