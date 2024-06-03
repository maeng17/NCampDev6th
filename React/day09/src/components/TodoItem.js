import React, { useState } from 'react';
import { useTodos } from '../context/TodoContext';

/*
const TodoItem = ({ item, onDel }) => {
    const {seq, text} = item
    const [chk, isChk] = useState(false)

    const onChk = (e) => {
        isChk(e.target.checked)
    }
    return (
        <li>
            <input type='checkbox' style={{ color : chk ? 'red' : '#000'}} onChange={ onChk } checked={ chk }/>
            {text}
            <button onClick={ () => onDel(seq) }>삭제</button> 
        </li>
    );
};

export default TodoItem;

*/

//강사님 풀이
const TodoItem = ({ item }) => {
    const { seq, text, isChk } = item
    const { onToggle, onDel } = useTodos()
    

    return (
        <li style={{color : isChk ? 'red' : '#000' }}>
            <input type='checkbox' checked={ isChk } onChange={ () => onToggle(seq) } />
            { text } &emsp;
            <button onClick={ () => onDel(seq) }>삭제</button>
        </li>
    );
};

export default TodoItem;