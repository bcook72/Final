package resturant;

/* this implements the JUnit test */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitFullSlabTest {

	@Test
	void test() {
		String slab = "name = \"The Full Slab\";";
		assertTrue(slab.contains("Full"));
	}

}
