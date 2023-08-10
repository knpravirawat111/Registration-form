package com.search;

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
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Table;

/**
 * Servlet implementation class SearchServlet
 */

public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sName=request.getParameter("srchName");
		String sUid=request.getParameter("srchUid");
		PrintWriter outx = response.getWriter();
//		response.setContentType("text/html");
		  
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/FormDb","root","root123");
			PreparedStatement ps = con.prepareStatement("select * from Registration_form");
			ps.setString(1, sName);
			ps.setString(2, sUid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			String name1=rs.getString(1);
			outx.println(name1);
			String Uid1=rs.getString(2);
			outx.println(Uid1);
			String email1=rs.getString(3);  
			outx.println(email1);
			String address1=rs.getString(4);
			outx.println(address1);
			String Dob1=rs.getString(5);
			outx.println(Dob1);
			}
//			 outx.println("<table><tr><td>Name</td><td>UserId</td><td>email</td><td>Address</td><td>Dob</td></tr>");		      
//        	 outx.println("<tr><td>"+rs.getString("name")+"</td><td>"+rs.getString("userId")+"</td><td>"+rs.getString("email")+"</td><td>"+rs.getString("address")+"</td><td>"+rs.getString("DOB")+"</td></tr>");  
//             outx.println("</table>");
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
