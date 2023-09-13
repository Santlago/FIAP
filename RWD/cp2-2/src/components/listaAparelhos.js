import Aparelho1 from "../../../public/aparelho1.jpg"
import Aparelho2 from "../../../public/aparelho2.jpg"

export const listaAparelhos = [
    {    
        id: 1,
        nome: 'saffa',
        modelo: 'adsad',
        marca: 'dfs', 
        descricao: 'Ipad',
        preco: 200,
        img: <img src={Aparelho1}/>  
    },
    {    
        id: 2,
        nome: 'skldfa',
        modelo: 'ssdd',
        marca: 'hdbg', 
        descricao: 'Fiat Torosda',
        preco: 300,
        img: <img src={Aparelho2}/>  
    },
    {    
        id: 3,
        nome: 'syka',
        modelo: 'yyj',
        marca: 'fjfg', 
        descricao: 'Fiat Torosa',
        preco: 456,
        img: <img src={Aparelho1}/>  
    },
    {    
        id: 4,
        nome: 'syha',
        modelo: 'gdfg',
        marca: 'kfng', 
        descricao: 'Fiat Toroasd',
        preco: 678,
        img: <img src={Aparelho1}/>  
    },
    {    
        id: 5,
        nome: 'sdsfa',
        modelo: 'gdfg',
        marca: 'fhg', 
        descricao: 'Fiat Torosd',
        preco: 457,
        img: <img src={Aparelho1}/>  
    }
  ];

/*var Images = React.createClass({
    render: function() {
      return (
        <div>  {listaAparelhos.map(function(i){
                return (
                <div key={i.id}>
                  <h1>{i.id}</h1>
                  <span>{i.descricao}</span>
                  <img src={i.img} width='120' />
                  <span>{i.valor}</span>
                </div>
                );
        })}
    </div>
    )
  }
                                 });
  ReactDOM.render(<Images />, document.getElementById('app'));*/