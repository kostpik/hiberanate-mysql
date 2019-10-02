package model;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="adress")
public class Addres implements Serializable {
		
	@Id
    @javax.persistence.GeneratedValue(strategy = GenerationType.AUTO)
	//@GenericGenerator(name = "seq", strategy = "enhanced-sequence")
	private Long id;
	
	@Column(name="street", nullable=false)
	private String  street;
	
	@ManyToOne
	  // @JoinColumn(name="ADDR_ID")
    private Owners owners;
	
	public Addres() {}

	public Addres(String street, Owners owners) {
		
		this.street = street;
		this.owners = owners;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Owners getOwners() {
		return owners;
	}

//	public void setOwners(Owners owners) {
//		this.owners = owners;
//	}

	public Long getId() {
		return id;
	}
}
