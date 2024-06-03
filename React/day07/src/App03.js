import React from 'react';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import About from './page03/About';
import Home from './page03/Home';
import Profile from './page03/Profile'
import Front from './page03/Front';

const data = [
    { title: 'html', info:'HTML 입니다.' },
    { title: 'css', info:'CSS 입니다.' },
    { title: 'javascript', info:'JAVASCRIPT 입니다.' },
    { title: 'react', info:'REACT 입니다.' },
    { title: 'vue', info:'VUE 입니다.' }
]

const App03 = () => {
    return (
        <BrowserRouter>
            <>
                <ul>
                    <li><Link to='/'>Home</Link></li>
                    <li><Link to='/about'>About</Link></li>
                    <li><Link to='/profile'>Profile</Link></li>

                    <li><Link to='/front/html'>HTML</Link></li>
                    <li><Link to='/front/css'>CSS</Link></li>
                    <li><Link to='/front/javascript'>JavaScript</Link></li>
                    <li><Link to='/front/react'>React</Link></li>
                    <li><Link to='/front/vue'>Vue</Link></li>
                </ul>
            </>

            {/* 화면에 보이는 영역 */}
            <Routes>
                <Route path='/' element={ <Home />}/>
                <Route path='/about' element={ <About />}/>
                <Route path='/profile' element={ <Profile />}/>
                <Route path='/front/:name' element={<Front data={ data }/>} />
            </Routes>

        </BrowserRouter>
    );
};

export default App03;