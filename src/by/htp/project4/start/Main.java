package by.htp.project4.start;

import by.htp.project4.entity.Complex;
import by.htp.project4.logic.ComplexLogic;
import by.htp.project4.presentation.ComplexView;

public class Main {

	public static void main(String[] args) {
		Complex r1 = new Complex(2, 3);
		Complex r2 = new Complex(4, 5);
		Complex r3;
		
		ComplexLogic logic = new ComplexLogic();
		ComplexView view = new ComplexView();
		
		r3 = logic.sum(r1, r2);
		view.printSum(r1,r2,r3);
		
		r3 = logic.substraction(r1, r2);
		view.printSum(r1,r2,r3);
	}

}
