package by.htp.project4.presentation;

import by.htp.project4.entity.Complex;

public class ComplexView {
	
	public void printSum(Complex r1, Complex r2, Complex r3) {
		System.out.println("Первое число: " + r1.getReal() + " + " + r1.getImaginary() + "i");
		System.out.println("Второе число: " + r2.getReal() + " + " + r2.getImaginary() + "i");
		System.out.println("Результат: " + r3.getReal() + " + " + r3.getImaginary() + "i");
		System.out.println(" ");
	}

}
