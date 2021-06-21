package javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.sumDigits;

class sumDigitsTest {

	@Test
	void test() {
		sumDigits test = new sumDigits();
		long output = test.sumDigits(122);
		assertEquals(5,output);
	}

}
