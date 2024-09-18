package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		
//		String un=req.getParameter("userName");
//		PrintWriter re=resp.getWriter();
//		RequestDispatcher rs=req.getRequestDispatcher("logincalling");
//		re.print("userName: " +un +"Welcome to Registarion page"); // when we write code like this the display statemnet in servlet 1 are ignored.
//		
//		
//		rs.forward(req, resp);
//	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String un=req.getParameter("userName");
		PrintWriter re=resp.getWriter();
		RequestDispatcher rs=req.getRequestDispatcher("logincalling");
		re.print("userName: " +un +"Welcome to Registarion page \n"); // when we write code like this the display statemnet in servlet 1 are ignored.
		
		
		rs.include(req, resp);    //this will give both the ouputs.
	}

}
