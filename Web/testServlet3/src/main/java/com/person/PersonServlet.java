package com.person;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//데이터
		String name = request.getParameter("name");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String color = request.getParameter("color");
		String hobby = request.getParameter("hobby");
		String subject = request.getParameter("subject");
		
		
		
		
		//응답	
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =  response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("#textSpan { font-size: 15pt; font-weight: bold; color:red; }");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<li>이름 : " + name + "<br/></li>");
		
		if(  gender == 0) out.print("성별 : 남자 <br/>");
		else out.print("<li>성별 : 여자 <br/></li>");
		
		out.println("<li>색깔 : " + color + "<br/></li>");
		
		if(  hobby == null) out.print("취미 : 취미가 없습니다.");
		else out.print("<li>취미 : " + hobby + "<br/></li>");
		
		out.println("<li>과목 : " + subject + "<br/></li>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
