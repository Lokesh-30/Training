package javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.numberPalindrome;
import main.wordPalindrome;

class wordPalindromeTest {

	@Test
	void test() {
		wordPalindrome test = new wordPalindrome();
		boolean output = test.wordP("hannah");
		assertEquals(true,output);
	}

}
