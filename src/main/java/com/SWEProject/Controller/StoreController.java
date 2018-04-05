package com.SWEProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SWEProject.Entities.Store;
import com.SWEProject.Repositories.StoreRepository;

@Controller
public class StoreController {

	@Autowired
	private StoreRepository repo;
	
	@GetMapping("/addStore")
	public String showUsersForm(Model model) {
		model.addAttribute("store", new Store());
		return "addStore";
	}
	
	@PostMapping("/addStore")
	public String addUser(Model model, @ModelAttribute Store store) {
		System.out.println(store.getStoreName());
		System.out.println(store.getStoreAddress());
		System.out.println(store.getStoreType());
		System.out.println(store.getStoreInformation());
		repo.save(store);
		model.addAttribute("store", new Store());
		return "addStore";
		}
}
