package by.htp.project1.start;

import by.htp.project1.logic.MassiveLogic;
import by.htp.project1.presentation.MassiveView;

public class MassiveMain {

	public static void main(String[] args) {
		
		int[] massive = new int[] {1,2,3,4,5};
		boolean check;
		
		MassiveLogic logic = new MassiveLogic();
		MassiveView view = new MassiveView();
		
		check = logic.check(massive);
		view.print(check);
	}
}
