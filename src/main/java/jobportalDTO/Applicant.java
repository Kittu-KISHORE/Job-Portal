package jobportalDTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Applicant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private long contact;
	private String email;
	private String password;
	private String primaryskills;
	@OneToMany(cascade =CascadeType.ALL)
	private List<Application> applictions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrimaryskills() {
		return primaryskills;
	}
	public void setPrimaryskills(String primaryskills) {
		this.primaryskills = primaryskills;
	}
	public List<Application> getApplictions() {
		return applictions;
	}
	public void setApplictions(List<Application> applictions) {
		this.applictions = applictions;
	}

	public Applicant(String name, String city, long contact, String email, String password, String primaryskills,
			List<Application> applictions) {
		super();
		this.name = name;
		this.city = city;
		this.contact = contact;
		this.email = email;
		this.password = password;
		this.primaryskills = primaryskills;
		this.applictions = applictions;
	}
	public Applicant() {
		super();
	}
	@Override
	public String toString() {
		return "Applicant [id=" + id + ", name=" + name + ", city=" + city + ", contact=" + contact + ", email=" + email
				+ ", password=" + password + ", primaryskills=" + primaryskills + ", applictions=" + applictions + "]";
	}

	
	

}
