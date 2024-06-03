import React, { createContext, useState } from 'react';

export const ColorContext = createContext() //provider, custmor 둘다 생성 -> 관리자

//const ColorProvider = ({ props }) => {
const ColorProvider = ({ children }) => {
    const [color, setColor] = useState('pink')
    
    const onRed = () => { setColor('red') }
    const onGreen = () => { setColor('green') }
    const onBlue = () => { setColor('blue') }
    const onMagenta = () => { setColor('magenta') }

    return (
        <ColorContext.Provider value={{ color, onRed, onBlue, onGreen, onMagenta }}>
            {/* { props.children } */}
            { children }
        </ColorContext.Provider>
    );
};

export default ColorProvider;