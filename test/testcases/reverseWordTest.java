package javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.reverseWord;

class reverseWordTest {

	@Test
	void test() {
		reverseWord test = new reverseWord();
		String output = test.reverseW("abcd");
		assertEquals("dcba",output);
	}

}
