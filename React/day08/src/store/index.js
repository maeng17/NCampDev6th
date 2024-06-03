import { combineReducers } from 'redux';

import color from './modules/color.js';
import count from './modules/count';
import animal from './modules/animal';

export default combineReducers({
    color, //color: color //color.js를 의미

    count, //count: count

    animal

})