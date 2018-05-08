package com.SWEProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SWEProject.Entities.Customer;
import com.SWEProject.Repositories.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired
	private CustomerRepository repo;
	
	@RequestMapping("/index")
	public String index(Model model){
		return "index";
	}
	
	@GetMapping("/CustomerPage")
	public String showAddUserForm(Model model){
		model.addAttribute("customer", new Customer());
		return "CustomerPage" ;
	}
	
	@GetMapping("/SignupCustomer")
	public String SingupCustomerForm(Model model){
		model.addAttribute("customer", new Customer());
		return "SignupCustomer" ;
	}
	
	@PostMapping("/SignupCustomer")
	public String signupCustomer(Model model, @ModelAttribute Customer customer){
		System.out.println(customer.getCname());
		System.out.println(customer.getCaddress());
		System.out.println(customer.getCgender());
		System.out.println(customer.getCphone());
		System.out.println(customer.getCage());
		System.out.println(customer.getCmail());
		System.out.println(customer.getCpass());
		repo.save(customer);
		model.addAttribute("customer", new Customer());
		return "index" ;
	}
	
	@GetMapping("/loginCustomer")
	public String loginCustomer(Model model){
		model.addAttribute("customer", new Customer());
		return "loginCustomer";
	}
	
	@PostMapping("/loginCustomer")
	public String loginCustomer(Model model, @ModelAttribute Customer customer){
		System.out.println("Customer E-mail : " + customer.getCmail());
		System.out.println("Customer Password : " + customer.getCpass());
		return "CustomerHomePage";
	}
	
	@RequestMapping("/CustomerHomePage")
	public String CustomerHomePage(Model model){
		return "CustomerHomePage";
	}
	
	@GetMapping("/addCustomer")
	public String addCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "addCustomer";
	}
	
	@PostMapping("/addCustomer")
	public String addCustomer(Model model, @ModelAttribute Customer customer) {
		System.out.println(customer.getCname());
		System.out.println(customer.getCaddress());
		System.out.println(customer.getCgender());
		System.out.println(customer.getCphone());
		System.out.println(customer.getCage());
		System.out.println(customer.getCmail());
		repo.save(customer);
		model.addAttribute("customer", new Customer());
		return "addCustomer";
	}
	
	@PostMapping("/changeRequest")
	public String changeRequest(Model model , @ModelAttribute Customer customer) {
		System.out.println(customer.getCname());
		System.out.println(customer.getCaddress());
		System.out.println(customer.getCgender());
		System.out.println(customer.getCphone());
		System.out.println(customer.getCage());
		System.out.println(customer.getCmail());
		repo.save(customer);
		model.addAttribute("customer", new Customer());
		return "addCustomer";
	}
}
