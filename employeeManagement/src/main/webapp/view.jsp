<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>These are your records</title>

</head>
<body style = "font-size : 20px">
<div align = "center" class = "container">
</br>
</br>
		<h1>Here Are Your Records</h1>
		</br>
		<a href = "insert.jsp"><input type = "button" value = "Press Here" style = "font-size:20px"></a>
		</br>
		</br>
		<table>
		<thead>
		<tr>
		<th>FIRST NAME</th>
		<th>SURNAME</th>
		<th>EMAIL ID</th>
		</tr>
		</thead>
		<tbody>
<%
	try{
		String connectionURL = "jdbc:mysql://localhost:3306/emp";
		Connection connection = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(connectionURL, "root", "password");
		if(!connection.isClosed())
		{
			String query = "select * from empl";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next ()){
				%>
				<tr>
				<td><%= rs.getString("fname") %></td>
				<td><%= rs.getString("sname") %></td>
				<td><%= rs.getString("id") %></td>
				</tr>
				<%
			}
		}
		connection.close();
	} catch(Exception ex) {
		out.println("Unable to connect to database.");
	}
				%>
			
		</tbody>
		</table>
	</div>

</body>
</html>