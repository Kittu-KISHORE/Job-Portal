package jobportalDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportalDTO.Job;
import jobportalDTO.Recrutier;

@WebServlet("/updatejob")
public class UpdateJob extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// fetch job data from form
		int jobid = Integer.parseInt(req.getParameter("id"));
		String designation = req.getParameter("designation");
		double salary = Double.parseDouble(req.getParameter("salary"));
		String experience = req.getParameter("experience");
		String location = req.getParameter("location");
		String skill = req.getParameter("skill");
		// get recruiter data from session
		Recrutier recruiter = (Recrutier) req.getSession().getAttribute("sessiondata");
		
		Job dbjob = MyDAO.findJobByJobId(jobid);
	
//		Job job = new Job(designation, salary, experience, location, skill,recruiter ,dbjob.getApplication());
		dbjob.setId(jobid);
		dbjob.setDesignation(designation);
		dbjob.setSalary(salary);
		dbjob.setExperience(experience);
		dbjob.setLocation(location);
		dbjob.setSkill(skill);
		MyDAO.updateJob(dbjob);
		
		// render recruiterhome.jsp after adding one job
		req.setAttribute("recruiterjob", recruiter.getJobs());
		req.getRequestDispatcher("RecrutierHome.jsp").forward(req, resp);
	}

}
