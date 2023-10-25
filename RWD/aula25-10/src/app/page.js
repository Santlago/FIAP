import Image from 'next/image'
import styles from './page.module.css'
import Exemplo from '@/components/Exemplo'
import Link from 'next/link'

export default function Home() {
  return (
    <main>
      <h1>Página Home</h1>
      <Link href={'/produto'}>Produto</Link>
      <Exemplo/>
    </main>
  )
}
