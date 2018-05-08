package com.SWEProject.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SWEProject.Entities.Payment;
import com.SWEProject.Repositories.PaymentRepository;


@Controller
public class PaymentController {

	@Autowired
	private PaymentRepository repo;
	
	@GetMapping("/PaymentPage")
	public String showAddPaymentForm(Model model){
		model.addAttribute("payment", new Payment());
		return "PaymentPage" ;
	}
	
	@GetMapping("/addPayment")
	public String addPaymentForm(Model model){
		model.addAttribute("payment", new Payment());
		return "addPayment" ;
	}
	
	@PostMapping("/addPayment")
	public String addPayment(Model model, @ModelAttribute Payment payment){
		System.out.println(payment.getCname());
		System.out.println(payment.getCmail());
		System.out.println(payment.getProdName());
		System.out.println(payment.getBrandName());
		System.out.println(payment.getPaymentType());
		repo.save(payment);
		model.addAttribute("payment", new Payment());
		return "addPayment" ;
	}
	
	@GetMapping("/ViewPayment")
	public String ViewPayment(Model model){
		Iterable <Payment> paymentsIterable = repo.findAll();
		List<Payment> paymentsList = new ArrayList<Payment>();
		
		for(Payment payment:paymentsIterable) {
			paymentsList.add(payment);
		}
		
		model.addAttribute("payments", paymentsList);
		return "ViewPayment" ;
	}
}
