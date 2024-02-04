import Image from "next/image"

export default function Secao1() {
    return(
        <main>
            <h1>Seção 1</h1>
            <Image
            src={'/item1.webp'}
            alt="Item1"
            width={250}
            height={200}
            />
        </main>
    )
}