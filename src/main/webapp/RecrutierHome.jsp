<%@page import="jobportalDTO.Job"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <style>
        * {
            box-sizing: border-box;
        }

        html, body {
            margin: 0;
            padding: 0;
            height: 100vh;
            width: 100vw;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(-45deg, #74ebd5, #acb6e5, #fddb92, #d1fdff);
            background-size: 400% 400%;
            animation: gradientBG 15s ease infinite;
        }

        @keyframes gradientBG {
            0% { background-position: 0% 50%; }
            50% { background-position: 100% 50%; }
            100% { background-position: 0% 50%; }
        }

        .container {
            background-color: white;
            padding: 40px;
            border-radius: 12px;
            max-width: 1000px;
            margin: 50px auto;
            box-shadow: 0 8px 20px rgba(0,0,0,0.15);
            animation: fadeIn 1s ease-in-out;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        h1 {
            text-align: center;
            color: #2c3e50;
            margin-bottom: 30px;
        }

        .job-table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        .job-table th, .job-table td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: center;
        }

        .job-table th {
            background-color: #3498db;
            color: white;
        }

        .job-table tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        .create-job-link {
            display: block;
            text-align: center;
            font-size: 16px;
            color: #2980b9;
            text-decoration: none;
            font-weight: bold;
            margin-top: 20px;
            transition: color 0.3s ease;
        }

        .create-job-link:hover {
            color: #1a5276;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Your Posted Jobs</h1>

        <div style="text-align: center;">
            <a href="recrutierAdd.jsp" class="create-job-link">+ Create New Job</a>
        </div>

        <%
        	List<Job> jobs = (List)request.getAttribute("recruiterjob");
     
            
        %>
            <table class="job-table">
                <tr>
                    <th>ID</th>
                    <th>Designation</th>
                    <th>Salary</th>
                    <th>Experience</th>
                    <th>Location</th>
                    <th>Skill</th>
                    <th>EDIT</th>
					<th>DELETE</th>
					<th>VIEW APPLICATIONS</th>
                </tr>
                
                <% if (jobs != null && !jobs.isEmpty()) {%>
                <% for (Job job : jobs) { %>
                <tr>
                    <td><%= job.getId() %></td>
                    <td><%= job.getDesignation() %></td>
                    <td><%= job.getSalary() %></td>
                    <td><%= job.getExperience() %></td>
                    <td><%= job.getLocation() %></td>
                    <td><%= job.getSkill() %></td>
					<td><a href="editjob?jobid=<%= job.getId() %>">EDIT</a> </td>
					<td><a href="deletejob?jobid=<%= job.getId() %>">DELETE</a> </td>
					<td><a href="viewapplications">VIEW APPLICATIONS</a> </td>
		
                </tr>
                <% } %>
            </table>
        <% } else { %>
            <p style="text-align: center; color: #777; margin-top: 20px;">No jobs available yet.</p>
        <% } %>
        
        <a href="logout">LOGOUT</a>
    </div>


</body>
</html>