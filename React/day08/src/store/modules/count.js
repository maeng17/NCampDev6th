//1. 액션 생상
//모듈이름을 앞에 붙여주므로 액션명 중복 방지
const INCREMENT = 'count/INCREMENT'
const DECREMENT = 'count/DECREMENT'
const RESET = 'count/RESET'


//2. 액션 내보내기
export const increment = () => ({type: INCREMENT})
export const decrement = () => ({type: DECREMENT})
export const reset = () => ({type: RESET})

//3. 초기값
const initialState = {count : 0}

//4. 리듀서 만들기 - state, action 파라메터를 참조하여, 새로운 상태 객체를 반환한다.
//반드시 state에는 초기값을 주어야 한다.
const reducer = (state=initialState, action) => { //state: 현재 상태, action: 액션 객체
    switch(action.type){
        case INCREMENT:
            return {count : state.count+1}
        case DECREMENT:
            return {count : state.count-1}
        case RESET:
            return {count : 0}
        default:
            return state
    }
}

export default reducer
