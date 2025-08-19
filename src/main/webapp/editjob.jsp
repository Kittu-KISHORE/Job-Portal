<%@page import="jobportalDTO.Job"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Job job = (Job)request.getAttribute("job"); %>


<form action="updatejob" method="post">
ID:<input type="text" readonly="readonly" value="<%=job.getId() %>" name="id"><br>
DESIGNATION:<input type="text" value="<%=job.getDesignation() %>" name="designation"><br>
SALARY:<input type="text" value="<%=job.getSalary() %>" name="salary"><br>
EXPERIENCE:<input type="text" value="<%=job.getExperience() %>" name="experience"><br>
LOCATION:<input type="text" value="<%=job.getLocation() %>" name="location"><br>
SKILL:<input type="text" value="<%=job.getSkill() %>" name="skill"><br>
<input type="submit"  value="UPDATE JOB"><br>
</form>

</body>
</html>