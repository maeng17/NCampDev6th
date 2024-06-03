import React from 'react';
import TodoItem from './TodoItem';

import styles from '../css/TodoList.module.css';


const TodoList = ({ data, onDel } ) => {
    return (
        <div>
            <ul className={ styles.TodoList }>
                {
                    data.map(item => <TodoItem key={ item.seq } item={ item } onDel={ onDel } />)
                }
            </ul>
        </div>
    );
};

export default TodoList;