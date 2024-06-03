import React, { useRef, useState } from 'react';

const Test10 = () => {
    const [ data, setData ] = useState([])
    const [ dto, setDto ] = useState({ //1인분
        name: '',
        age: ''
    })
    const { name, age } = dto
    const nameRef = useRef()
    const seq = useRef(1) //1, 2, 3, 4, 5 ~~

    const onInput = (e) => {
        const{ name, value } = e.target
        setDto({
            ...dto,
            [name] : value
        })

        
    }

    const onAdd = (e) => {
        e.preventDefault() //브라우저의 고유의 동작을 중단시키는 역할

        if(!name || !age) return

        setData([
            ...data,
            {
                seq: seq.current++,
                name : name,
                age: age
            }
        ])
        
        //초기화
        setDto({
            name: '',
            age: ''
        })

        nameRef.current.focus()
    }

    

    return (
        <div>
            <form onSubmit={ onAdd }>
                이름 : <input type='text' name='name' value={ name } onChange={ onInput } ref={ nameRef }/>
                <br/>
                나이 : <input type='text' name='age' value={ age } onChange={ onInput } />
                <br/>
                <button type='submit'>추가</button>
            </form>
            <hr/>
            <ul>
                {
                    data.map((item, index) => <li key={ item.seq }>
                        { item.seq } / { item.name } / { item.age }
                    </li>)
                }
            </ul>
        </div>
    );
};

export default Test10;