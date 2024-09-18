package com.tap.passwordverify;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
 private PrintWriter out;
private RequestDispatcher rd;
private HttpSession session;
static int count=3;

@Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String password=req.getParameter("password");
	String userName=req.getParameter("username");
	session=req.getSession();
	session.setAttribute("userName", userName);
	 session.setAttribute("password", password);
	out=resp.getWriter();
	 
	resp.setContentType("text/html");
	
	 if("sow@123".equals(password)) {
		 out.print("welcome to Home Page");
	 }
	 
	 else {
		
		 if(count>0) {
		 out.print("include password "+count+"attempts left");
		 count--;
		rd= req.getRequestDispatcher("index.html");
		rd.include(req, resp);
		 }
		 else {
			 // /*1*/  out.print("attempts over.Contact admin");
	// /*1 way */		rd= req.getRequestDispatcher("CallingServlet2");
//			rd.forward(req, resp);
			 resp.sendRedirect("CallingServlet2");
		 }
	 }
    }
}
