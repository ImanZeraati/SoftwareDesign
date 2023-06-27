<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<style>
div.ex {
    background-color: yellow;
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
   
}
body {
  background-color: lightblue;
  font-family: Arial, Helvetica, sans-serif;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 20%;
}
input[type=text], input[type=password],input[type=email],input[type=tel] {
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

</style>
<body>
	<center><h1>Registration Form</h1></center>
	<div class="ex">
		<form action="RegistrationController" method="post"  name="RegForm" onsubmit="return GEEKFORGEEKS()">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname" /></td>
				</tr>
				<tr>
					<td>Middle Name</td>
					<td><input type="text" name="mname" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname" /></td>
				</tr>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><input type="email" name="emailid" /></td>
				</tr>
				<tr>
					<td>Mobile No</td>
					<td><input type="tel" name="mobno"  pattern="[7-9]{1}[0-9]{9}"  /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password1" /></td>
				</tr>
				<tr>
					<td>Re-Password</td>
					<td><input type="password" name="password2" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
			<br><br>
			<a href="http://localhost:8081/web_pro/login.html">Login</a>
		</form>
		<br>
	
	
		
	</div>
	
	<script> 
function GEEKFORGEEKS()                                    
{ 
               
    var email = document.forms["RegForm"]["emailid"];    
    var phone = document.forms["RegForm"]["mobno"];  
    
    var password = document.forms["RegForm"]["password1"];
    var rpassword = document.forms["RegForm"]["password2"];  
    
    
  
       
    if (email.value == "")                                   
    { 
        window.alert("Please enter a valid e-mail address."); 
        email.focus(); 
        return false; 
    } 
   
    if (phone.value == "")                           
    { 
        window.alert("Please enter your phone number Prefect."); 
        phone.focus(); 
        return false; 
    } 
   
    if (password == '') 
        alert ("Please enter Password"); 
          
   
    else if (rpassword == '') 
        alert ("Please enter confirm password"); 
          
    
   // else if (password != rpassword) { 
       // alert ("\nPassword did not match: Please try again...") 
        //return false; 
    //} 
    
    else{ 
        alert("Password Match: Welcome Urgan Gear") 
        return true; 
    } 
    
   
    
}</script> 
	
</body>


</html>