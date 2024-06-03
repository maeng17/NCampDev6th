import React, { useMemo } from 'react';

const getColor = (color) => {
    console.log('getColor')

    switch(color) {
        case 'hotpink':
            return '진분홍'
        case 'magenta':
            return '보라'
        case 'skyblue':
            return '하늘'
        case 'tomato':  
            return '토마토'
    }
}

const getFood = (food) => {
    console.log('getFood')

    switch(food) {
        case '햄버거':
            return '햄버거'
        case '피자':
            return '피자'
        case '치킨':
            return '치킨'
        case '떡볶이':  
            return '떡볶이'
    }
}

const Test04Sub = ({ color, food }) => {
    //실행하자마자 또는 color값을 바꾸거나, food의 값을 바꾸면 로그가 모두 찍힌다.
    //const colorInfo = getColor(color)
    //const FoodInfo = getFood(food)

    //해결방법
    //일반 함수가 아니라 useMemo를 사용하면
    //color를 바꾸면 getColor로그만 찍히고, food를 바꾸면 getFood로그만 찍히도록 한다.
    const colorInfo = useMemo(() => {
        return getColor(color)
    }, [color])
    const foodInfo = useMemo(() => {
        return getFood(food)
    }, [food])

    return (
        <div>
            <h3>선택한 색 : { color }</h3>
            <h4>당신은 { colorInfo }색을 좋아하는군요!! </h4>

            <h3>선택한 음식 : { food }</h3>
            <h4>당신은 { foodInfo }을/를 좋아하는군요!! </h4>
        </div>
    );
};

export default Test04Sub;