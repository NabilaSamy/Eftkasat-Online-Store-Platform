package com.SWEProject.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SWEProject.Entities.CustomersandStore;
import com.SWEProject.Repositories.CustomersandStoreRepository;

@Controller
public class CustomersandStoreController {

	@Autowired
	private CustomersandStoreRepository repo;
	
	@GetMapping("/CustomersandStore")
	public String addCustomersandStore(Model model){
		model.addAttribute("customerandstore", new CustomersandStore());
		return "CustomersandStore" ;
	}
	
	@PostMapping("/CustomersandStore")
	public String addCustomersandStore(Model model, @ModelAttribute CustomersandStore customerandstore){
		System.out.println(customerandstore.getStoreName());
		System.out.println(customerandstore.getCnumber());
		repo.save(customerandstore);
		model.addAttribute("customerandstore", new CustomersandStore());
		return "CustomersandStore" ;
	}
	
	@GetMapping("/ViewCustomersandStore")
	public String viewCustomersandStore(Model model){
		Iterable <CustomersandStore> customersandstoresIterable = repo.findAll();
		List<CustomersandStore> customersandstoresList = new ArrayList<CustomersandStore>();
		
		for(CustomersandStore customersandstore:customersandstoresIterable) {
			customersandstoresList.add(customersandstore);
		}
		
		model.addAttribute("customersandstores", customersandstoresList);
		return "ViewCustomersandStore" ;
	}
}
