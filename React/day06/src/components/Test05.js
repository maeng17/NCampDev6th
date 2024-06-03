import axios from 'axios';
import React, { useEffect, useReducer, useState } from 'react';

const initialState = {
    dto: {},
    error: null,
    loading: true
}

const reducer = (state, action) => {
    switch(action.type) {
        case 'SUCCESS' :
            return{
                dto: action.payload,
                error: null,
                loading: false
            }
        case 'ERROR':
            return{
                dto: {},
                error: '데이터를 가져오지 못했습니다.',
                loading: true
            }
        default:
            return state
    }
}

const Test05 = () => {
    const[state, dispatch] = useReducer(reducer, initialState)

    const [id, setId] = useState(1)
    const[search, setSearch] = useState(1)

    const onSearch = (id) => {
        setSearch(id)
    }
    
    useEffect(() => {
        const url = `https://jsonplaceholder.typicode.com/photos/${id}`

        axios.get(url)
            .then(res => dispatch({type: 'SUCCESS', payload: res.data }))
            .catch(err => dispatch({type: 'ERROR'}))
    }, [search])

    return (
        <div>
            <h3>
                ID 입력 (1~5000) : 
                <input type='text' value={ id } onChange={ e=> setId(e.target.value) }/>
                <button onClick={ () => onSearch(id)}>검색</button>
            </h3>
            <hr/>
            <h2>
                {
                    state.dto && state.loading ? '로딩 중' : state.dto.title    
                }
                <br/>
                {
                    state.loading || <img src={state.dto.thumbnailUrl}/>
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

export default Test05;