package resturant;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/* this implements a junit test */

public class JUnitLightTest {

	@Test
	public void test() {
		String light = "light is on";
		assertTrue(light.contains("on"));
		
	}

}
