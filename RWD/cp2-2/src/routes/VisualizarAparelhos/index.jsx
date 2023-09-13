import { useParams, useNavigate } from "react-router-dom"
import { listaAparelhos } from "../../components/listaAparelhos"


export default function VisualizarAparelhos() {
    const lista = listaAparelhos
    const navegacao = useNavigate()
    const {id} = useParams()

    const proc = lista.filter(apar => apar.id == id)
    const aparelho = proc[0]

    const voltar = ()=>{
        return navegacao('/aparelhos')
    }
    
    return(
        <main>
            <h1>Visualizar Produtos</h1>
            <p>{aparelho.img}</p>
            <p>Nome: {aparelho.nome}</p>
            <p>Modelo: {aparelho.modelo}</p>
            <p>Marca: {aparelho.marca}</p>
            <p>Descrição: {aparelho.descricao}</p>
            <p>Preço: {aparelho.preco}</p>
            <button onClick={voltar} >Voltar</button>
        </main>
    )
}

 