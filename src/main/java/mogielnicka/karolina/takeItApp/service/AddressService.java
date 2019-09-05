package mogielnicka.karolina.takeItApp.service;

import java.util.List;

import mogielnicka.karolina.takeItApp.dto.AddressDTO;
import mogielnicka.karolina.takeItApp.model.Address;

/**
 * Service to use {@link Address} methods.
 * 
 * @author Karolina Mogielnicka
 *
 */

public interface AddressService {

	/**
	 * This method returns all addresses from database.
	 * 
	 * @return
	 */
	List<AddressDTO> listAddress();

	/**
	 * This method save existing or new address to database.
	 * 
	 * @param addressDTO
	 */
	void saveAddress(AddressDTO addressDto);

	/**
	 * This method deletes {@link Address} from database. Address is deleted based
	 * on {@link AddressDTO#getId()}}
	 * 
	 * @param addressDto
	 * @return returns true if address was successfully deleted.
	 */
	boolean deleteAddress(AddressDTO addressDto);

}
