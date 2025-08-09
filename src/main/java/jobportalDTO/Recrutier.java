package jobportalDTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Recrutier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String orgName;
	private String orgAbout;
	private String orgPassword;
	private String orgWebsite;
	private long empcount;
	
	@OneToMany(cascade =CascadeType.ALL)
	private List<Job> jobs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgAbout() {
		return orgAbout;
	}

	public void setOrgAbout(String orgAbout) {
		this.orgAbout = orgAbout;
	}

	public String getOrgWebsite() {
		return orgWebsite;
	}

	public void setOrgWebsite(String orgWebsite) {
		this.orgWebsite = orgWebsite;
	}

	public long getEmpcount() {
		return empcount;
	}

	public void setEmpcount(long empcount) {
		this.empcount = empcount;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
	
	public String getOrgPassword() {
		return orgPassword;
	}

	public void setOrgPassword(String orgPassword) {
		this.orgPassword = orgPassword;
	}

	

	@Override
	public String toString() {
		return "Recrutier [id=" + id + ", orgName=" + orgName + ", orgPassword=" + orgPassword + ", orgAbout="
				+ orgAbout + ", orgWebsite=" + orgWebsite + ", empcount=" + empcount + ", jobs=" + jobs + "]";
	}



	public Recrutier(String orgName, String orgPassword, String orgAbout, String orgWebsite, long empcount,
			List<Job> jobs) {
		super();
		this.orgName = orgName;
		this.orgPassword = orgPassword;
		this.orgAbout = orgAbout;
		this.orgWebsite = orgWebsite;
		this.empcount = empcount;
		this.jobs = jobs;
	}

	public Recrutier() {
		super();
	}
	 

}
