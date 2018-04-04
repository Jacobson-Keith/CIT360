package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void testMultiplication() {
		
		Junit test = new  Junit();
		int result = test.multiplication(3, 4);
		assertEquals(12, result);
		
	}

}