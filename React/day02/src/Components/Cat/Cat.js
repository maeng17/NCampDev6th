import React, {useState} from 'react';
import CatList from './CatList';
import dataList from './CatData'; //데이터를 가져옴

import '../../css/reset.css';
import '../../css/style.css';

const Cat = () => {
    const [data, setData] = useState(dataList) //가져온 데이터를 초기값으로 넣어주기

    return (
        <>
            <section className='business'>
                <div className='inner'>
                    <h2>고양이</h2>
                    <p>고양이들</p>
                    {/* 데이터를 CatList에 전달 */}
                    <CatList data={data}/>
                </div>
            </section>
            
        </>
    );
};

export default Cat;