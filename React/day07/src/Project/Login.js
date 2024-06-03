import React, { useState } from 'react';

const Login = () => {

    return (
        <div>
            <form>
                <tr>
                    <th>아이디</th>
                    <td>
                        <input type="text" name="id" id="id" size="25" placeholder="아이디 입력"/>
                        <input type="hidden" id="check" value=""/>
                        <div id="idDiv"></div>
                    </td>
                </tr>

                <tr>
                    <th>비밀번호</th>
                    <td>
                        <input type="password" name="pwd" id="pwd" size="30" placeholder="비밀번호 입력"/>
                        <div id="pwdDiv"></div>
                    </td>
                </tr>
                <br/>
                <tr>
                    <td colSpan="2" align="center">
                        <input type="button" value="로그인" id="loginBtn" />
                    </td>
                </tr>
            </form>
        </div>
    );
};

export default Login;