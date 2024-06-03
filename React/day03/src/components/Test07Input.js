import React from 'react';

const Test07Input = ({dto, onIput, onNext}) => {
    const {name, age, addr, tel} = dto

    return (
        <>
            <p>이름 : <input type='text' name='name' value={ name } onChange={ onIput }/></p>
            <p>나이 : <input type='' name='age' value={ age } onChange={ onIput }/></p>
            <p>주소 : <input type='' name='addr' value={ addr } onChange={ onIput }/></p>
            <p>핸드폰 : <input type='' name='tel' value={ tel } onChange={ onIput }/></p>

            <p><button onClick={ onNext }>다음</button></p>
        </>
    );
};

export default Test07Input;