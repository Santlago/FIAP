import Link from "next/link";
import Image from "next/image"

export default function Produto() {
    return(
        <main>
            <h1>Produto</h1>
            <Link href={'/'}>Home</Link>
            <Image
            src={'/praia.webp'}
            alt="Praia"
            width={250}
            height={200}
            />
        </main>
    )
}