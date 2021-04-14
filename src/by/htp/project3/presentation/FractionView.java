package by.htp.project3.presentation;

import by.htp.project3.entity.Fraction;

public class FractionView {
	
	public void printSum(Fraction f1, Fraction f2, Fraction f3) {
		System.out.println("Первая дробь: " + f1.getNumerator() + "/" + f1.getDenominator());
		System.out.println("Вторая дробь: " + f2.getNumerator()+ "/" + f2.getDenominator());
		System.out.println("Результат: " + f3.getNumerator()+ "/" + f3.getDenominator());
		System.out.println("////////////////////////////////////////////////////////////");
	}
	
	public void printSum1(Fraction f1,Fraction f3) {
		System.out.println("Первая дробь: " + f1.getNumerator() + "/" + f1.getDenominator());
		System.out.println("Результат: " + f3.getNumerator()+ "/" + f3.getDenominator());
		System.out.println("////////////////////////////////////////////////////////////");
	}
	
	public void printSum2(Fraction f2,Fraction f3) {
		System.out.println("Вторая дробь: " + f2.getNumerator() + "/" + f2.getDenominator());
		System.out.println("Результат: " + f3.getNumerator()+ "/" + f3.getDenominator());
		System.out.println(" ");
	}

}
