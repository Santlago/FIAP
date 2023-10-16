import styled from "styled-components"

const DivComp2 = styled.div`
    background-color: lightgreen;
    border: 3px solid green;
    padding: 20px;

    h1 {
        text-align: center;
        color: green;
    }

    p {
        text-align: center;
        color: darkgreen;
    }
`

export default function Componente2() {
    
    return(
        <DivComp2>
            <h2>Component 2</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit.</p>
        </DivComp2>
    )
}