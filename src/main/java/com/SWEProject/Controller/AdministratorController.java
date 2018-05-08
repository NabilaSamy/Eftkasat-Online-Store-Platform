package com.SWEProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SWEProject.Entities.Administrator;
import com.SWEProject.Repositories.AdministratorRepository;

@Controller
public class AdministratorController {

	@Autowired
	private AdministratorRepository repo;
	
	@GetMapping("/AdministratorPage")
	public String showAddAdministratorForm(Model model){
		model.addAttribute("administrator", new Administrator());
		return "AdministratorPage" ;
	}
	
	@GetMapping("/SignupAdministrator")
	public String SingupAdministratorForm(Model model){
		model.addAttribute("administrator", new Administrator());
		return "SignupAdministrator" ;
	}
	
	@PostMapping("/SignupAdministrator")
	public String signupAdministrator(Model model, @ModelAttribute Administrator administrator){
		System.out.println(administrator.getAdminName());
		System.out.println(administrator.getAdminAddress());
		System.out.println(administrator.getAdminGender());
		System.out.println(administrator.getAdminPhone());
		System.out.println(administrator.getAdminAge());
		System.out.println(administrator.getAdminMail());
		System.out.println(administrator.getAdminMail());
		repo.save(administrator);
		model.addAttribute("administrator", new Administrator());
		return "index" ;
	}
	
	@GetMapping("/loginAdministrator")
	public String loginAdministrator(Model model){
		model.addAttribute("administrator", new Administrator());
		return "loginAdministrator";
	}
	
	@PostMapping("/loginAdministrator")
	public String loginAdministrator(Model model, @ModelAttribute Administrator administrator){
		System.out.println("Administrator E-mail : " + administrator.getAdminMail());
		System.out.println("Administrator Password : " + administrator.getAdminPass());
		return "AdministratorHomePage";
	}
	
	@RequestMapping("/AdministratorHomePage")
	public String AdministratorHomePage(Model model){
		return "AdministratorHomePage";
	}
	
	@GetMapping("/addAdministratorCollaborators")
	public String addAdministratorCollaborators(Model model){
		model.addAttribute("administrator", new Administrator());
		return "addAdministratorCollaborators" ;
	}
	
	@GetMapping("/addAdministrator")
	public String addAdministrator(Model model) {
		model.addAttribute("administrator", new Administrator());
		return "addAdministrator";
	}
	
	@PostMapping("/addAdministrator")
	public String addAdministrator(Model model, @ModelAttribute Administrator administrator) {
		System.out.println(administrator.getAdminName());
		System.out.println(administrator.getAdminAddress());
		System.out.println(administrator.getAdminGender());
		System.out.println(administrator.getAdminPhone());
		System.out.println(administrator.getAdminAge());
		System.out.println(administrator.getAdminMail());
		repo.save(administrator);
		model.addAttribute("administrator", new Administrator());
		return "addAdministrator";
	}
}
