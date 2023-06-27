package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactController extends HttpServlet{
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  // TODO Auto-generated method stub
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  //String url="jdbc:mysql://localhost:3306/";
		  //String dbName="test1";
		  String Emailid = request.getParameter("emailid");  
		  String Comment = request.getParameter("comment"); 
		  //String Uname = request.getParameter("username");  
		  //String Emailid = request.getParameter("emailid");  
		  //String Mobno = request.getParameter("mobno");  
		  //String Address = request.getParameter("address");  
		  //String Password1 = request.getParameter("password1");  
		  //String Password2 = request.getParameter("password2");  


		 
		  if (Emailid.isEmpty() || Comment.isEmpty()) {
		   RequestDispatcher rd = request.getRequestDispatcher("final.jsp");
		   out.println("<font color=red>Please fill all the fields</font>");
		   rd.include(request, response);
		  } else {
		   
		   try {
		    Class.forName("com.mysql.jdbc.Driver");
		    

		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/checkout", "root", "@mogh9594"); 
		    //Connection con = DriverManager.getConnection(url+dbName,"root", "@mogh9594");
		    String query = "insert into contact values(?,?)";

		    PreparedStatement ps = con.prepareStatement(query); 

		    ps.setString(1, Emailid);
		    ps.setString(2, Comment);
		   //ps.setString(3, Lname);
		    //ps.setString(4, Uname);
		    //ps.setString(5, Emailid);
		    //ps.setInt(5, Integer.parseInt(age));
		    //ps.setString(6, Mobno);
		    //ps.setString(7, Address);
		    //ps.setString(8, Password1);
		    //ps.setString(9, Password2);
		    

		    ps.executeUpdate();
		    System.out.println("successfuly inserted");
		    ps.close();
		    con.close();
		   } catch (ClassNotFoundException | SQLException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		   RequestDispatcher rd = request.getRequestDispatcher("employeedetails.jsp");
		   rd.forward(request, response);
		  }
		 }

}
