package javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.numberPalindrome;

class numPalindromeTest {

	@Test
	void test() {
		numberPalindrome test = new numberPalindrome();
		boolean output = test.numP(12321);
		assertEquals(true,output);
	}

}
