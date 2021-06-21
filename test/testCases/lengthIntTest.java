package javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.lengthInt;

class lengthIntTest {

	@Test
	void test() {
		lengthInt test = new lengthInt();
		int output = test.intlength(123456);
		assertEquals(6,output);
	}

}
