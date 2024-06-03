import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//------------------------------------
import { Provider } from 'react-redux';
import rootReducer from './store';
//import { createStore } from 'redux'; -deprecated, 실행은 된다.
import { legacy_createStore as createStore } from 'redux';
import { composeWithDevTools } from 'redux-devtools-extension'; //리덕스 개발 도구

//const store = createStore(rootReducer); //상태변수를 따로 관리
const store = createStore(rootReducer, composeWithDevTools());

//------------------------------------


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Provider store={ store }> 
    <App />   {/* <App />>의 후손까지 모두 store를 사용해도 된다. */}
    </Provider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
