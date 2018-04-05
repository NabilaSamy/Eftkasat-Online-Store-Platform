package com.SWEProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SWEProject.Entities.User;
import com.SWEProject.Repositories.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/addUser")
	public String showUsersForm(Model model) {
		model.addAttribute("user", new User());
		return "addUser";
	}
	
	@PostMapping("/addUser")
	public String addUser(Model model, @ModelAttribute User user) {
		System.out.println(user.getUname());
		System.out.println(user.getUaddress());
		System.out.println(user.getUgender());
		System.out.println(user.getUphone());
		System.out.println(user.getUage());
		System.out.println(user.getUmail());
		repo.save(user);
		model.addAttribute("user", new User());
		return "addUser";
		}
}
