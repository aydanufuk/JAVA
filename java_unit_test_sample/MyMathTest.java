package java_unit_test_sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.*;

class MyMathTest {

	MyMath _math;

	@BeforeEach
	void setUp() throws Exception {
		_math = new MyMath(7, 10);
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(17, _math.add());
	}
	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */

}
