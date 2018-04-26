package com.SWEProject.Controller;

import org.junit.Assert;
import org.junit.Test;

public class ProductControllerTester {

	@Test
	public void testAddProduct() {
		ProductControllerTester productcontroller= new ProductControllerTester();
		String result = productcontroller.addProduct();
		Assert.assertEquals(result, "");
		}

	private String addProduct() {
		// TODO Auto-generated method stub
		return null;
	}
}
