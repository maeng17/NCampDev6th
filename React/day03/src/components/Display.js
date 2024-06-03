import React from 'react';

const Display = (props) => {
    return (
        <div>
            <h2>Display 컴포넌트</h2>
            <h1>내가 좋이하는 동물은 { props.name }입니다. </h1>
        </div>
    );
};

export default Display;