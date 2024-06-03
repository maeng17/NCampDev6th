
-- Oracle
CREATE TABLE board(
 seq NUMBER NOT NULL, -- 글번호 (시퀀스 객체 이용)
 id VARCHAR2(20) NOT NULL, -- 아이디
 name VARCHAR2(40) NOT NULL, -- 이름
 email VARCHAR2(40), -- 이메일
 subject VARCHAR2(255) NOT NULL, -- 제목
 content VARCHAR2(4000) NOT NULL, -- 내용 
 ref NUMBER NOT NULL, -- 그룹번호
 lev NUMBER DEFAULT 0 NOT NULL, -- 단계
 step NUMBER DEFAULT 0 NOT NULL, -- 글순서
 pseq NUMBER DEFAULT 0 NOT NULL, -- 원글번호
 reply NUMBER DEFAULT 0 NOT NULL, -- 답변수
 hit NUMBER DEFAULT 0, -- 조회수
 logtime DATE DEFAULT SYSDATE
);

-- Oracle [시퀀스]
CREATE SEQUENCE seq_board NOCACHE NOCYCLE;


-- MySQL
CREATE TABLE board(
 seq BIGINT PRIMARY KEY AUTO_INCREMENT, -- 글번호
 id VARCHAR(20) NOT NULL, -- 아이디
 name VARCHAR(40) NOT NULL, -- 이름
 email VARCHAR(40), -- 이메일
 subject VARCHAR(255) NOT NULL, -- 제목
 content VARCHAR(4000) NOT NULL, -- 내용 
 ref BIGINT NOT NULL, -- 그룹번호
 lev BIGINT DEFAULT 0 NOT NULL, -- 단계
 step BIGINT DEFAULT 0 NOT NULL, -- 글순서
 pseq BIGINT DEFAULT 0 NOT NULL, -- 원글번호
 reply BIGINT DEFAULT 0 NOT NULL, -- 답변수
 hit BIGINT DEFAULT 0, -- 조회수
 logtime DATE DEFAULT (current_date)
);


[ex] MySQL
logtime DATE DEFAULT (current_date)	-- 현재 날짜 반환, 반드시 괄호를 써야 한다.
logtime DATETIME DEFAULT (current_time)	-- 현재 시간 반환, 반드시 괄호를 써야 한다.
logtime DATETIME DEFAULT current_timestamp	-- 현재 날짜&시간 반환
logtime DATETIME DEFAULT now()	-- 현재 날짜&시간 반환


--MySQL 게시판작성 procedure
DELIMITER $$
create procedure boardWrite(in id_val varchar(20)
							, name_val varchar(40)
                            , email_val varchar(40)
                            , subject_val varchar(255)
                            , content_var varchar(4000))
BEGIN
	insert into board(id, name, email, subject, content, ref)
    values(id_val
		   , name_val
		   , email_val
		   , subject_val 
		   , content_val
           , 0
           );
	update board set ref = last_insert_id() where seq=last_insert_id();
END $$

DELIMITER ;

--MySQL 게시판삭제 procedure
DELIMITER // 

CREATE PROCEDURE boardDelete(IN seq_val BIGINT)
BEGIN
    UPDATE board SET reply = reply - 1
    WHERE seq = (SELECT p.pseq FROM (SELECT pseq FROM board WHERE seq = seq_val) AS p);

    UPDATE board SET subject = CONCAT('[원글이 삭제된 답글]', subject) WHERE pseq = seq_val;

    DELETE FROM board WHERE seq = seq_val;
END //

DELIMITER ;