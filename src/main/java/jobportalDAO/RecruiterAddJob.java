package jobportalDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobportalDTO.Job;
import jobportalDTO.Recrutier;
@WebServlet("/addjob")
public class RecruiterAddJob extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String designation = req.getParameter("designation");
	        double salary = Double.parseDouble(req.getParameter("salary"));
	        String experience = req.getParameter("experience");
	        String location = req.getParameter("location");
	        String skill = req.getParameter("skill");

	        HttpSession sees = req.getSession();
	        Recrutier recrutier = (Recrutier) sees.getAttribute("sessiondata");

	        if (recrutier != null) {
	            
	            Job job = new Job(designation, salary, experience, location, skill, recrutier, null);
	           
	            MyDAO.createJob(recrutier.getId(), job);

	            // 🔁 Refresh jobs from DB after insertion
	           // recrutier.setJobs(MyDAO.findJobsByRecrutierId(recrutier.getId()));
	            
	            req.setAttribute("recruiterjob", recrutier.getJobs());
	            req.getRequestDispatcher("RecrutierHome.jsp").forward(req, resp);
	        } else {
	            resp.sendRedirect("rectuierlogin.jsp"); // session expired or invalid
	        }
	}
   

}
