import React from 'react';
import { useParams } from 'react-router-dom';

const Front = ({ data }) => {
    const { name } = useParams()
    return (
        <div>
            <h1>Front page</h1>
            <h1>{ name }</h1>
            <hr/>
            {
                data.filter(item => item.title === name )
                    .map((item, index) => <div>
                        <h2>{ item.title } / { item.info }</h2>
                    </div>)
            }
        </div>
    );
};

export default Front;