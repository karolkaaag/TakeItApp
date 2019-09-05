package mogielnicka.karolina.takeItApp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mogielnicka.karolina.takeItApp.dao.UserDAO;
import mogielnicka.karolina.takeItApp.dto.AddressDTO;
import mogielnicka.karolina.takeItApp.dto.UserDTO;
import mogielnicka.karolina.takeItApp.model.User;
import mogielnicka.karolina.takeItApp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	@Override
	public List<UserDTO> listUsers() {
		Iterable<User> users = userDao.findAll();
		List<UserDTO> result = new ArrayList<UserDTO>();

		for (User user : users) {
			UserDTO userDto = new UserDTO();
			BeanUtils.copyProperties(user, userDto);
			AddressDTO addressDto = new AddressDTO();
			BeanUtils.copyProperties(user.getAddress(), addressDto);
			// BeanUtils.copyProperties(user.getAddress(), addressDto);
			userDto.setAddressDto(addressDto);
			result.add(userDto);
		}

		return result;
	}

	@Override
	public void saveUser(UserDTO userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		userDao.save(user);

	}

	@Override
	public boolean deleteUser(UserDTO userDto) {
//		User user = new User();
//		BeanUtils.copyProperties(userDto, user);
		Long userId = userDto.getId();
		if (userDao.existsById(userId)) {
			userDao.deleteById(userId);
			return true;
		}
		return false;
	}

}
