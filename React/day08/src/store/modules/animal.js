//1. 액션 생상
//모듈이름을 앞에 붙여주므로 액션명 중복 방지
const TIGER = 'animal/TIGER'
const DOG = 'animal/DOG'
const CAT = 'animal/CAT'
const CHICK = 'animal/CHICK'


//2. 액션 내보내기
export const tiger = () => ({ type: TIGER })
export const dog = () => ({ type: DOG })
export const cat = () => ({ type: CAT })
export const chick = () => ({ type: CHICK })

//3. 초기값
const initialState = { name: '돼지', crying: '꿀꿀' }

//4. 리듀서 만들기 - state, action 파라메터를 참조하여, 새로운 상태 객체를 반환한다.
//반드시 state에는 초기값을 주어야 한다.
const reducer = (state = initialState, action) => { //state: 현재 상태, action: 액션 객체
    switch(action.type){
        case TIGER:
            return {name:'호랑이', crying:'어흥'}
        case DOG:
            return {name:'강아지', crying:'멍멍'}
        case CAT:
            return {name:'고양이', crying:'애옹'}
        case CHICK:
            return {name:'병아리', crying:'뺙뺙'}
        default:
            return state
    }
}

export default reducer