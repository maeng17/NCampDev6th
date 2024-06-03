import React, { createContext, useContext, useReducer, useState } from 'react';


/*
export const ToggleContext = createContext()

const ToggleProvider = ({ children }) => {
    const [toggle, isToggle] = useState('')

    const onToggle = (text) => {
        if(text === true ){
            isToggle(true)
        } else if (text === false){
            isToggle(false)
        }
        else {
            isToggle(!toggle)
        }
    }

    return (
        <ToggleContext.Provider value={{ toggle, onToggle}}>
            { children }
        </ToggleContext.Provider>
    );
};

export default ToggleProvider;

*/

//강사님 풀이

const initialState = { isChk : false }
const reducer = (state2, action) => {
    switch(action.type){
        case 'TOGGLE':
            return {
                ...state2,
                isChk : !state2.isChk
            }
        case 'TRUE':
            return {
                //isChk : true -> 초기값이 1개인 경우

                //만약에 초기값이 여러개일 경우
                ...state2, //먼저 기존의 값을 복사하고, isChk를 변경하는 것이 좋다
                isChk : true
            }
        case 'FALSE':
            return {
                ...state2, 
                isChk : false
            }
        default:
            return state2
        
    }
}
const ToggleContext = createContext()
export const useToggle = () => useContext(ToggleContext) //사용자 Hook

const ToggleProvider = ({ children }) => {
    const [state2, dispatch2 ] = useReducer(reducer, initialState)

    return (
        <ToggleContext.Provider value={{ state2, dispatch2 }}>
            { children }
        </ToggleContext.Provider>
    );
};

export default ToggleProvider;