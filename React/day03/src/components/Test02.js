import React, {useState} from 'react';

const Test02 = () => {
    const [chk, isChk] = useState(true) 

    const onInputChk = (e) => {
        const {checked} = e.target
        isChk(checked)
    }
    return (
        <div style={{ color: chk ? 'blue' : 'hotpink', fontSize: 25, margin: 30}}>
            <input type='checkbox' checked={ chk } onChange={ onInputChk }/>Have a nice day!!
        </div>
    );
};

export default Test02;