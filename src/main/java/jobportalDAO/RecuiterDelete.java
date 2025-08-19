package jobportalDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobportalDTO.Recrutier;
@WebServlet("/deletejob")
public class RecuiterDelete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int jobid = Integer.parseInt(req.getParameter("jobid"));
		HttpSession session = req.getSession();
		Recrutier recruiter = (Recrutier) session.getAttribute("sessiondata");
		MyDAO.deleteJob(recruiter.getId(),jobid);
		
		req.setAttribute("recruiterjob", recruiter.getJobs());
		req.getRequestDispatcher("RecrutierHome.jsp").forward(req, resp);
		
	}

}
