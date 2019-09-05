package mogielnicka.karolina.takeItApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String city;
	private String postalCode;
	private String street;
	private String streetNr;
	private String apartmentNr;

	public Address() {
	}

	public Address(Long id, String city, String postalCode, String street, String streetNr, String apartmentNr) {
		super();
		this.id = id;
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
		this.streetNr = streetNr;
		this.apartmentNr = apartmentNr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNr() {
		return streetNr;
	}

	public void setStreetNr(String streetNr) {
		this.streetNr = streetNr;
	}

	public String getApartmentNr() {
		return apartmentNr;
	}

	public void setApartmentNr(String apartmentNr) {
		this.apartmentNr = apartmentNr;
	}

}
