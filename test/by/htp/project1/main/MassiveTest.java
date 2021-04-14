package by.htp.project1.main;

import org.junit.Assert;
import org.junit.Test;
import by.htp.project1.logic.MassiveLogic;

public class MassiveTest {

	  @Test
	  public void massiveT001() {
		  int[] massive = new int[] {1,2,3,4,5};
		  boolean checkReal;
		  boolean checkExp = true;
		  
		  MassiveLogic logic = new MassiveLogic();
		  
		  checkReal = logic.check(massive);
		  Assert.assertEquals(checkExp, checkReal);
	  }
	  
	  @Test
	  public void massiveT002() {
		  int[] massive = new int[] {1,0,3,4,5};
		  boolean checkReal;
		  boolean checkExp = false;
		  
		  MassiveLogic logic = new MassiveLogic();
		  
		  checkReal = logic.check(massive);
		  Assert.assertEquals(checkExp, checkReal);
	  }
	  
}
