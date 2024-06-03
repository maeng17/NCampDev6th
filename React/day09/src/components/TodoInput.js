import React, { useRef, useState } from 'react';
import { useTodos } from '../context/TodoContext';

/*
const TodoInput = ({ onAdd }) => {
    const [text, setText ] = useState('')
    const textRef = useRef()

    const onSubmit = (e) => {
        e.preventDefault();

        if(!text) return

        onAdd(text)
        setText('')

        textRef.current.focus()
    }
    return (
        <form onSubmit={ onSubmit }>
            <input type='text' value={ text } onChange={ (e) => setText(e.target.value)} ref={ textRef } 
            placeholder='해야할 일을 입력하시오 '/>
            <button type='submit'>추가</button>
        </form>
    );
};

export default TodoInput;
*/



//강사님 풀이
const TodoInput = () => {
    const { todo, text, setText, onAdd } = useTodos()
    const textRef = useRef()

    const onSubmit = (e) => {
        e.preventDefault();

        if(!text) return

        onAdd(text)
        setText('')

        textRef.current.focus()
    }
    
    return (
        <form onSubmit={ onSubmit }>
            <input type='text' value={ text } onChange={ (e) => setText(e.target.value)} 
            placeholder='해야할 일을 입력하시오' ref={ textRef } />
            &nbsp;
            <button>추가</button>
        </form>
    );
};

export default TodoInput;