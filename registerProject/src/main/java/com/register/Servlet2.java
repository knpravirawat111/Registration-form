package com.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("txtName");
		String userId=request.getParameter("txtUid");
		String emailId=request.getParameter("txtEmail");
		String address=request.getParameter("txtAds");
		String dOb=request.getParameter("txtDate");
		PrintWriter out = response.getWriter();
//		out.println(name);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FormDb","root","root123");
			PreparedStatement ps =con.prepareStatement("insert into Registration_form values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, userId);
			ps.setString(3, emailId);
			ps.setString(4, address);
			ps.setString(5, dOb);   
		 int i=	ps.executeUpdate();
		if(i>0) {
			out.print("<font color='green' size=20px>Insert Value Sucssecfully</font>");
		}else {
			
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.print("<font color='red' size=40px>oops! something went wrong</font>");
		}
		
		
		
		
	}

}
