package com.dbs.tests;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.dbs.main.Calculator;


public class JUnitAdditionTest {
	
	@Test
	public void additionTest() {
		
		int a = 10;
		int b = 20;
		
		Calculator mycalci = new Calculator();
		int result = mycalci.add(a, b);
		assertEquals(30, result);
	}
	
	@Test
	public void substractionTest() {
		
		int a = 20;
		int b = 10;
		
		Calculator mycalci = new Calculator();
		int result = mycalci.substract(a, b);
		assertEquals(10, result);
	}
	
	@Test
	public void substractionTestFailure() {
		
		int a = 30;
		int b = 10;
		
		Calculator mycalci = new Calculator();
		int result = mycalci.substract(a, b);
		try {
			assertNotEquals(10, result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Test failed");
		}
		
	}

}
