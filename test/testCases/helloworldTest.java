package javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.helloworld;

class helloworldTest {

	@Test
	public void test() {
		helloworld test = new helloworld();
		String output =test.string("helloworld");
		assertEquals("helloworld",output);
	}

}
