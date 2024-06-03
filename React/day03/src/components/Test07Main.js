import React, { useState } from 'react';
import Test07Input from './Test07Input';
import '../css/Test07.css';
import Test07Print from './Test07Print';
import Test07Output from './Test07Output';

const Test07Main = () => {

    const [dto, setDto] = useState({
        name : '',
        age : '',
        addr : '',
        tel : '',
    })

    const {name, age, addr, tel} = dto

    const [count, setCount] = useState(1)

    const onIput = (e) => {
        const {name, value} = e.target
        setDto({
            ...dto,
            [name] : value
        })
    }

    const onNext = () => {
        setCount(count+1) 
    }

    const onPrev = () => {
        setCount(count-1)
    }

    return (
        <div className='wrap'>
            {
                count === 1 && <Test07Input dto={dto} onIput={onIput} onNext={ onNext } />
            }
            {
                count === 2 && <Test07Print dto={dto} onNext={ onNext } onPrev={ onPrev }/>
            }
            {
                count === 3 && <Test07Output name={ name }/>
            }
            
        </div>
    );
};

export default Test07Main;