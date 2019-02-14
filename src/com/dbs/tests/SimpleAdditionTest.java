package com.dbs.tests;

import com.dbs.main.Calculator;

public class SimpleAdditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		Calculator mycalci = new Calculator();
		
		if(mycalci.add(a, b)==30) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
	}

}
