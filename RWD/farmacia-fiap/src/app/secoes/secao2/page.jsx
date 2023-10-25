import Image from "next/image";

export default function Secao2() {
    return(
        <main>
            <h1>Seção 2</h1>
            <Image
            src={'/item2.webp'}
            alt="Item1"
            width={250}
            height={200}
            />
        </main>
    )
}