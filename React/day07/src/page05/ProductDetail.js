import React, { useState } from 'react';
import { useNavigate, useParams } from 'react-router-dom';

import data from './data';

const ProductDetail = () => {
    const { productId } = useParams()
    //const [productDTO] = useState(data[productId-1])
    //const { name, description, photo, price } = productDTO

    const item = data.find(item => item.id === productId)

    const navigate = useNavigate()

    const onHome = () => {
        navigate('/')
    }

    return (
        <div className='item'>
            <h2>도미나 핏짜 상세페이지</h2>
            <h3>제품명 : { item.name } / 가격 : { item.price }</h3>
            <p><img src={ item.photo } alt={ item.name }/></p>
            <p>제품 설명 : { item.description }</p>

            <button onClick={ onHome }>Home</button>
            <button onClick={ () => navigate(-1) }>ProductList</button>
        </div>
    );
};

export default ProductDetail;