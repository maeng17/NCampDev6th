import axios from 'axios';
import React, { useEffect, useReducer } from 'react';

const initialState = {
    dto: {},
    error: null,
    loading: true
}

const reducer = (state, action) => {
    switch(action.type) {
        case 'SUCCESS': 
            return {
                dto: action.payload,
                error: null,
                loading: false
            }
        case'ERROR' : 
            return {
                dto: {}, //404에러, 데이터를 가져오지 못했습니다.
                error: '404에러, 데이터를 가져오지 못했습니다.',
                loading: true
            }
        default:
            return state
    }
}

const Test04 = () => {
    const [state, dispatch] = useReducer(reducer, initialState)

    useEffect(() => {
        const url = 'https://jsonplaceholder.typicode.com/posts/3' 

        axios.get(url)
            .then(res => dispatch({ type: 'SUCCESS', payload: res.data }))
            .catch(err => dispatch({type: 'ERROR'}))
    })


    return (
        <div>
            <h2>
                {
                    state.dto && state.loading ? '로딩 중' : state.dto.title    
                }
              
            </h2>
            <p>
                {
                    state.error ? state.error : null
                }
            </p>
        </div>
    );
};

export default Test04;