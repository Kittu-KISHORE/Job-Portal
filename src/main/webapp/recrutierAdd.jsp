<%@page import="jobportalDTO.Recrutier"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #74ebd5, #acb6e5);
            margin: 0;
            padding: 50px;
        }

        .form-container {
            background-color: white;
            padding: 30px;
            max-width: 600px;
            margin: auto;
            border-radius: 10px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }

        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 16px;
        }

        button {
            width: 100%;
            padding: 12px;
            background-color: #3498db;
            color: white;
            border: none;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
        }

        button:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>


<%HttpSession sees = request.getSession();
Recrutier recruit = (Recrutier)sees.getAttribute("sessiondata");%>
<% if(recruit !=null){%>
<h3><%=recruit.getOrgName()%></h3>
<%} %>

<div class="form-container">
    <h2>Add New Job</h2>
    <form action="addjob" method="post">
        
        <label for="designation">Designation</label>
        <input type="text" name="designation" id="designation" required>

        <label for="salary">Salary</label>
        <input type="number" name="salary" id="salary" required>

        <label for="experience">Experience (years)</label>
        <input type="text" name="experience" id="experience" required>

        <label for="location">Location</label>
        <input type="text" name="location" id="location" required>

        <label for="skill">Required Skill</label>
        <input type="text" name="skill" id="skill" required>

        <button type="submit">Add Job</button>
    </form>
</div>


</body>
</html>