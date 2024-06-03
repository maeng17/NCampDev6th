import React, { createContext, useContext, useEffect, useRef, useState } from 'react';

/*
export const TodoContext = createContext()

const TodoProvider = ({ children }) => {
    const [data, setData] = useState(JSON.parse(localStorage.getItem('data')) || [])

    useEffect(() => {
        localStorage.setItem('data', JSON.stringify(data))
    }, [data])

    const seq = useRef(data.length + 1)

    const onAdd = (text) => {
        setData([
            ...data,
            {
                seq: seq.current++,
                text
            }
        ])
    }
    
    const onDel = (seq) => {
        setData(data.filter(item => item.seq !== seq ))
    }
    return (
        <TodoContext.Provider value={{ data, onAdd, onDel }}>
            { children }
        </TodoContext.Provider>
    );
};

export default TodoProvider;

*/

const TodoContext = createContext()
export const useTodos = () => useContext(TodoContext) // 사용자 Hook

const TodoProvider = ({ children }) => {
    const [text, setText] = useState('')

    //로컬 스토리지 읽어오기
    const [todo, setTodo] = useState(
        JSON.parse(localStorage.getItem('data')) || []
    )

    //로컬 스토리지 저장
    useEffect(() => {
        localStorage.setItem('data', JSON.stringify(todo))
    }, [todo])

    const seq = useRef(
        todo.length !== 0 ? todo[todo.length - 1].seq + 1 : 1
    )

    const onAdd = (text) => {
        setTodo([
            ...todo,
            {
                seq: seq.current++,
                text, //text: text
                isChk: false
            }
        ])
    }

    const onToggle = (seq) => {
        const data = todo.map(item => item.seq === seq ? {...item, isChk: !item.isChk} : item )
        setTodo(data)
    }

    const onDel = (seq) => {
        setTodo(todo.filter(item => item.seq !== seq))
    }

    return (
        <TodoContext.Provider value={{ todo, text, setText, onAdd, onToggle, onDel }}>
            { children }
        </TodoContext.Provider>
    );
};

export default TodoProvider;