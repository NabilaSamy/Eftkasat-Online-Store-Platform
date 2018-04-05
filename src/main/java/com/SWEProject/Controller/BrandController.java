package com.SWEProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SWEProject.Entities.Brand;
import com.SWEProject.Repositories.BrandRepository;

@Controller
public class BrandController {

	@Autowired
	private BrandRepository repo;
	
	@GetMapping("/addBrand")
	public String showBrandsForm(Model model) {
		model.addAttribute("brand", new Brand());
		return "addBrand";
	}
	
	@PostMapping("/addBrand")
	public String addBrand(Model model, @ModelAttribute Brand brand) {
		System.out.println(brand.getBrandName());
		System.out.println(brand.getBrandType());
		repo.save(brand);
		model.addAttribute("brand", new Brand());
		return "addBrand";
		
	}
}
