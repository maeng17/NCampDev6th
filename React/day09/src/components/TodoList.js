import React from 'react';
import TodoItem from './TodoItem';
import { useTodos } from '../context/TodoContext';

/*
const TodoList = ({ data, onDel }) => {
    return (
        <div>
            <h3>할 일 내용</h3>
            <ul>
                {
                    data.map(item => <TodoItem key={ item.seq } item={ item } onDel={ onDel }/>)
                }
            </ul>
        </div>
    );
};

export default TodoList;
*/

//강사님 풀이
const TodoList = () => {
    const { todo } = useTodos()
    return (
        <div>
            <h2>할 일 내용</h2>
            <ul>
                {
                    todo.map(item => <TodoItem key={ item.seq } item={ item }/>)
                }
            </ul>
        </div>
    );
};

export default TodoList;