import { useNavigate, useParams } from "react-router-dom"
import { listaAparelhos } from "../../components/listaAparelhos"

export default function VisualizarAparelho () {

    const lista = listaAparelhos
    const navegacao = useNavigate()
    const {id} = useParams()

    const proc = lista.filter(prod => prod.id == id)
    const produto = proc[0]

    return (
        <main>
            <h1>{produto.nome}</h1>
            <img src={`/imagens/aparelho${prod.id}.jpg`} alt="Aparelho Image" />
        </main>
    )
}