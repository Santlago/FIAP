import './Etiquetas.scss'

export default function Etiquetas() {

    return(
        <div className="divEtiqueta">
            <form>
                <fieldset>
                    <legend>Dados Pessoais</legend>
                    <label>Nome:
                        <input type="text" name="nome"/>
                    </label>
                    <label>E-mail:
                        <input type="text" name="email"/>
                    </label>
                    <label>CPF:
                        <input type="text" name="cpf"/>
                    </label>
                    <button type="submit">Criar</button>
                </fieldset>
            </form>
            <div className="painel">
                <div className="etiqueta">
                    <p>Nome: </p>
                    <p>E-mail: </p>
                    <p>CPF: </p>
                </div>
            </div>
        </div>
    )
}