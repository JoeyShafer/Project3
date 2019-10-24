import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MesoAsciiCalTest {

	@Test
	public void testCalAverage() {
		int expected = 79;
		MesoAsciiCal ascii = new MesoAsciiCal(new MesoStation("NRMN"));
		int actual = ascii.calAverage();
		assertEquals(expected, actual);
	}

}
