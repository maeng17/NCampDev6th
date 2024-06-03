import axios from 'axios';
import React, { useEffect, useState } from 'react';
import Member from './Member';

const Main = () => {
    const [data, setData] = useState([])

    useEffect(() => {
        axios.get('https://koreanjson.com/users')
            .then(res => setData(res.data))
    }, [])

    return (
        <div>
            <h1>Main page / 회원수 : { data.length } </h1>
            {
                data.map(item => <Member key={ item.id } item={ item } />)
            }
        </div>
    );
};

export default Main;

// https://koreanjson.com/users
// data에 들어있는 항목 id, name, email 출력