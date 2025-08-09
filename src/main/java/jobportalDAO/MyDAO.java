package jobportalDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jobportalDTO.Applicant;
import jobportalDTO.Application;
import jobportalDTO.Job;
import jobportalDTO.Recrutier;

public class MyDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	
	
	
	public static void recruiterSignup(Recrutier recruiter) {
		et.begin();
		em.persist(recruiter);
		et.commit();
	}
	
	public static Recrutier recrutierLogin(String orgName, String password) {
		Query query = em.createNamedQuery("select re from Recrutier re where re.orgName=?");
		query.setParameter(1, orgName);
		Recrutier dbRecrutier =(Recrutier)query.getSingleResult();
		if(dbRecrutier!=null && dbRecrutier.getOrgPassword().equals(password)) return dbRecrutier;
			
		return null;
		
	}
	
	
	public static void createJob(int recrutierId, Job job) {
		Recrutier recrutier = em.find(Recrutier.class, recrutierId);
		if(recrutier .getJobs() == null) {
			List<Job> jobs = new ArrayList<Job>();
			jobs.add(job);
		}else {
			recrutier.getJobs().add(job);
		}
		et.begin();
		em.merge(recrutier);
		et.commit();	
	}
	
	public List<Job> findJobsByRecrutierId(int recrutierId){
		List<Job> jobs = em.find(Recrutier.class, recrutierId).getJobs();
		return jobs;
		
	}
	
	public static Job findJobByJobId(int jobid) {
		return em.find(Job.class, jobid);
	}
	public static void updateJob(Job job) {
		et.begin();
		em.merge(job);
		et.commit();
	}
	
	public static void Applicantsignup(Applicant applicant) {
		et.begin();
		em.persist(applicant);
		et.commit();	
	}
	
	public static Applicant applicantLogin(String email, String password) {
		Query query = em.createQuery("select ap from Applicant ap where ap.email=?");
		query.setParameter(1, email);
		Applicant applicant = (Applicant) query.getSingleResult();
		if(applicant!=null && applicant.getPassword().equals(password)) {
			return applicant;
		}
		return null;	
	}

	public static void applicantJobApply(int applicantid, int jobid) {
		Applicant ap  = em.find(Applicant.class, applicantid);
		Job job = em.find(Job.class, jobid);
		LocalDate date = LocalDate.now();
		String stringdate = String.valueOf(date);
		Application application = new Application(applicantid,"pending", stringdate , job.getDesignation(), job.getSalary(),job.getExperience(), job.getLocation(),job.getSkill());
		
		
		ap.getApplictions().add(application);
		job.getApplication().add(application);
		
		et.begin();
		em.merge(ap);
		em.merge(job);
		et.commit();
	}
	
	public static List<Application> viewApplicationsByApplicantId(int applicantid){
		return em.find(Applicant.class, applicantid).getApplictions();
	}
	
	public static List<Application> viewApplicationByJobId(int jobId){
		return em.find(Job.class, jobId).getApplication();
	}
	
	
	
}
