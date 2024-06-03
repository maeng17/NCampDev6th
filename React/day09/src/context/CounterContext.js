import React, { createContext, useContext, useReducer, useState } from 'react';

/*
export const CounterContext = createContext()

const CounterProvider = (props) => {
    const [counter, setCounter] = useState(0)

    const increment = () => {
        setCounter(counter+1)    
    }

    const decrement = () => {
        setCounter(counter-1)
    }
    const reset = () => {
        setCounter(0)
    } 

    return (
        <CounterContext.Provider value={{ counter, increment, decrement, reset }}>
            { props.children }
        </CounterContext.Provider>
    );
};

export default CounterProvider;
*/

// 강사님 풀이
const initialState = { counter : 0 }
const reducer = (state, action) => {
    switch(action.type){
        case 'INCREMENT':
            return {
                counter : state.counter + 1
            }
        case 'DECREMENT':
            return {
                counter : state.counter - 1
            }
        case 'RESET':
            return initialState
        default:
            return state
    }
}

const CounterContext = createContext()
export const useCounter = () => useContext(CounterContext) //사용자가 만든 훅스함수

const CounterProvider = ({children}) => {
    const [state, dispatch] = useReducer(reducer, initialState)
    

    return (
        <CounterContext.Provider value={{ state, dispatch }}>
            { children }
        </CounterContext.Provider>
    );
};

export default CounterProvider;