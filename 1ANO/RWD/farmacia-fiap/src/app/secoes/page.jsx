import Link from "next/link";

export default function Secoes() {
    return(
        <main>
            <h1>Seções</h1>
            <p><Link href={'/secoes/secao1'}>Seção 1</Link></p>
            <p><Link href={'/secoes/secao2'}>Seção 2</Link></p>
            <p><Link href={'/secoes/secao3'}>Seção 3</Link></p>
            <p><Link href={'/secoes/secao4'}>Seção 4</Link></p>
        </main>
    )
}