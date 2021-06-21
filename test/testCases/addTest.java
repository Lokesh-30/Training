package javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.add;

class addTest {

	@Test
	void test() {
		add test = new add();
		int output = test.addition(5, 5);
		assertEquals(10,output);
		
	}

}
