package by.htp.project3.start;

import by.htp.project3.entity.Fraction;
import by.htp.project3.logic.FractionLogic;
import by.htp.project3.presentation.FractionView;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 4);
		Fraction f2 = new Fraction(3, 6);
		Fraction f3;
		
		FractionLogic logic = new FractionLogic();
		FractionView view = new FractionView();
		
		f3 = logic.sum(f1, f2);
		view.printSum(f1,f2,f3);
		
		f3 = logic.substraction(f1, f2);
		view.printSum(f1,f2,f3);
		
		f3 = logic.multiplication(f1, f2);
		view.printSum(f1,f2,f3);
		
		f3 = logic.division(f1, f2);
		view.printSum(f1,f2,f3);
		
		f3 = logic.reduse1(f1);
		view.printSum1(f1,f3);
		
		f3 = logic.reduse2(f2);
		view.printSum2(f2,f3);
	}

}
