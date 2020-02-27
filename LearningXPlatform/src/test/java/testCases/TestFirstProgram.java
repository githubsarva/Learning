package testCases;

import org.testng.annotations.Test;

public class TestFirstProgram {
	@Test(invocationCount = 150)
	public void print() {
		System.out.println("Test invocation Count");
	}

}
