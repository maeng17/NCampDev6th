import React, {useState} from 'react';

const Test05 = () => {
const [num, setNum] = useState(1)
const onAdd = () => {
    setNum(num+1)
}
const onsub = () => {
    setNum(num-1)
}
const onReset = () => {
    setNum(1)
}

    return (
        <div>
            <h2>숫자 : { num }</h2>
            <p>
                <button onClick={ onAdd }>1씩 증가</button>
                <button onClick={ onsub }>1씩 감소</button>
                <button onClick={ onReset }>초기화</button>
            </p>
        </div>
    );
};

export default Test05;