package com.SWEProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SWEProject.Entities.Product;
import com.SWEProject.Repositories.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/addProduct")
	public String showProductsForm(Model model) {
		model.addAttribute("product", new Product());
		return "addProduct";
	}
	
	@PostMapping("/addProduct")
	public String addProduct(Model model, @ModelAttribute Product product) {
		System.out.println(product.getProdName());
		System.out.println(product.getProdCategory());
		System.out.println(product.getProdPrice());
		System.out.println(product.getProdType());
		System.out.println(product.getBrandName());
		System.out.println(product.getStoreName());
		repo.save(product);
		model.addAttribute("product", new Product());
		return "addProduct";
	}
}
