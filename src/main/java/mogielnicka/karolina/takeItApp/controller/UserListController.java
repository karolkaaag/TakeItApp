package mogielnicka.karolina.takeItApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mogielnicka.karolina.takeItApp.dto.UserDTO;
import mogielnicka.karolina.takeItApp.service.UserService;

@Controller
public class UserListController {

	@Autowired
	private UserService userService;

	@GetMapping("/listUsers")
	public String listUsers(Model model) {
		List<UserDTO> users = userService.listUsers();
		model.addAttribute("users", users);
		return "listUsers";
	}

}
