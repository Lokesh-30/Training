package javaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.checkPower;

class checkPowerTest {

	@Test
	void test() {
		checkPower test = new checkPower();
		boolean output = test.check(64);
		assertEquals(true,output);
	}

}
