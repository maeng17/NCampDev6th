import React, { useContext } from 'react';
import { CntCountContext } from '../context/CntCountContext';

const CntCount = () => {
    const {count, increment, decrement } = useContext(CntCountContext)
    
    return (
        <div>
            <h1>카운트 : { count }</h1>
            <p>
                <button onClick={() => increment(10)}>10 증가</button>
                <button onClick={() => increment(50)}>50 증가</button>
                <button onClick={() => decrement(30)}>30 감소</button>
                <button onClick={() => decrement(40)}>40 감소</button>
            </p>
        </div>
    );
};

export default CntCount;