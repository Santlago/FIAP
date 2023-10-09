import { useState } from 'react'
import { useForm } from 'react-hook-form'
import { yupResolver } from '@hookform/resolvers/yup'
import * as yup from 'yup'
import '../../index.scss'

const schema = yup.object({
    nome: yup.string()
            .required("O nome é obrigatório!"),
    email: yup.string()
            .email("Digite um e-mail válido!")
            .required("O e-mail é obrigatório!"),
    cpf: yup.string()
            .min(11, "O CPF deve ter pelo menos 11 digitos!")
            .required("O CPF é obrigatório!")
}).required()

export const CadastroHook = () => {

    const {register, handleSubmit, formState:{errors}, setValue, setFocus} = useForm({
        resolver: yupResolver(schema)
    })

    const [listaClientes, setListaClientes] = useState([])

    const inserirCliente = (cliente) => {
        setListaClientes([listaClientes, cliente])
    }

    return(
        <div>
            <h1>CadastroHook</h1>
            <form onSubmit={handleSubmit(inserirCliente)}>
                <fieldset>
                    <legend>Dados Pessoais</legend>
                    <label>Nome:
                        <input type="text" {...register("nome")}/>
                    </label>
                    <label>E-mail:
                        <input type="text" {...register("email")}/>
                    </label>
                    <label>CPF:
                        <input type="text" {...register("cpf")}/>
                    </label>
                    <button type='submit'>Cadastrar</button>
                </fieldset>
            </form>
        </div>
    )
}