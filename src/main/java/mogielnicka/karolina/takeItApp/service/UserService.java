package mogielnicka.karolina.takeItApp.service;

import java.util.List;

import mogielnicka.karolina.takeItApp.dto.UserDTO;
import mogielnicka.karolina.takeItApp.model.User;

/**
 * Service to handle {@link User} methods.
 * 
 * @author Karolina Mogielnicka
 *
 */
public interface UserService{
	
	/**
	 * This method returns all users from database.
	 * @return
	 */
	List<UserDTO> listUsers();
	
	/**
	 * This method saves existing or new user to database.
	 * @param userDto
	 */
	void saveUser(UserDTO userDto);
	
	/**
	 * This method deletes {@link User} from database. User is deleted based on {@link UserDTO#getId()}.
	 * @param userDto
	 * @return returns true if user was successfully deleted.
	 */
	boolean deleteUser(UserDTO userDto);
	
	
	
	

}
