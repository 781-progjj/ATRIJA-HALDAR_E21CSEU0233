package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTestFunctions junit = new jUnitTestFunctions();
		int result = junit.testaddNumbers(55,56);
		assertEquals(111,result);
	}

}
