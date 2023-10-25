import Image from "next/image";

export default function() {
    return(
        <main>
            <h1>Seção 3</h1>
            <Image
            src={'/item3.webp'}
            alt="Item3"
            width={250}
            height={200}
            />
        </main>
    )
}