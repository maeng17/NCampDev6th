package com.calc;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc") // 어노테이션
public class calcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//데이터
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		
		//응답
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print(x + " + " + y + " = " + (x+y) + "<br/>");
		out.print(x + " - " + y + " = " + (x-y) + "<br/>");
		out.print(x + " * " + y + " = " + (x*y) + "<br/>");
		out.print(x + " / " + y + " = " + String.format("%.2f", ((double)x/y)) + "<br/>");
		out.print("</body>");
		out.print("</html>");
	}

}
