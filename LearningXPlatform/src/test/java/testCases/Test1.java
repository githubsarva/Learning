package testCases;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
@org.testng.annotations.Test
public class Test1 {
	
	{
		
		SoftAssert sa = new SoftAssert();
		  sa.assertTrue(5<1);
		   System.out.println("Assertion Failed");
		   sa.assertFalse(1<5);
		   System.out.println("Assertion Failed");
		   sa.assertEquals("Passed", "Failed");
		   System.out.println("Assertion Failed");
	}

}
