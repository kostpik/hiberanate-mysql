package model3;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name="address")
public class Address {
		
    @Id
    @javax.persistence.GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "seq", strategy = "enhanced-sequence")
	private Long id;
	
	@Column(name="street", nullable=false)
	private String  street;

	@Column(name="num_building")
	private String numBuilding;

	public Address() {}

	public Address(String street) {
		
		this.street = street;

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

//	public void setOwners(Owners owners) {
//		this.owners = owners;
//	}

	public String getNumBuilding() {
		return numBuilding;
	}

	public void setNumBuilding(String numBuilding) {
		this.numBuilding = numBuilding;
	}

	public Long getId() {
		return id;
	}
}
