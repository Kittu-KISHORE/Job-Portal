package jobportalDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportalDTO.Recrutier;
@WebServlet("/signup")
public class RecruiterSignUp extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String orgName = req.getParameter("orgName");
		String about = req.getParameter("about");
		String password = req.getParameter("password");
		String website = req.getParameter("website");
		int empCount = Integer.parseInt(req.getParameter("empcount"));
	
		Recrutier recruiter = new Recrutier(orgName,about,password,website,empCount);
		
		MyDAO.recruiterSignup(recruiter);
		resp.sendRedirect("rectuierlogin.jsp");
	}
}
