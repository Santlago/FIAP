import { Link } from "react-router-dom";

export default function Home() {
    return (
        <main>
            <div className="ad">
                <img id="ad1" src="/imagens/propaganda1.png" alt="Propaganda 1"/>
                <div className="texto-principal">
                    <h1 className="animation">Bem-vindo à Eletro Store - A sua Loja Digital de Eletrônicos</h1>
                    <p>Você acaba de encontrar o seu destino definitivo para todas as suas necessidades de eletrônicos! Na Eletro Store, estamos empenhados em trazer para você uma seleção incrível dos mais recentes e melhores produtos eletrônicos, desde teclados sofisticados até os smartphones mais avançados.</p>
                    <button class="button-64" role="button"><span class="text">Confira nossos produtos</span></button>
                </div>
                <img id="ad2" src="/imagens/propaganda2.png" alt="Propaganda 2"/>
            </div>
        </main>
    )
}