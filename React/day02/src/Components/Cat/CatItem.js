import React from 'react';

//1개의 데이터
const CatItem = ({ item }) => {
    const {id, img, title} = item

    return (
        <li>
            <a href='#'>
                <div>
                    <img src={img} />
                    <h3>{ title }</h3>
                </div>     
            </a>
        </li>
    );
};

export default CatItem;