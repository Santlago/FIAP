import Link from "next/link";

export default function Header() {
    return(
        <main>
            <h1>Header</h1>
            <p><Link href={'/'}>Voltar para a Home</Link></p>
        </main>
    )
}