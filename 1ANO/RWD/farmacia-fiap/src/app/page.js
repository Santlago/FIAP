import Link from "next/link";

export default function Home() {
  return (
    <main>
      <h1>Página Home</h1>
      <Link href={'/secoes'}>Confira as nossas seções!</Link>
    </main>
  )
}
