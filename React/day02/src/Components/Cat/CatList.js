import React from 'react';

import '../../css/style.css';
import CatItem from './CatItem';

const CatList = ({data}) => {
    return (
        <div className='business'>
            <ul className='list2'>
                {
                    //한 개의 데이터를 CatItem로 전달
                    data.map(item => <CatItem item={item} />)
                }
            </ul>
        </div>
    );
};

export default CatList;