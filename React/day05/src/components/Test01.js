import axios from 'axios';

import React, { useEffect, useState } from 'react';

const Test01 = () => {
    const [data, setData] = useState([])

    //1번
    /*
    useEffect(() => {
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then(res => res.json())
        .then(res => setData(res))
    }, [])
    */

    //2번
    /*
    useEffect(() => {
        axios.get('https://jsonplaceholder.typicode.com/posts')
        .then(res => setData(res.data))
    }, [])
    */

    //3번
    /*
    useEffect(() => {
        const getData = async() => {
            const res = await fetch('https://jsonplaceholder.typicode.com/posts')
            const data = await res.json()
            setData(data)
        }
        getData()
    }, [])
    */

    //4번
    useEffect(() => {
        const getData = async() => {
            const res = await axios.get('https://jsonplaceholder.typicode.com/posts')
            setData(res.data)
        }
        getData()
    }, [])

    return (
        <div>
            <ul>
                {
                    data.map(item => <li key={ item.id }>
                        { item.id } / {  item.title }
                    </li>)
                }
            </ul>
        </div>
    );
};

export default Test01;