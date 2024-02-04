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

    const buscarCep = (e) => {
        const cep = e.target.value.replace(/\D/g, '')
        fetch(`https://viacep.com.br/ws/${cep}/json/`)
        .then(resp => resp.json())
        .then(data => {
            setValue('rua', data.logradouro)
            setValue('bairro', data.bairro)
            setValue('cidade', data.localidade)
            setValue('estado', data.uf)
            setFocus('numero')
        })
    }

    const inserirCliente = (cliente) => {
        setListaClientes([...listaClientes, cliente])
    }

    return(
        <div className='divCadastro'>
            <h1>CadastroHook</h1>
            <form onSubmit={handleSubmit(inserirCliente)}>
                <fieldset>
                    <legend>Dados Pessoais</legend>
                    <label>Nome:
                        <input type="text" {...register("nome")}/>
                        <span>{errors.nome?.message}</span>
                    </label>
                    <label>E-mail:
                        <input type="text" {...register("email")}/>
                        <span>{errors.email?.message}</span>
                    </label>
                    <label>CPF:
                        <input type="text" {...register("cpf")}/>
                        <span>{errors.cpf?.message}</span>
                    </label>
                    <button type='submit'>Cadastrar</button>
                </fieldset>
                <fieldset>
                    <legend>Endereço</legend>
                    <label>CEP:
                        <input type="text" {...register('cep')} onBlur={buscarCep}/>
                    </label>
                    <label>Rua:
                        <input type="text" {...register('rua')}/>
                    </label>
                    <label>Número:
                        <input type="text" {...register('numero')}/>
                    </label>
                    <label>Bairro:
                        <input type="text" {...register('bairro')}/>
                    </label>
                    <label>Cidade:
                        <input type="text" {...register('cidade')}/>
                    </label>
                    <label>Estado:
                        <input type="text" {...register('estado')}/>
                    </label>
                </fieldset>
            </form>
            <div className="painel">
                {
                    listaClientes.map((cli, i) => 
                        <div key={i} className='etiqueta'>
                            <p>Nome: {cli.nome}</p>
                            <p>E-mail: {cli.email}</p>
                            <p>CPF: {cli.cpf}</p>
                            <p>{cli.rua}, {cli.numero}</p>
                            <p>Bairro: {cli.bairro}</p>
                            <p>Cidade: {cli.cidade} - {cli.estado}</p> 
                        </div>
                    )
                }
            </div>
        </div>
    )
}