<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!--  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">-->

<style type="text/css">


body{

 background-image: url(https://cdn.pixabay.com/photo/2018/09/20/09/42/application-3690356_1280.jpg);
 background-repeat: no-repeat;
 background-size: 100% 120%;
  opacity: 0.8;
     
}
#parent{
	
	 display: flex; 
	  flex-direction: column;
	 justify-content: center;
	 align-items: center;
	
	height: 600px;
	width: 900px;
	margin-top: 200px ;
	margin-left : 500px;



}
#details{
 
	 display: flex;
	 flex-direction: column;
	 justify-content: center;
	 align-items: center;
	 height: 350px;
	   width: 350px;
	 border : 1px solid black;
	 background-color: white;
	 padding : 40px;;
	 line-height: 20px;
	 border-radius:  30px;
	  box-shadow: 0 0 15px black ;
 
}
</style>

</head>
<body>

	<div id = "parent">
		<h1>Recruiter SignUp</h1>
		
		<form action="signup" method ="post" id="details">
		
			<label for="org_name">Organization Name:</label>
			<input type= "text" id="org_name" name="orgName">
			<br>
			<label for="rec_pass">Password:</label>
			<input type= "text" id="rec_pass" name="password"> 
			<br>
			<label for="rec_about">Organization About:</label>
			<input type= "text" id="rec_about"  name="about">
			<br>
			<label for="org_web">Organization Web-site</label>
			<input type= "text" id="org_web" name="website"> 
			<br>
			<br>
			<label for="org_count">Organization Employee-Count</label>
			<input type= "number" id="org_count" name="empcount"> 
			<br>
			<input type="submit">
		</form>
	
	</div>
</body>


















</html>