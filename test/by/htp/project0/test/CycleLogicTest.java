package by.htp.project0.test;

import org.junit.Assert;
import org.junit.Test;

import by.htp.project0.entity.Cycle;
import by.htp.project0.logic.CycleLogic;

public class CycleLogicTest {
	  @Test
	  public void cycleT001() {
	    Cycle real = new Cycle(2,2,4);
	    Cycle exp = new Cycle(4,4,16);
	    CycleLogic logic = new CycleLogic();
	    
	    real = logic.exponent(real);
	    Assert.assertEquals(exp, real);
	  }
	  
	  @Test
	  public void cycleT002() {
	    Cycle real = new Cycle(-2,-2,-4);
	    Cycle exp = new Cycle(16,16,256);
	    CycleLogic logic = new CycleLogic();
	    
	    real = logic.exponent(real);
	    Assert.assertEquals(exp, real);
	  }
}