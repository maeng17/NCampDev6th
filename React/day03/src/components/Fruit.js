import React from 'react';

const Fruit = ({ fruit, onInputFruit }) => {
    return (
        <div>
            <label>과일명 입력 : </label>
            <input type='text' value={ fruit } onChange={ onInputFruit }/>
        </div>
    );
};

export default Fruit;