package com.SWEProject.Tester;


import org.junit.Assert;
import org.junit.Test;

public class StoreControllerTester {

	@Test
	public void testAddStore() {
		StoreControllerTester storecontroller = new StoreControllerTester();
		String result = storecontroller.addStore();
		Assert.assertEquals(result, "");
	}

	private String addStore() {
		// TODO Auto-generated method stub
		return null;
	}
}
