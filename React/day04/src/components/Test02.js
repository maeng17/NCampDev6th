import React, { useState } from 'react';
import Test02Sub from './Test02Sub';

const Test02 = () => {
    const [ show, isShow ] = useState(false)
    
    const onToggle = () => {
        isShow(!show)
    }

    return (
        <div>
            <button onClick={ onToggle }>{ show ? '숨기기' : '보이기 '}</button>
            <hr />
            {
                 show && <Test02Sub />
            }
           
        </div>
    );
};

export default Test02;