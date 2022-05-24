package com.empMgmt;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class empl
 */
@WebServlet("/empl")
public class empl extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/emp";
			String username = "root";
			String password = "password";
			Connection con = DriverManager.getConnection(url, username, password);
			if(con != null) {
				System.out.println("It Is Connected");
				
				String fname = request.getParameter("fname");
				String sname = request.getParameter("sname");
				String id = request.getParameter("id");
				
				String query = "insert into empl values(' " +fname+ " ' , ' " +sname+ " ',' " +id+ " ')";

				Statement st = con.createStatement();
				st.execute(query);
				
				String resultpage = "insertresult.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(resultpage);
				rd.forward(request, response);
			}
			else {
				System.out.println("Your are Not Connected");
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
