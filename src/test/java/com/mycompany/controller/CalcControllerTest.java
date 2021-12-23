package com.mycompany.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcControllerTest {
	CalcController calcController;
	
	@Before
	public void createInstance()
	{
		calcController = new CalcController();
	}

	@Test
	public void testAdd() {
		assertEquals("expected and actual are equal", 30, calcController.add(10, 20));
	}
	

}
