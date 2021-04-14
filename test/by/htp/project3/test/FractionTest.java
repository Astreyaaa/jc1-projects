package by.htp.project3.test;

import org.junit.Assert;
import org.junit.Test;

import by.htp.project3.entity.Fraction;
import by.htp.project3.logic.FractionLogic;


public class FractionTest {
		
		@Test
		public void sumT001() {
			Fraction f1 = new Fraction(2, 4);
			Fraction f2 = new Fraction(3, 6);
			Fraction f3 = new Fraction(24, 24);
			Fraction fTest;
			
			FractionLogic logic = new FractionLogic();
			
			fTest = logic.sum(f1, f2);
			
			Assert.assertEquals(f3, fTest);

	}
		
		@Test
		public void substractionT002() {
			Fraction f1 = new Fraction(2, 4);
			Fraction f2 = new Fraction(3, 6);
			Fraction f3 = new Fraction(-12, 24);
			Fraction fTest;
			
			FractionLogic logic = new FractionLogic();
			
			fTest = logic.substraction(f1, f2);
			
			Assert.assertEquals(f3, fTest);

	}
		
		@Test
		public void multiplicationT003() {
			Fraction f1 = new Fraction(2, 4);
			Fraction f2 = new Fraction(3, 6);
			Fraction f3 = new Fraction(6, 24);
			Fraction fTest;
			
			FractionLogic logic = new FractionLogic();
			
			fTest = logic.multiplication(f1, f2);
			
			Assert.assertEquals(f3, fTest);

	}
		
		@Test
		public void divisionT004() {
			Fraction f1 = new Fraction(2, 4);
			Fraction f2 = new Fraction(3, 6);
			Fraction f3 = new Fraction(12, 12);
			Fraction fTest;
			
			FractionLogic logic = new FractionLogic();
			
			fTest = logic.division(f1, f2);
			
			Assert.assertEquals(f3, fTest);

	}
		
		@Test
		public void reduse1T005() {
			Fraction f1 = new Fraction(2, 4);
			Fraction f3 = new Fraction(1, 2);
			Fraction fTest;
			
			FractionLogic logic = new FractionLogic();
			
			fTest = logic.reduse1(f1);
			
			Assert.assertEquals(f3, fTest);

	}
		
		@Test
		public void reduse2T006() {
			Fraction f2 = new Fraction(3, 6);
			Fraction f3 = new Fraction(1, 2);
			Fraction fTest;
			
			FractionLogic logic = new FractionLogic();
			
			fTest = logic.reduse2(f2);
			
			Assert.assertEquals(f3, fTest);

	}
}
