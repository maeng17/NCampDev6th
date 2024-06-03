import React from 'react';

const BoardWrite = () => {
    return (
        <div>
            <form name="boardWriteForm" id="boardWriteForm">
                <h3>글쓰기</h3>
                    <table border="1" cellpadding="7">
                        <tr>
                            <th width="100">제목</th>
                            <td>
                                <input type="text" name="subject" id="subject" size="45" />
                                <div id="subjectDiv"></div>
                            </td>
                        </tr>
                        
                        <tr>
                            <th>내용</th>
                            <td>
                                <textarea name="content" id="content" cols="50" rows="15"></textarea>
                                <div id="contentDiv"></div>
                            </td>
                        </tr>
                        
                        <tr>
                            <td colspan="2" align="center">
                                <input type="button" value="글쓰기" id="boardWriteBtn" />
                                <input type="reset" value="다시작성" />
                            </td>
                        </tr>
                    </table>
                </form>
        </div>
    );
};

export default BoardWrite;