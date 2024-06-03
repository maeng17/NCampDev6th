import React from 'react';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import Main from './Main';
import WriteForm from './WriteForm';
import Login from './Login';
import BoardWrite from './BoardWrite';
import BoardList from './BoardList';

import '../css/project.css';


const Project = () => {
    return (
        <BrowserRouter>
            <>
                <div className='header'>
                    <Link to='/'>
                        <img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRIWPWBdrTPypiFhhtNZI_DjYF8ieQodzAwjUajU0tRtw&s'/>
                    </Link>
                    <h2>React 프로젝트</h2>
                </div>
                
                <nav className='projectnav'>
                    <ul>
                        <li><Link to='/writeForm'>회원가입</Link></li>
                        <li><Link to='/login'>로그인</Link></li>
                        <li><Link to='/boardWrite'>글쓰기</Link></li>
                        <li><Link to='boardList'>목록</Link></li>
                    </ul>
                </nav>

                {/* 화면에 보이는 영역 */}
                <Routes>
                    <Route path='/' element={ <Main />} />
                    <Route path='/writeForm' element={<WriteForm />} />
                    <Route path='/login' element={ <Login />} />
                    <Route path='/boardWrite' element={<BoardWrite />} />
                    <Route path='/boardList' element={<BoardList />} />|
                </Routes>
            </>
        </BrowserRouter>
    );
};

export default Project;