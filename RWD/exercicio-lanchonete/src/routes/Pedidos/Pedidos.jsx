import './Pedidos.scss'
import { useForm } from 'react-hook-form'
import { yupResolver } from '@hookform/resolvers/yup'
import * as yup from 'yup'
import { useState } from 'react'

const schema = yup.object({
    mesa: yup.string()
            .required("O nome é obrigatório!"),
    pedido: yup.string()
            .required('O pedido é obrigatório!'),
    valor: yup.string()
            .required('O valor do pedido é obrigatório!')
}).required()

export const Pedidos = () => {

    const {register, handleSubmit, formState:{erros}, setValue, setFocus} = useForm({
        resolver: yupResolver(schema)
    })

    const [listaPedidos, setListaPedidos] = useState([])

    const inserirPedido = (pedido) => {
        setListaPedidos([...listaPedidos, pedido])
    }

    return(
        <div className="containerPedidos">
            <main>
                <div className="forms">
                    <form onSubmit={handleSubmit(inserirPedido)}>
                        <fieldset>
                            <legend>Pedido</legend>
                            <label>Mesa
                                <input type="text" {...register("mesa")}/>
                            </label>
                            <label>Pedido
                                <input type="text" {...register("pedido")}/>
                            </label>
                            <label>Valor
                                <input type="text" {...register("valor")}/>
                            </label>
                            <button type='submit'>Criar</button>
                        </fieldset>
                    </form>
                </div>
                <div className="painel-pedidos">
                    {
                        listaPedidos.map((ped, i) =>
                            <div key={i} className='etiqueta'>
                                <p>Mesa: {ped.mesa}</p>
                                <p>Pedido: {ped.pedido}</p>
                                <p>Valor: {ped.valor}</p>
                            </div>
                        )
                    }
                </div>
            </main>
        </div>
    )
}