package testjunit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class J01Assertions {
	/*
	 1)  In JUnit5 , we do not type Access modifiers but it is not "default".
	     it is "public" or "protected".
	    Note: in Junit4 , we were typing public, JUnit5 made it easier.

	 */

	@Test
	void testToFail() {
		fail("Not yet implemented");
	}

	@Test
	void testLength() {
		//The value which is coming from the method under test.==> called actual
		int actualLength = "ABCD".length();
		System.out.println(actualLength);
		//The Value which we decide==> called expected.
		int expectedLength = 4;
		System.err.println(expectedLength);
		// we need to compare Actual and Expected values==>called: "Assertion"
		//1st.  assert.Equals()
		//a)assertEquals with 2 parameters.
		assertEquals(expectedLength, actualLength);
		assertEquals("ABCD".length(), 4);
		//b) assertEquals with 3 parameters
		assertEquals(expectedLength, actualLength, "Lengths are not matching");
		//simple, readable, isolated

	}

}
