<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Us</title>
<style type="text/css">
.container {
  margin: 50px auto;
  width: 640px;
  background-color: skyblue;
}
 
.login {
  position: relative;
  margin: 0 auto;
  padding: 20px 20px 20px;
  width: 310px;
  
  .login p.submit {
  text-align: right;
}
 
.login-help {
  margin: 20px 0;
  font-size: 11px;
  color: Yellow;
  text-align: center;
  text-shadow: 0 1px #2a85a1;
}

:-moz-placeholder {
  color: #c9c9c9 !important;
  font-size: 13px;
}
 
::-webkit-input-placeholder {
  color: #ccc;
  font-size: 13px;
}

.container {
  margin: 50px auto;
  width: 640px;
   
}
.login:before {
  content: '';
  position: absolute;
  top: -8px;
  right: -8px;
  bottom: -8px;
  left: -8px;
  z-index: -1;
  background: rgba(0, 0, 0, 0.08);
  border-radius: 4px;
}

.login h1 {
  margin: -20px -20px 21px;
  line-height: 40px;
  font-size: 15px;
  font-weight: bold;
  color: #555;
  text-align: center;
  text-shadow: 0 1px white;
  background: #f3f3f3;
  border-bottom: 1px solid #cfcfcf;
  border-radius: 3px 3px 0 0;
  background-image: -webkit-linear-gradient(top, whiteffd, #eef2f5);
  background-image: -moz-linear-gradient(top, whiteffd, #eef2f5);
  background-image: -o-linear-gradient(top, whiteffd, #eef2f5);
  background-image: linear-gradient(to bottom, whiteffd, #eef2f5);
  -webkit-box-shadow: 0 1px whitesmoke;
  box-shadow: 0 1px whitesmoke;
}
 
.login p {
  margin: 20px 0 0;
}

.login p:first-child {
  margin-top: 0;
}
 
.login input[type=text], .login input[type=password] {
  width: 278px;
}
 
.login p.remember_me {
  float: left;
  line-height: 31px;
}
 
.login p.remember_me label {
  font-size: 12px;
  color: #777;
  cursor: pointer;
}

.login p.remember_me input {
  position: relative;
  bottom: 1px;
  margin-right: 4px;
  vertical-align: middle;
}


</style>
</head>
<body>
<div class="container">
  <div class="login">
    <h1>Contact Us</h1>
    <form method="post" action="ContactController">
     
       <p><input type="text" name="emailid" value="" placeholder="Email"></p>
       <textarea name="comment" rows="10" cols="30" placeholder="Comment">Comment </textarea>
       <!-- <p class="remember_me">
       <label>
          <input type="checkbox" name="remember_me" id="remember_me">
          Remember me on this computer
        </label>--> 
      </p>
      <p class="submit"><input type="submit" name="commit" value="Send"></p>
    </form>
  </div>
 
 <!--   <div class="login-help">
    <p>Forgot your password? <a href="#">Click here to reset it</a>.</p>
  </div>-->
</div>
</body>
</html>