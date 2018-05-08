package com.SWEProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SWEProject.Entities.Product;
import com.SWEProject.Entities.Sowner;
import com.SWEProject.Repositories.StownerRepository;

@Controller
public class SownerController {

	@Autowired
	private StownerRepository repo;
	
	@GetMapping("/StoreOwnerPage")
	public String showAddStownerForm(Model model){
		model.addAttribute("sowner", new Sowner());
		return "StoreOwnerPage" ;
	}


	@GetMapping("/SignupStoreOwner")
	public String SingupStownerForm(Model model){
		model.addAttribute("sowner", new Sowner());
		return "SignupStoreOwner" ;
	}

	@PostMapping("/SignupStoreOwner")
	public String signupStowner(Model model, @ModelAttribute Sowner sowner){
		System.out.println(sowner.getSownerName());
		System.out.println(sowner.getSownerAddress());
		System.out.println(sowner.getSownerGender());
		System.out.println(sowner.getSownerPhone());
		System.out.println(sowner.getSownerAge());
		System.out.println(sowner.getSownerMail());
		System.out.println(sowner.getSownerPass());
		repo.save(sowner);
		model.addAttribute("sowner", new Sowner());
		return "index" ;
	}


	@GetMapping("/loginStoreOwner")
	public String loginStoreOwner(Model model){
		model.addAttribute("sowner", new Sowner());
		return "loginStoreOwner";
	}
	
	@PostMapping("/loginStoreOwner")
	public String loginStoreOwner(Model model, @ModelAttribute Sowner sowner){
		System.out.println("Store Owner E-mail : " + sowner.getSownerMail());
		System.out.println("Store Owner Password : " + sowner.getSownerPass());
		return "StoreOwnerHomePage";
	}


	@RequestMapping("/StoreOwnerHomePage")
	public String StoreOwnerHomePage(Model model){
		return "StoreOwnerHomePage";
	}


	@GetMapping("/addStoreOwnerCollaborators")
	public String addStoreOwnerCollaborators(Model model){
		model.addAttribute("sowner", new Sowner());
		return "addStoreOwnerCollaborators" ;
	}


	@GetMapping("/addStoreowner")
	public String addAdministrator(Model model) {
		model.addAttribute("sowner", new Sowner());
		return "addStoreowner";
	}
	
	@PostMapping("/addStoreowner")
	public String addStoreowner(Model model, @ModelAttribute Sowner sowner) {
		System.out.println(sowner.getSownerName());
		System.out.println(sowner.getSownerAddress());
		System.out.println(sowner.getSownerGender());
		System.out.println(sowner.getSownerPhone());
		System.out.println(sowner.getSownerAge());
		System.out.println(sowner.getSownerMail());
		System.out.println(sowner.getSownerPass());
		repo.save(sowner);
		model.addAttribute("sowner", new Sowner());
		return "addStoreowner";
	}
	
	public String addOffer(String ProdName, int ProdPrice, String cname, Model model, 
			@ModelAttribute Product product) {
		String StoreOwner="";
		String Customer = "";
		int ProdCount = 0;
		if(cname==StoreOwner) {
			product.getProdName();
			product.getProdPrice();
			ProdPrice = ProdPrice-15/100;
			ProdCount++;
		}
		else if(cname== Customer) {
			product.getProdName();
			product.getProdPrice();
			ProdPrice = ProdPrice-10/100;
			ProdCount++;
		}
		if(ProdCount == 3){
			product.getProdName();
			product.getProdPrice();
			ProdPrice = ProdPrice-30/100;
		}
		return null;
	}
}
