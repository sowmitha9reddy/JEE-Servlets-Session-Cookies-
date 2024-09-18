package com.tap.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayData extends HttpServlet{
	private PrintWriter pw; //to display data on the server it is a servlet.

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName=req.getParameter("userName");
		System.out.println(userName);
		pw=resp.getWriter();
		pw.println("welcome user"+userName.toUpperCase());
	}
}


