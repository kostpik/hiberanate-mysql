package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="owners")
public class Owners  {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "enhanced-sequence")
	@javax.persistence.GeneratedValue(strategy = GenerationType.AUTO)
//	@GenericGenerator(strategy = "enhanced-sequence", name = "seg")
	private Long id;

	@Column(name = "first_name")	
	private String firstName;	
	
	@Column(name = "last_name")	
	private String   lastName;
	
	@Column(name="age_owner")	
	private Integer age ;	
	
	@javax.persistence.Transient
	private Set<Addres> adreses = new HashSet<Addres>();
	
	public Owners() {}

	public Owners(String firstName, String lastName, Integer age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Set<Addres> getAdreses() {
		return adreses;
	}
	
	public void setAdress(Addres adr) {
		adreses.add(adr);
	}
}
