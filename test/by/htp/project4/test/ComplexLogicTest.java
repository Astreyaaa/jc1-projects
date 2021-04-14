package by.htp.project4.test;

import org.junit.Assert;
import org.junit.Test;

import by.htp.project4.entity.Complex;
import by.htp.project4.logic.ComplexLogic;


public class ComplexLogicTest {

	@Test
	public void sumT001() {
		Complex r1 = new Complex(2, 3);
		Complex r2 = new Complex(4, 5);
		Complex r3 = new Complex(6, 8);
		Complex rTest;
		
		ComplexLogic logic = new ComplexLogic();
		
		rTest = logic.sum(r1, r2);
		
		Assert.assertEquals(r3, rTest);
	}
	
	@Test
	public void substractionT002() {
		Complex r1 = new Complex(2, 3);
		Complex r2 = new Complex(4, 5);
		Complex r3 = new Complex(-2, -2);
		Complex rTest;
		
		ComplexLogic logic = new ComplexLogic();
		
		rTest = logic.substraction(r1, r2);
		
		Assert.assertEquals(r3, rTest);
	}

}
