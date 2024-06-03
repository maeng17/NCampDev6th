import React, { createContext, useState } from 'react';

export const CntCountContext = createContext()

const CntCountProvider = ({ children }) => {
    const [count, setCount] = useState(0)

    const increment = (step) => {
        setCount(count + step)
    }
    const decrement = (step) => {
        setCount(count - step)
    }
    return (
        <CntCountContext.Provider value={{ count, increment, decrement }}>
            { children }
        </CntCountContext.Provider>
    );
};

export default CntCountProvider;