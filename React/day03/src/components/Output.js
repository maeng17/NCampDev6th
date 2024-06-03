import React from 'react';

const Output = (props) => {
    return (
        <div>
            <h2>{ props.name }님이 좋아하는 과일은 { props.fruit }입니다. </h2>
        </div>
    );
};

export default Output;