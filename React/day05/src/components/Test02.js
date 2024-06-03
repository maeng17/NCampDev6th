import axios from 'axios';
import React, { useEffect, useState } from 'react';

const Test02 = () => {
    const [id, setId] = useState(100)
    const [dto, setDto] = useState({})
    const [search, setSearch ] = useState(100)
    
    const onSearch = (id) => {
        setSearch(id)
    }

    useEffect(() => {
        axios.get(`https://jsonplaceholder.typicode.com/posts/${id}`)
        .then(res => setDto(res.data))
    //}, [search]) //버튼 누를 때 마다
    }, [id]) //id의 값이 바뀔때 마다


    return (
        <div>
            <input type='text' value={ id } onChange={ e=> setId(e.target.value)}/>
            <button onClick={ () => onSearch(id)}>검색</button>
            <hr />
            {dto.id} / {dto.title}
        </div>
    );
};

export default Test02;