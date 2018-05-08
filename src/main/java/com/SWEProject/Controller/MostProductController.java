package com.SWEProject.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SWEProject.Entities.MostProduct;
import com.SWEProject.Repositories.MostProductRepository;

@Controller
public class MostProductController {

	@Autowired
	private MostProductRepository repo;
	
	@GetMapping("/mostProduct")
	public String addmostProduct(Model model){
		model.addAttribute("mostProduct", new MostProduct());
		return "mostProduct" ;
	}
	
	@PostMapping("/mostProduct")
	public String addmostProduct(Model model, @ModelAttribute MostProduct mostProduct){
		System.out.println(mostProduct.getProdName());
		repo.save(mostProduct);
		model.addAttribute("mostProduct", new MostProduct());
		return "mostProduct" ;
	}
	
	
	@GetMapping("/ViewmostProduct")
	public String ViewmostProduct(Model model){
		Iterable <MostProduct> mostProductsIterable = repo.findAll();
		List<MostProduct> mostProductsList = new ArrayList<MostProduct>();
		
		for(MostProduct mostProduct:mostProductsIterable) {
			mostProductsList.add(mostProduct);
		}
		
		model.addAttribute("mostProducts", mostProductsList);
		return "ViewmostProduct" ;
	}
}
