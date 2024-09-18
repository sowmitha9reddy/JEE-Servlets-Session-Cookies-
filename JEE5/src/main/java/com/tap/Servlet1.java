package com.tap;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String url="jdbc:mysql://localhost:3306/jeee4";
			String userName="root";
			String password="root";
			Connection con;
			PreparedStatement pst;
			PrintWriter out;
			String sql="INSERT INTO `members`(`firstName`,`lastName`,`mail`) VALUES(?,?,?)";
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded");
				con=DriverManager.getConnection(url,userName,password);
				System.out.println("Connwction sucess");
				pst=con.prepareStatement(sql);
				pst.setString(1, req.getParameter("firstName"));
				pst.setString(2, req.getParameter("lastName"));;
				pst.setString(3, req.getParameter("mail"));
				int n=pst.executeUpdate();
				out=resp.getWriter();
				if(n>0) {
					out.print("registartion sucessfull");
				}
				else {
					out.print("registration failure");
				}
				
			} 
			catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
				
			}
		//System.out.println("welcome to servlet1");
		}
	   
	}

