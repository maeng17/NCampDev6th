import React, { useMemo, useState } from 'react';

const Test03 = () => {
    const [count1, setCount1 ] = useState(1)
    const [count2, setCount2 ] = useState(1)

    //브라우저에서 count1 값은 바뀌면서 출력되지만, '짝수','홀수'의 결과는 바뀌지 않는다.
    /* 값을 기억하지 못해 매번 바꿔서 처리불가능
    const isEven = () => {
        return count1%2 === 0 
    }
    */

    //사용자가 함수를 만들어서 return 할 경우 return값을 기억하기 때문에 결과가 '짝수','홀수'로 나옴
    //count1의 값이 바뀔때만 useMemo()만 실행이 되고, count2는 값이 바뀌어도 useMemo() 호출 X
    const isEven = useMemo(() => {
        return count1%2 === 0
    })

    return (
        <div>
            <h2>카운트 : { count1 }</h2>
            <button onClick={ () => setCount1(count1+1) }>증가</button>

            <h2>카운트 : { count2 }</h2>
            <button onClick={ () => setCount2(count2+1) }>증가</button>

            <h2>
                결과 : { isEven ? '짝수' : '홀수' }
            </h2>
        </div>
    );
};

export default Test03;

/*
useMemo
- 리랜더링, 최적화
- useMemo는 컴포넌트의 성능을 최적화시킬 수 있는 대표적인 react hooks 중 하나이다.
- useMemo에서 Memo는 Memoization을 뜻한다.

memoization?
- 기존에 수행한 연산의 결괏값을 어딘가에 저장해 두고 동일한 입력이 들어오면 재활용하는 프로그래밍 기법을 말한다. 
*/