import React, { useContext } from 'react';
import { ColorContext } from '../context/ColorContext';

const ChangeColor = () => {
    const { color, onColor } = useContext(ColorContext)

    return (
        <div>
            <h1 style={{ color: color }}>색상 변경: { color }</h1>
            <p>
                <button onClick={ () => onColor('hotpink') }>hotpink</button>
                <button onClick={ () => onColor('skyblue') }>skyblue</button>
                <button onClick={ () => onColor('pink') }>pink</button>
                <button onClick={ () => onColor('tomato') }>tomato</button>
                <button onClick={ () => onColor('lime') }>lime</button>
            </p>
        </div>
    );
};

export default ChangeColor;