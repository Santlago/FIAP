import styled from "styled-components"

export const DivComp1 = styled.div`
    background-color: lightblue;
    border: 3px solid blue;
    padding: 20px;

    h2 {
        text-align: center;
        color: blue;
    }

    p {
        text-align: justify;
        color: darkblue;
    }
`

export const Button = styled.button`
    background-color: ${(props) => props.$isOn ? '#00f' : '#999'};
    border-radius: 10px;
    padding: 5px;
    color: white;
    border: none;
`