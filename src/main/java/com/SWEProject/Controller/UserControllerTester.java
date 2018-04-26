package com.SWEProject.Controller;

import org.junit.Assert;
import org.junit.Test;

public class UserControllerTester {

	@Test
	public void testAddUser() {
		UserControllerTester usercontroller= new UserControllerTester();
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
