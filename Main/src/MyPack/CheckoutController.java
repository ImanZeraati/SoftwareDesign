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

public class CheckoutController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  // TODO Auto-generated method stub
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  //String url="jdbc:mysql://localhost:3306/";
		  //String dbName="test1";
		  //String name = request.getParameter("fullname");
		  //String userName = request.getParameter("userName");
		  //String pass = request.getParameter("pass");
		  //String addr = request.getParameter("address");
		  //String age = request.getParameter("age");
		  //String qual = request.getParameter("qual");
		  //String percent = request.getParameter("percent");
		  //String year = request.getParameter("yop");
	       String fullname = request.getParameter("firstname");
		   String emailid = request.getParameter("email");
		   String address = request.getParameter("address");
		   String city = request.getParameter("city");
		   String state = request.getParameter("state");
		   String zip = request.getParameter("zip");
		   String card = request.getParameter("cardname");
		   String cardno = request.getParameter("cardnumber");
		   String emonth = request.getParameter("expmonth");
		  
		  String eyear = request.getParameter("expyear");  
		  String cvv = request.getParameter("cvv");  
		  //String Lname = request.getParameter("lname");  
		  //String Uname = request.getParameter("username");  
		  //String Emailid = request.getParameter("emailid");  
		  //String Mobno = request.getParameter("mobno");  
		  //String Address = request.getParameter("address");  
		  //String Password1 = request.getParameter("password1");  
		  //String Password2 = request.getParameter("password2");  


		 
		  if  (fullname.isEmpty() || emailid.isEmpty()|| address.isEmpty()|| city.isEmpty()|| state.isEmpty()|| zip.isEmpty() || card.isEmpty()|| cardno.isEmpty()|| emonth.isEmpty()|| eyear.isEmpty()|| cvv.isEmpty()){
		   RequestDispatcher rd = request.getRequestDispatcher("checkout.jsp");
		   out.println("<font color=red>Please fill all the fields</font>");
		   rd.include(request, response);
		  } else {
		   
		   try {
		    Class.forName("com.mysql.jdbc.Driver");
		    

		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogindb", "root", "@mogh9594"); 
		    //Connection con = DriverManager.getConnection(url+dbName,"root", "@mogh9594");
		    String query = "insert into checkout(fullname,emailid,address,city,state,zip,card,cardno,emonth,eyear,cvv values(?,?,?,?,?,?,?,?,?,?,?)";

		    PreparedStatement ps = con.prepareStatement(query); 

		    
		   //ps.setString(3, Lname);
		    //ps.setString(4, Uname);
		    //ps.setString(5, Emailid);
		    //ps.setInt(5, Integer.parseInt(age));
		    //ps.setString(6, Mobno);
		    //ps.setString(7, Address);
		    //ps.setString(8, Password1);
		    //ps.setString(9, Password2);
		    
		    ps.setString(1, fullname);
		    ps.setString(2,emailid );
		    ps.setString(3, address);
		    ps.setString(4, city);
		    ps.setString(5, state);
		    //ps.setInt(5, Integer.parseInt(age));
		    ps.setString(6, zip);
		    ps.setString(7, card);
		    ps.setString(8, cardno);
		    ps.setString(9, emonth);
		    ps.setString(10, eyear);
		    ps.setString(11, cvv);

		    ps.executeUpdate();
		    System.out.println("Order successfuly ");
		    ps.close();
		    con.close();
		   } catch (ClassNotFoundException | SQLException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		   RequestDispatcher rd = request.getRequestDispatcher("final.jsp");
		   rd.forward(request, response);
		  }
		 }

}
