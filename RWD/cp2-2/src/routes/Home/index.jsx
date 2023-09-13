import Aparelho1 from "../../../public/aparelho1.jpg"
import Aparelho2 from "../../../public/aparelho2.jpg"

export default function Home() {
    
    return(
        <main>
            <h1>Home</h1>
            <img src={Aparelho1} alt="aparelho 1"/>
            <img src={Aparelho2} alt="aparelho 2"/>
        </main>
    )
}