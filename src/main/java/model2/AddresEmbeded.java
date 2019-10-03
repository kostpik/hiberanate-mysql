package model2;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Embeddable
public class AddresEmbeded {

	@NotNull
	@Column(name="street", nullable=false)

	private String  street;

	public AddresEmbeded() {}
	public AddresEmbeded(String street) {
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

}
