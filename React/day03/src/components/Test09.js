import React from 'react';
import img01 from '../image/image01.jpg'
import img02 from '../image/image02.jpg'
import img03 from '../image/image03.jpg'
import img04 from '../image/image04.jpg'

const Test09 = () => {
    return (
        <div>
            <img src={ img01 } alt='고양이01' style={{width: '200px', height: '200px' }} /> &emsp;
            <img src={ img02 } alt='고양이02' style={{width: '200px', height: '200px' }} /> &emsp;
            <img src={ img03 } alt='고양이03' style={{width: '200px', height: '200px' }} /> &emsp;
            <img src={ img04 } alt='고양이04' style={{width: '200px', height: '200px' }} /> &emsp;
        </div>
    );
};

export default Test09;

/*
=> src 안에 있는 이미지 파일 처리는 참조변수를 사용한다.

[형식]
  import 참조변수 from '이미지경로';
*/