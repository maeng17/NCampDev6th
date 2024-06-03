import React from 'react';
import Test01 from './components/Test01';
import Test02 from './components/Test02';
import Movies from './components/Movies';
import Test03 from './components/Test03';
import Test04 from './components/Test04';
import Test05 from './components/Test05';

const App = () => {
  return (
    <div>
      {/* <Test01 /> */}
      {/* <Test02 /> */}
      {/* <Movies /> */}
      {/* <Test03 /> */}
      {/* <Test04 /> */}
      <Test05 />
    </div>
  );
};

export default App;

/*
비동기 통신 - ajax
서버에 새로고침 없이 요청할 수 있게 도와준다.
서버로 네트워크 요청을 보내고 응답을 받을 수 있도록 도와준다.

1. jQuery - $.ajax()
2. js - fetch()
        fetch() -> json 형식으로 가져온다.
3. 설치 - axios
          axios.get() -> object 형식으로 가져온다. 

- 외부 API 비동기 통신을 위해서 fetch()를 이용한다.
- fetch()에 API 경로를 적어주면 promise가 반환된다.
fetch( url, [options] )

fetch(url)
.then(콜백) - 응답 성공
.catch(콜백) - 응답 실패

axios.get(url)
     .then(콜백) - 응답 성공
     .catch(콜백) - 응답 실패

npm install axios / yarn add axios
*/