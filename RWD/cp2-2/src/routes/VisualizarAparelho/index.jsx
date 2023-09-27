import { Link, useParams } from "react-router-dom"
import { listaAparelhos } from "../../components/listaAparelhos"

export default function VisualizarAparelho () {

    const lista = listaAparelhos
    const {id} = useParams()

    const proc = lista.filter(prod => prod.id == id)
    const produto = proc[0]

    return (
        <main className="visualizar-produto">
            <h1>{produto.nome}</h1>
            <img src={`/imagens/aparelho${produto.id}.jpg`} alt="Aparelho Image" />
            <div className="detalhes">
                <p><b>Marca: </b>{produto.marca}</p>
                <p><b>Modelo: </b>{produto.modelo}</p>
                <div className="preco">
                    <p>R${produto.preco},00</p>
                </div>
            </div>
            <Link to='/aparelhos'>Voltar para aparelhos</Link>
        </main>
    )
}