package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet{
	//Service method is inherited
	//Service method is like(calls doget and doPost);
	/*by default method calls doget only*/
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String un=req.getParameter("userName");
    	PrintWriter out=resp.getWriter();
    	out.print("welcome to doGet homapge");   //doget what we given as input that will display serach bar but dopost hides it.
    }
       @Override
       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       	String un=req.getParameter("userName");
       	PrintWriter out=resp.getWriter();
       	out.print("welcome to Http DoPost");
       }
	
}
