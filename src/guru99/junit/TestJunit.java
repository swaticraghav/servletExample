package guru99.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testSetup() {
		String str = "I am done with Junit setup";
		assertEquals("I am done with Junit setup", str);
	}
}