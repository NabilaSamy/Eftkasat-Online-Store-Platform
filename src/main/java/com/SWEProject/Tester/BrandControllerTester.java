package com.SWEProject.Tester;

import org.junit.Assert;
import org.junit.Test;

public class BrandControllerTester {

	@Test
	public void testAddBrand() {
		BrandControllerTester brandcontroller = new BrandControllerTester();
		String result = brandcontroller.AddBrand();
		Assert.assertEquals(result, "");
	}

	private String AddBrand() {
		// TODO Auto-generated method stub
		return null;
	}
}
