import React from 'react';
import Dog from './components/Dog';
import Test01 from './components/Test01';
import Test02 from './components/Test02';
import Test03 from './components/Test03';
import Test04 from './components/Test04';
import Test05 from './components/Test05';

const App = () => {
  return (
    <div>
      {/* 최상단에는 반드시 <div></div>로 감싸주어야 한다. */}
      <Dog />
      <hr/>
      <Dog />
      <hr/>
      <Test01/>
      <hr/>
      <Test02/>
      <hr/>
      <Test03/>
      <hr/>
      <Test04/>
      <hr/>
      <Test05/>
    </div>
  );
};

export default App;