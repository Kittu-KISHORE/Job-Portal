package jobportalDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportalDTO.Job;
@WebServlet("/editjob")
public class Edit extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int jobid = Integer.parseInt(req.getParameter("jobid"));
		Job job = MyDAO.findJobByJobId(jobid);
		
		req.setAttribute("job", job);
		
		req.getRequestDispatcher("editjob.jsp").forward(req, resp);
		
	}
}
