package com.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	//URL에서 바로 JSP가 실행되지 않게 하기 위해서 /WEB-INF 에 jsp 파일을 작성한다
	//http://localhost:8080/Chapter06/WEB-INF/view/hello.jsp 실행할 수 없다.
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello() { //사용자 콜백 메서드
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "Hello Spring MVC!!");
		//mav.setViewName("hello"); //JSP의 파일명 => /view/hellp.jsp
		mav.setViewName("/view/hello");
		
		return mav;
	}
	
	/*
	스프링에서 리턴타입이 String이면 단순 문자열이 아닐 JSP의 파일 명으로 인식한다, 
		=> WEB-INF/welcome.jsp를 칮는다.
		만약에 단순 문자열로 처리하고 싶을 때는 @ResponseBady를 쓰면 된다.
	*/
	
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET, produces = "text/html; charset=UTF-8")
	//@GetMapping(value="/hello2.do")
	@ResponseBody
	public String hello2() {
		//return "welcome";
		return "인녕하세요";
	}

}
