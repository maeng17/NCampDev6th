import React, { useState } from 'react';

const WriteForm = () => {
    const [memberData, setMemberData] = useState([])
    
    const onSign = () => {
        
    }

    return (
        <div>
            <form>
                <table>
                    <tr>
                        <th width="100">이름</th>
                        <td>
                            <input type="text" name="name" id="name" placeholder="이름 입력"/>
                            <div id="nameDiv"></div>
                        </td>
                    </tr>
                    
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

                    <tr>
                        <th>재확인</th>
                        <td>
                            <input type="password" name="repwd" id="repwd" size="30" placeholder="비밀번호 입력"/>
                        </td>
                    </tr>

                    <tr>
                        <th>이메일</th>
                        <td>
                            <input type="text" name="email1"/>
                            @
                            <input type="text" name="email2" id="email2"/>
                            
                            <input type="email" name="email3" id="email3" list="email3_list" />
                            <datalist id="email3_list">
                                <option value="직접입력"  />
                                <option value="naver.com"  />
                                <option value="hanmail.com"/>
                                <option value="gmail.com"/>
                            </datalist>
                        </td>
                    </tr>

                    <tr>
                        <th>휴대전화</th>
                        <td>
                            <select name="tel1">
                                <option value="010">010</option>
                                <option value="011">011</option>
                                <option value="019">019</option>
                            </select>
                            -
                            <input type="text" name="tel2" size="4" maxLength="4"/>
                            -
                            <input type="text" name="tel3" size="4" maxLength="4"/>
                        </td>
                    </tr>

                    <tr>
                        <td colSpan="2" align="center">
                            <button onClick={ onSign }>회원가입</button>
                            <input type="reset" value="다시입력" />
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    );
};

export default WriteForm;