import React from "react";
import { ReactDOM } from "react";

export const listaAparelhos = [
    {    
        id: 1,
        descricao: 'Fiat Toro',
        img: 'http://www.fiat.com.br/content/dam/fiat-brasil/desktop/produtos/modelos/226/versoes/22611X0/176.png'  
    },
    {    
        id: 2,
        descricao: 'Fiat Argo',
        img: 'http://argo.fiat.com.br/modules/home/data/tablet/background.jpg'  
    },
    {    
        id: 3,
        descricao: 'Golf 2017',
        img: 'https://3.bp.blogspot.com/-bnzlXa1mIe0/WCXcyVh9aNI/AAAAAAAA1_g/xbgbYXeSCLQc7y5gXagH2SZhZW_SAtdzwCLcB/s1600/Novo-Golf-2017%2B%252815%2529.jpg'  
    }
  ];
  var Images = React.createClass({
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
  ReactDOM.render(<Images />, document.getElementById('app'));