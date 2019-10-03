package model2;

import model2.AddresEmbeded;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="owners")
public class OwnersWithAddres {

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "enhanced-sequence")
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GenericGenerator(strategy = "enhanced-sequence", name = "seg")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String   lastName;

	@Column(name="age_owner")
	private Integer age ;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modification", updatable = false)
	@org.hibernate.annotations.CreationTimestamp
         private Timestamp timestamp;

	private AddresEmbeded addres;

	public AddresEmbeded getAdress(){
		return addres;
	}

	public void setAddres(AddresEmbeded addres) {
		this.addres = addres;

	}
	//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "last_modific", updatable = false, insertable = false, nullable = false)
//	@org.hibernate.annotations.Generated(
//			GenerationTime.INSERT
//	)

	public OwnersWithAddres() {}

	public OwnersWithAddres(String firstName, String lastName, Integer age) {

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

}
