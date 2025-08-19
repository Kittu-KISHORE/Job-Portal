package jobportalDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobportalDTO.Recrutier;

@WebServlet("/loginrecruiter")
public class RecruiterSignin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String orgName = req.getParameter("orgName");
	        String password = req.getParameter("password");

	        Recrutier recruiter = MyDAO.recrutierLogin(orgName, password);
	        if (recruiter != null) {
	            HttpSession session = req.getSession();
	            session.setAttribute("sessiondata", recruiter);

	            // ❗ Don't use recruiter.getJobs() here — reload from DB instead:
	            req.setAttribute("recruiterjob", MyDAO.findJobsByRecrutierId(recruiter.getId()));
	            req.getRequestDispatcher("RecrutierHome.jsp").forward(req, resp);
	        } else {
	            req.setAttribute("message", "Invalid credentials");
	            req.getRequestDispatcher("rectuierlogin.jsp").forward(req, resp);
	        }
	}

}
