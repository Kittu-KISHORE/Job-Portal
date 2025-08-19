<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url("https://cdn.pixabay.com/photo/2025/04/18/02/44/search-engine-optimization-9541483_1280.jpg");
            background-size: cover;
            background-position: center;
        }

        h1 {
            text-align: center;
            color: white;
            margin-top: 50px;
            text-shadow: 1px 1px 5px #000;
        }

        .container {
            background-color: rgba(255, 255, 255, 0.95);
            width: 350px;
            margin: 100px auto;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        h2 {
            margin-bottom: 25px;
            color: #34495e;
        }

        input[type="text"],
        input[type="password"] {
            width: 90%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 14px;
        }

        input[type="submit"] {
            width: 95%;
            background-color: #3498db;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #2980b9;
        }

        p {
            margin-top: 20px;
            font-size: 14px;
            color: #555;
        }

        a {
            color: #2ecc71;
            text-decoration: none;
            font-weight: bold;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
	 <h1>Welcome to Recruiter Login</h1>

    <div class="container">
        <h2>Login</h2>
        <form action="loginrecruiter" method="post">
            <input type="text" name="orgName" placeholder="Enter organization name" required>
            <input type="password" name="password" placeholder="Enter password" required>
            <input type="submit" value="Login">
        </form>

        <p>Don't have an account?
            <a href="rectuiersignup.jsp">Create one</a>
        </p>
    </div>

</body>
</html>