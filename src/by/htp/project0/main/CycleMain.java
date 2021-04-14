package by.htp.project0.main;

import by.htp.project0.entity.Cycle;
import by.htp.project0.logic.CycleLogic;
import by.htp.project0.view.CycleView;

public class CycleMain {

	public static void main(String[] args) {
		
		Cycle r1 = new Cycle(-2,2,-4);
		Cycle r2;
		
		CycleLogic logic = new CycleLogic();
		CycleView view = new CycleView();
		
		r2 = logic.exponent(r1);
		view.print(r1, r2);
	}

}
