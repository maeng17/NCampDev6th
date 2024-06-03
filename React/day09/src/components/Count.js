import React, { useContext } from 'react';
import { CountContext } from '../context/CountContext';

const Count = () => {

    /*
    return (
        <CountContext.Consumer>
            {
                ({ count, increment, decrement }) => (
                    <div>
                        <h1>카운트 : { count }</h1>
                        <p>
                            <button onClick={() => increment()}>증가</button>
                            <button onClick={() => decrement()}>감소</button>
                        </p>
                    </div>   
                )
            }
            
        </CountContext.Consumer>
    );
    ****/

    //<CountContext.Consumer>를 쓰니까 복잡해서 useContext로 변경
    const {count, increment, decrement} = useContext(CountContext)
    return(
        <div>
            <h1>카운트 : { count }</h1>
            <p>
                <button onClick={() => increment()}>증가</button>
                <button onClick={() => decrement()}>감소</button>
            </p>
        </div>
    );

};

export default Count;