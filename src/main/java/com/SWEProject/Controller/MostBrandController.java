package com.SWEProject.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SWEProject.Entities.MostBrand;
import com.SWEProject.Repositories.MostBrandRepository;

@Controller
public class MostBrandController {

	@Autowired
	private MostBrandRepository repo;
	
	@GetMapping("/StatisticsPage")
	public String showStatisticsForm(Model model){
		model.addAttribute("mostBrand", new MostBrand());
		return "StatisticsPage" ;
	}
	
	
	@GetMapping("/mostBrand")
	public String showAddStatisticsForm(Model model){
		model.addAttribute("mostBrand", new MostBrand());
		return "mostBrand" ;
	}
	
	@PostMapping("/mostBrand")
	public String addmostBrand(Model model, @ModelAttribute MostBrand mostBrand){
		System.out.println(mostBrand.getBrandName());
		repo.save(mostBrand);
		model.addAttribute("mostBrand", new MostBrand());
		return "mostBrand";
	}
	
	
	@GetMapping("/ViewStatistics")
	public String viewStatisticsForm(Model model){
		model.addAttribute("mostBrand", new MostBrand());
		return "ViewStatistics" ;
	}
	
	
	@GetMapping("/ViewmostBrand")
	public String ViewmostBrand(Model model){
		Iterable <MostBrand> mostBrandsIterable = repo.findAll();
		List<MostBrand> mostBrandsList = new ArrayList<MostBrand>();
		
		for(MostBrand mostBrand:mostBrandsIterable) {
			mostBrandsList.add(mostBrand);
		}
		
		model.addAttribute("mostBrands", mostBrandsList);
		return "ViewmostBrand" ;
	}
}
