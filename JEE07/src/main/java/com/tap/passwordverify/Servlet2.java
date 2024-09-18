package com.tap.passwordverify;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2  extends HttpServlet{
	private PrintWriter out;
	private HttpSession session;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
		session=req.getSession();
		String userName= (String)session.getAttribute("userName"); //it will return a object so change it to string.
		out=resp.getWriter();
		out.print("Hey"+userName+"Attempts Over");
	}

}
