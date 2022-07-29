package com.javacodegeeks.examples.jaxws.client;

import client.CalculatorI;
import client.CalculatorImplService;

public class CalculatorClient {

	public static void main(String[] args) {
		CalculatorImplService service = new CalculatorImplService();
		CalculatorI calc = service.getCalculatorImplPort();
		
		System.out.println(calc.add(1, 2));
		System.out.println(calc.subtract(2, 2));
		System.out.println(calc.multiply(2, 4));
		System.out.println(calc.divide(6, 3));
	}

}
