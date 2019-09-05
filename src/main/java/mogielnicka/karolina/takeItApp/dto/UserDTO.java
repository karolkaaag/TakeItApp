package mogielnicka.karolina.takeItApp.dto;

import javax.persistence.JoinColumn;

public class UserDTO {

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	@JoinColumn(name = "address_id")
	private AddressDTO addressDto;
	private String password;

	public UserDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AddressDTO getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDTO address) {
		this.addressDto = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
