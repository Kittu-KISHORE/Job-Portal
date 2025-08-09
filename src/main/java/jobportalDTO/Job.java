package jobportalDTO;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designation;
	private double salary;
	private String experience;
	private String location;
	private String skill;
	@OneToMany(cascade =CascadeType.ALL)
	private List<Application> application;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public List<Application> getApplication() {
		return application;
	}
	public void setApplication(List<Application> application) {
		this.application = application;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", designation=" + designation + ", salary=" + salary + ", experience=" + experience
				+ ", location=" + location + ", skill=" + skill + ", application=" + application + "]";
	}
	public Job(String designation, double salary, String experience, String location, String skill,
			List<Application> application) {
		super();
		
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
		this.location = location;
		this.skill = skill;
		this.application = application;
	}
	public Job() {
		super();
	}
	
	
	
	
}
