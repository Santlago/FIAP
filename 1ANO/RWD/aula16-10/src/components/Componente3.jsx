import { useState } from "react"
import { Button } from "../styled"

export default function Componente3() {

    const [tarefa, setTarefa] = useState('')

    const [todas, setTodas] = useState([])

    const anotarTarefa = (e) => {
        setTarefa(e.target.value)
    }

    const inserirTarefa = () => {
        setTodas([...todas, tarefa])
        setTarefa('')
    }

    return(
        <div>
            <h2>Componente 3</h2>
            <textarea onChange={anotarTarefa} value={tarefa}></textarea><br />
            <Button $isOn={tarefa} onClick={inserirTarefa}>Anotar Tarefa</Button>
            <ul>
                {
                    todas.map((tar, i) => 
                        <li key={i}>{tar}</li>
                    )
                }
            </ul>
        </div>
    )
}