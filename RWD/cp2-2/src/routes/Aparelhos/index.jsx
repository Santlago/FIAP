import { Link } from "react-router-dom";
import { listaAparelhos } from "../../components/listaAparelhos";

export default function Produtos () {
    return (
        <main className="aparelhos">
            <h1>Aparelhos</h1>
            <div className="lista-aparelhos">
                {
                    listaAparelhos.map(prod => (
                        <div className="aparelhos" key={prod.id}>
                            <h3>{prod.nome}</h3>
                            <Link to={`/aparelho/visualizar/${prod.id}`}>
                                <img src={`/imagens/aparelho${prod.id}.jpg`} alt="Aparelho Image" />
                                <p>R${prod.preco},00</p>
                            </Link>
                        </div>
                    ))
                }
            </div>
        </main>
    )
}