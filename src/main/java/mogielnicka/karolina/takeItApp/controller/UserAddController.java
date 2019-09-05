package mogielnicka.karolina.takeItApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mogielnicka.karolina.takeItApp.dto.UserDTO;
import mogielnicka.karolina.takeItApp.service.UserService;

@Controller
public class UserAddController {

	@Autowired
	private UserService userService;

	@GetMapping("/addUserForm")
	public String addUserForm(Model model) {
		System.out.println("adduserform");
		return "addUserForm";
	}

	@PostMapping("/addUser")
	public String addUser(@RequestParam(value = "firstName") String firstName,
			@RequestParam(value = "lastName") String lastName, @RequestParam(value = "email") String email,
			@RequestParam(value = "password") String password) {
		UserDTO userDto = new UserDTO();
		userDto.setFirstName(firstName);
		System.out.println("hello from " + userDto.getFirstName().toString());

		userDto.setLastName(lastName);
		System.out.println("hello from " + userDto.getLastName().toString());

		userDto.setEmail(email);
		System.out.println("hello from " + userDto.getEmail().toString());

		userDto.setPassword(password);
		System.out.println("hello from " + userDto.getPassword().toString());

		userService.saveUser(userDto);
		System.out.println("after save");
		return "redirect:/listUsers";
	}

}
