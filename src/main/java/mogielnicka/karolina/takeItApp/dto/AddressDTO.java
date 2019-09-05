package mogielnicka.karolina.takeItApp.dto;

public class AddressDTO {

	private Long id;
	private String city;
	private String postalCode;
	private String street;
	private String streetNr;
	private String apartmentNr;

	public AddressDTO() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	@Override
	public String toString() {
		return id + city + ", " + postalCode + ", " + street + ", " + streetNr + "/" + apartmentNr;
	}

}
