package testCases;

import org.testng.Assert;

@org.testng.annotations.Test
public class Test {

	{
		  Assert.assertTrue(5<9);
		   System.out.println("Assertion Failed");
		   Assert.assertFalse(6<5);
		   System.out.println("Assertion Failed");
		   Assert.assertEquals("S", "S");
		   System.out.println("Assertion Failed");
	}

}
