import { useState } from 'react'
import '../../index.scss'

export const Cadastro = () => {

    const [cliente, setCliente] = useState(
        {
            nome:'',
            email:'',
            cpf:''
        }
    )

    const [listaCliente, setListaCliente] = useState([])
    
    const cadCliente = (e) => {
        setCliente({...cliente, [e.target.name]: e.target.value})
    }

    const inserirCliente = (e) => {
        e.preventDefault()
        setListaCliente([...listaCliente, cliente])
        setCliente({nome:'', email:'', cpf:''})
    }

    return(
        <div className="divCadastro">
            <h1>Cadastro</h1>
            <form onSubmit={inserirCliente}>
                <fieldset>
                    <legend>Dados Pessoais</legend>
                    <label>Nome:
                        <input type="text" name="nome"
                        onChange={cadCliente} value={cliente.nome}/>
                    </label>
                    <label>E-mail:
                        <input type="text" name="email"
                        onChange={cadCliente} value={cliente.email}/>
                    </label>
                    <label>CPF:
                        <input type="text" name="cpf"
                        onChange={cadCliente} value={cliente.cpf}/>
                    </label>
                    <button type='submit'>Cadastrar</button>
                </fieldset>
            </form>
            <div className="painel">
                {
                    listaCliente.map((cli, i)=>
                        <div key={i} className='etiqueta'>
                            <p>Nome: {cli.nome}</p>
                            <p>E-mail: {cli.email}</p>
                            <p>CPF: {cli.cpf}</p>
                        </div>
                    )
                }
            </div>
        </div>
    )
}