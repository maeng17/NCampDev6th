import React from 'react';
import Count from './components/Count';
import CountProvider from './context/CountContext';

import Color from './components/Color';
import ColorProvider from './context/ColorContext';

import ChangeColorProvider from './context/ChangeColorContext';
import ChangeColor from './components/ChangeColor';
import CntCountProvider from './context/CntCountContext';
import CntCount from './components/CntCount';

import CounterProvider from './context/CounterContext';
import Counter from './components/Counter';
import ToggleProvider from './context/ToggleContext';

import Todos from './components/Todos';
import TodoProvider from './context/TodoContext';

const App = () => {
  return (
    <div>
      {/* 
        contect를 사용할 컴포넌트의 상위 컴포넌트에사 Provider로 감싸주어야 한다. 
        Provider의 모든 하위 컴포넌트가 얼마나 깊이 위치해 있는지 상관없이 Context의 데이터를 읽을 슈 있더
      */}

      {/* <CountProvider>
        <Count />
      </CountProvider> */}
      
      {/* <ColorProvider>
        <CountProvider>
          <Color />
        </CountProvider>
      </ColorProvider> */}

      {/* <ChangeColorProvider>
        <CntCountProvider>
          <ChangeColor />
          <br/><br/>
          <CntCount />
        </CntCountProvider>
      </ChangeColorProvider> */}

      {/* <CounterProvider>
        <ToggleProvider>
        <Counter />
        </ToggleProvider>
      </CounterProvider> */}

      <TodoProvider>
        <ColorProvider>
          <CountProvider>
            <Todos/>
            <hr/>
            <Color />
            <hr/>
            <Count />
          </CountProvider>
        </ColorProvider>
      </TodoProvider>
    </div>
  );
};

export default App;