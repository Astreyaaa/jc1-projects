package by.htp.project4.logic;

import by.htp.project4.entity.Complex;

public class ComplexLogic {

	public Complex sum(Complex r1, Complex r2) {
		int newReal;
		int newImg;
		
		newReal = r1.getReal() + r2.getReal();
		newImg = r1.getImaginary() + r2.getImaginary();
		
		Complex rezult = new Complex(newReal, newImg);
		
		return rezult;
	}
	
	public Complex substraction(Complex r1, Complex r2) {
		int newReal;
		int newImg;
		
		newReal = r1.getReal() - r2.getReal();
		newImg = r1.getImaginary() - r2.getImaginary();
		
		Complex rezult = new Complex(newReal, newImg);
		
		return rezult;
	}
}
