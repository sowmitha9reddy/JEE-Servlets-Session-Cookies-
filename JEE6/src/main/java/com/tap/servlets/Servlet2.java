package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	private PrintWriter out;
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String x=req.getParameter("x"); //get will give us always string only not an integer or float.
		String y=req.getParameter("y");
		int product=Integer.parseInt(x)*Integer.parseInt(y);
		out=resp.getWriter();
		int sum=(int)req.getAttribute("mysum");  //it iwill give us object but we need int so we need to typecast it.
		out.println("sum of number: "+sum);
		out.println("Product: "+product);

	}
}
