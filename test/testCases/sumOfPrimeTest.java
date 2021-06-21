package javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.sumOfPrime;

class sumOfPrimeTest {

	@Test
	void test() {
		sumOfPrime test = new sumOfPrime();
		int output = test.sum(100);
		assertEquals(1060,output);
	}

}
