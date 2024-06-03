import React from 'react';

const Person = ({ name, age }) => {
    return (
        <div>
            <h1>나의 이름은 <span style={{color: 'blue'}}>{name}</span>이고, 나이는 <span style={{color:'red'}}>{age}</span>살 입니다.</h1>
        </div>
    );
};

export default Person;