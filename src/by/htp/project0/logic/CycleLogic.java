package by.htp.project0.logic;

import by.htp.project0.entity.Cycle;

public class CycleLogic {

	public Cycle exponent(Cycle r1) {
		 int a = r1.getA();
		 int b = r1.getB();
		 int c = r1.getC();
		 
		 if (a>0) {
			 a = (int) Math.pow(a,2);
		 }else {
			 a = (int) Math.pow(a,4);
		 }
		 
		 if (b>0) {
			 b = (int) Math.pow(b,2);
		 }else {
			 b = (int) Math.pow(b,4);
		 }

		 if (c>0) {
			 c = (int) Math.pow(c,2);
		 }else {
			 c = (int) Math.pow(c,4);
		 }
		
		Cycle exp = new Cycle(a,b,c);
		 
		return exp;
	}
	
	
}
