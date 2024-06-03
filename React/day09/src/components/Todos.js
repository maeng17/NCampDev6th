import React, { useContext } from 'react';
import { ColorContext } from '../context/ColorContext';
import { CountContext } from '../context/CountContext';
import TodoInput from './TodoInput';
import TodoList from './TodoList';
import { TodoContext } from '../context/TodoContext';

/*
const Todos = () => {
    const { data, onAdd, onDel } = useContext(TodoContext)
    const { color } = useContext(ColorContext)
    const { count} = useContext(CountContext)

    return (
        <div>
            <h1 style={{color: color }}>할 일 만들기, { color }, { count }</h1>
            <TodoInput onAdd={ onAdd } />
            <TodoList data={ data } onDel={ onDel }/>
        </div>
    );
};


export default Todos;
*/

//강사님풀이
const Todos = () => {
    const { color } = useContext(ColorContext)
    const { count} = useContext(CountContext)

    return (
        <div>
            <h1 style={{color: color }}>할 일 만들기, { color }, { count }</h1>
            <TodoInput />
            <TodoList />
        </div>
    );
};

export default Todos;