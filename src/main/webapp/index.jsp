<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Job Portal</title>
    <!-- Bootstrap CSS -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <style>
        body {
            background: linear-gradient(135deg, #4facfe, #00f2fe);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .card {
            border-radius: 20px;
            box-shadow: 0px 8px 20px rgba(0,0,0,0.2);
            transition: transform 0.3s;
        }
        .card:hover {
            transform: scale(1.03);
        }
        a.btn-custom {
            transition: all 0.3s ease;
        }
        a.btn-custom:hover {
            transform: translateY(-3px);
            box-shadow: 0px 6px 15px rgba(0,0,0,0.3);
        }
    </style>
</head>
<body>
    <div class="container text-center">
        <div class="card p-5 bg-light">
            <h2 class="mb-4 text-primary">Welcome to Job Portal</h2>
            <div class="d-grid gap-3">
                <a href="rectuiersignup.jsp" class="btn btn-primary btn-lg btn-custom">Recruiter Signup</a>
                <a href="rectuierlogin.jsp" class="btn btn-success btn-lg btn-custom">Recruiter Login</a>
                <a href="applicantSignup.jsp" class="btn btn-warning btn-lg btn-custom">Applicant Signup</a>
                <a href="applicantLogin.jsp" class="btn btn-danger btn-lg btn-custom">Applicant Login</a>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
</body>
</html>