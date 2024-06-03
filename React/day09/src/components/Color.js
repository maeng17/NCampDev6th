import React, { useContext } from 'react';
import { ColorContext } from '../context/ColorContext';
import { CountContext } from '../context/CountContext';

const Color = () => {
    const { color, onRed, onBlue, onGreen, onMagenta } = useContext(ColorContext)
    const { count } = useContext(CountContext)

    return (
        <div>
            <h1 style={{ color : color }}>색깔 : { color }, { count }</h1>
            <p>
                <button onClick={ () => onRed() }>red</button>
                <button onClick={ () => onGreen() }>green</button>
                <button onClick={ () => onBlue() }>blue</button>
                <button onClick={ () => onMagenta() }>magenta</button>
            </p>
        </div>
    );
};

export default Color;