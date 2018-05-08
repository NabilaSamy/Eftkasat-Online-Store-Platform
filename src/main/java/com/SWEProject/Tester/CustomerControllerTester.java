package com.SWEProject.Tester;

import org.junit.Assert;
import org.junit.Test;

public class CustomerControllerTester {

	@Test
	public void testAddUser() {
		CustomerControllerTester usercontroller= new CustomerControllerTester();
		String result = usercontroller.changeRequest();
		Assert.assertEquals(result, "");
	}

	private String changeRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	public String addProduct() {
		// TODO Auto-generated method stub
		return null;
	}
}
