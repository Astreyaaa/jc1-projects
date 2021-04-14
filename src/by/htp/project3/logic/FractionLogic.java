package by.htp.project3.logic;

import by.htp.project3.entity.Fraction;

public class FractionLogic {

	public Fraction sum(Fraction f1, Fraction f2) {
		int newNum;
		int newDen;
		
		newNum = f1.getNumerator() * f2.getDenominator() + f1.getDenominator() * f2.getNumerator();
		newDen = f1.getDenominator() * f2.getDenominator();
		
		Fraction rezult = new Fraction(newNum, newDen);
		
		return rezult;
	}
	
	public Fraction substraction(Fraction f1, Fraction f2) {
		int newNum;
		int newDen;
		
		newNum = f1.getNumerator() * f2.getDenominator() - f1.getDenominator() * f2.getDenominator();
		newDen = f1.getDenominator() * f2.getDenominator();
		
		Fraction rezult = new Fraction(newNum, newDen);
		
		return rezult;
	}
	
	public Fraction multiplication(Fraction f1, Fraction f2) {
		int newNum;
		int newDen;
		
		newNum = f1.getNumerator() * f2.getNumerator();
		newDen = f1.getDenominator() * f2.getDenominator();
		
		Fraction rezult = new Fraction(newNum, newDen);
		
		return rezult;
	}
	
	public Fraction division(Fraction f1, Fraction f2) {
		int newNum;
		int newDen;
		
		newNum = f1.getNumerator() * f2.getDenominator();
		newDen = f1.getDenominator() * f2.getNumerator();
		
		Fraction rezult = new Fraction(newNum, newDen);
		
		return rezult;
	}
	
	public Fraction reduse1(Fraction f1) {
		int newNum;
		int newDen;
		
		int a = f1.getNumerator();
		int b = f1.getDenominator();
		
		while (a != 0 & b != 0) {
		    if (a > b){
		    	a = a % b;
		    }
		    else {
		        b = b % a;
		    }
		}
		
		a = a+b;
		
		newNum = f1.getNumerator()/a;
		newDen = f1.getDenominator()/a;
		
		Fraction rezult = new Fraction(newNum, newDen);
		
		return rezult;
	}
	
	public Fraction reduse2(Fraction f2) {
		int newNum;
		int newDen;
		
		int a = f2.getNumerator();
		int b = f2.getDenominator();
		
		while (a != 0 & b != 0) {
		    if (a > b){
		    	a = a % b;
		    }
		    else {
		        b = b % a;
		    }
		}
		
		a = a+b;
		
		newNum = f2.getNumerator()/a;
		newDen = f2.getDenominator()/a;
		
		Fraction rezult = new Fraction(newNum, newDen);
		
		return rezult;
	}
}
