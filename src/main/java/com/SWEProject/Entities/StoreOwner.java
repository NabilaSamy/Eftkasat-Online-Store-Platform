package com.SWEProject.Entities;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.SWEProject.Entities.Product;

public class StoreOwner {

	public String addOffer(String ProdName, int ProdPrice, String uname, Model model, 
			@ModelAttribute Product product) {
		String StoreOwner="";
		String User = "";
		int ProdCount = 0;
		if(uname==StoreOwner) {
			product.getProdName();
			product.getProdPrice();
			ProdPrice = ProdPrice-15/100;
			ProdCount++;
		}
		else if(uname== User) {
			product.getProdName();
			product.getProdPrice();
			ProdPrice = ProdPrice-10/100;
			ProdCount++;
		}
		if(ProdCount == 3)	
		{
			product.getProdName();
			product.getProdPrice();
			ProdPrice = ProdPrice-30/100;
		}
		return null;
	}
}
