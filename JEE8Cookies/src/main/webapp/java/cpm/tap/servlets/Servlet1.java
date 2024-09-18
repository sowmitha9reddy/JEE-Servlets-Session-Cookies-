package cpm.tap.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String userName=req.getParameter("userName");
    	String password=req.getParameter("password");
    	
    	Cookie cookies1=new Cookie("userName", userName);
    	Cookie cookies2=new Cookie("password", password);
    	
    	resp.addCookie(cookies1);
    	resp.addCookie(cookies2);
    	System.out.println("added cookies succesuflly");
    	
    	resp.sendRedirect("callServlet2");
    	
     
    	
    }
     
}
