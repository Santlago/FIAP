import Image from "next/image";

export default function Secao4() {
    return(
        <main>
            <h1>Seção 4</h1>
            <Image
            src={'/item4.webp'}
            alt="Item1"
            width={250}
            height={200}
            />
        </main>
    )
}