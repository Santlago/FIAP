import { Link } from "react-router-dom";

export default function Home() {
    return (
        <main>
            <h1>Home</h1>
            <div className="ad">
                <img id="ad1" src="/imagens/propaganda1.png" alt="Propaganda 1"/>
                <img id="ad2" src="/imagens/propaganda2.png" alt="Propaganda 2"/>
            </div>
        </main>
    )
}