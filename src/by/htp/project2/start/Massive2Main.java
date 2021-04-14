package by.htp.project2.start;

import by.htp.project2.logic.Massive2Logic;
import by.htp.project2.presentation.Massive2View;

public class Massive2Main {

	public static void main(String[] args) {
		
		int[][] massive = new int[2][3];
		
		Massive2Logic logic = new Massive2Logic();
		Massive2View view = new Massive2View();
		
		massive = logic.fill(massive);
		view.print(massive);
	}
}
