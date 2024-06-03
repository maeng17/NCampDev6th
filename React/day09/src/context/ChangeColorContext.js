import React, { createContext, useState } from 'react';
import { ColorContext } from './ColorContext';

export const ChangeColorContext = createContext()

const ChangeColorProvider = (props) => {
    const [color, setColor] = useState('hotpink')

    const onColor = (text) => {
        setColor(text)
    }

    return (
        <ColorContext.Provider value={{ color, onColor }}>
            { props.children }
        </ColorContext.Provider>
    );
};

export default ChangeColorProvider;