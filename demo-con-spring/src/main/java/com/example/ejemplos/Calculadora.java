package com.example.ejemplos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {
	
	private double roundIEEE754(double o) {
		return (new BigDecimal(o))
				.setScale(16, RoundingMode.HALF_UP)
				.doubleValue();
	}

	public double suma(double a, double b) {
		return roundIEEE754(a + b);
	}
	
	public BigDecimal suma(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	public double divide(double a, double b) {
		if(b == 0)
			throw new ArithmeticException("/ by zero");
		return roundIEEE754(a / b);
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
}
