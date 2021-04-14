package by.htp.project0.view;

import by.htp.project0.entity.Cycle;

public class CycleView {

	public void print(Cycle r1, Cycle r2) {
		System.out.println("Старые числа: " + r1.getA() + ", " + r1.getB() + ", " + r1.getC());
		System.out.println("Новые числа: " + r2.getA() + ", " + r2.getB() + ", " + r2.getC());
	}
}
