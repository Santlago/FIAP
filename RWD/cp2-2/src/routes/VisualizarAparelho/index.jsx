import { Link, useNavigate, useParams } from "react-router-dom"
import { listaAparelhos } from "../../components/listaAparelhos"

export default function VisualizarAparelho () {

    const lista = listaAparelhos
    const navegacao = useNavigate()
    const {id} = useParams()

    const proc = lista.filter(prod => prod.id == id)
    const produto = proc[0]

    return (
        <main className="visualizar-produto">
            <h1>{produto.nome}</h1>
            <img src={`/imagens/aparelho${produto.id}.jpg`} alt="Aparelho Image" />
            <div className="detalhes">
                <p>Marca: {produto.marca}</p>
                <p>Modelo: {produto.modelo}</p>
            </div>
            <Link to='/aparelhos'>Voltar para aparelhos</Link>
        </main>
    )
}