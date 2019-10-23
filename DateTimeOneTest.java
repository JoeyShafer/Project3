import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class DateTimeOneTest {

	
	@Test
	public void getSecondTest() {
		LocalTime time = LocalTime.now();
		String seconds = time.toString();
		String s = seconds.substring(6, 8);
		int expected = Integer.parseInt(s);
		DateTimeOne test = new DateTimeOne();
		int actual = test.getValueOfSecond();
		assertEquals(expected, actual);
		
	}

}
