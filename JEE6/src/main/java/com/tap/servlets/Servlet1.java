package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	private PrintWriter out;
	private RequestDispatcher rd;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String x=req.getParameter("x"); //get will give us always string only not an integer or float.
		String y=req.getParameter("y");
		int sum=Integer.parseInt(x)+Integer.parseInt(y);
///*1 */		out=resp.getWriter();
//		
//	/*1 */	out.println("sum: "+sum);
		req.setAttribute("mysum", sum);
		rd=req.getRequestDispatcher("CallingServlet2");
		// /*1 */	rd.include(req, resp); // gives servet1 output as well as servlet2 output
		rd.forward(req, resp); //gives only whaterevr the last servelt called
	}
	

}
