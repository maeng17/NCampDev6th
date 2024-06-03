package abstract_;

public class CalendarMain {

	public static void main(String[] args) {
		CalendarEx aa = new CalendarEx();
		aa.calc();
		aa.display();

	}

}

/*
[문제] 만년달력

[클래스]
CalendarEx

[필드]
원하는 것으로 직접 잡기

[메소드] 
년도, 월을 입력하여 달력을 작성하시오 (생성자, 스캐너)
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드를 찾아서 수행)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드를 찾아서 수행)
         display() -> 출력

[클래스]
CalendarMain

[실행결과]
년도 입력 : 2002
월 입력 : 10	

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31
*/