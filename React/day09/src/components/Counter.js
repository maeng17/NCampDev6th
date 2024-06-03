import React, { useContext } from 'react';
import { CounterContext, useCounter } from '../context/CounterContext';
import { ToggleContext, useToggle } from '../context/ToggleContext';

/*
const Counter = () => {
    const { counter, increment, decrement, reset } = useContext(CounterContext)
    const { toggle, onToggle } = useContext(ToggleContext)

    return (
        <div>
            <h1>카운터 : { counter }</h1>
            <h1 style={  toggle==true ? {color:'red'} : {color:'black'}}>토글 : { toggle }</h1>
            <p>
                <button onClick={() => increment()}>증가</button>
                <button onClick={() => decrement()}>감소</button>
                <button onClick={() => reset()}>초기화</button>
                <br/><br/>
                <button onClick={() => onToggle()}>toggle</button>
                <button onClick={() => onToggle(true)}>true</button>
                <button onClick={() => onToggle(false)}>flase</button>
            </p>
        </div>
    );
};

export default Counter;

*/

//강사님 풀이
const Counter = () => {
    const { state, dispatch } = useCounter()
    const { state2, dispatch2 } = useToggle()

    return (
        <div>
            <h1>카운터 : { state.counter }</h1>
            <h1 style={{color: state2.isChk ? 'red' : '#000' }}>토글 : { `${state2.isChk}` }</h1>
            {/* 조건은 찍히지 않으므로 ${}사용해서 값변경 */}
            <p>
                <button onClick={() => dispatch({type: 'INCREMENT'})}>증가</button>
                <button onClick={() => dispatch({type: 'DECREMENT'})}>감소</button>
                <button onClick={() => dispatch({type: 'RESET'})}>초기화</button>
                <br/><br/>
                <button onClick={() => dispatch2({type: 'TOGGLE'})}>toggle</button>
                <button onClick={() => dispatch2({type: 'TRUE'})}>true</button>
                <button onClick={() => dispatch2({type: 'FALSE'})}>flase</button>
            </p>
        </div>
    );
};

export default Counter;