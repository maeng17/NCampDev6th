import React, { useState } from 'react';
import Test04Sub from './Test04Sub';

const Test04 = () => {
    const [color, setColor] = useState('')
    const [food, setFood] = useState('')

    const onFood = (e) => {
        setFood(e.target.value)
    }
    return (
        <div style={{ margin: 30}}>
            <h2>당신이 좋아하는 색은? </h2>
            <div>
                <select size='5' style={{ width:'120px' }} onChange={ (e) => setColor(e.target.value) }>
                    <option value='hotpink'>hotpink</option>
                    <option value='magenta'>magenta</option>
                    <option value='skyblue'>skyblue</option>
                    <option value='tomato'>tomato</option>
                </select>
            </div>
            <hr />
            <h2>당신의 좋아하는 음식은?</h2>
            <div>
                <p>
                    <input type='radio'name='food' value='햄버거' onChange={ onFood }/>
                    <label>햄버거</label>
                </p>
                <p>
                    <input type='radio'name='food' value='피자' onChange={ onFood }/>
                    <label>피자</label>
                </p>
                <p>
                    <input type='radio'name='food' value='치킨' onChange={ onFood }/>
                    <label>치킨</label>
                </p>
                <p>
                    <input type='radio'name='food' value='떡볶이' onChange={ onFood }/>
                    <label>떡볶이</label>
                </p>
            </div>
            <hr/>
            <Test04Sub color={ color } food={ food }/>
        </div>
    );
};

export default Test04;