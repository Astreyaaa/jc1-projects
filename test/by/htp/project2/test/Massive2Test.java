package by.htp.project2.test;

import org.junit.Assert;
import org.junit.Test;

import by.htp.project2.logic.Massive2Logic;

public class Massive2Test {
	
	@SuppressWarnings("deprecation")
	@Test
	  public void massiveT001() {
		  int[][] massiveExp = new int[][] {{1,2,3},{4,5,6}};
		  int[][] massiveReal = new int[2][3];
		  Massive2Logic logic = new Massive2Logic();
		  
		  massiveReal = logic.fill(massiveReal);
		  Assert.assertEquals(massiveExp, massiveReal);
	  }

}
