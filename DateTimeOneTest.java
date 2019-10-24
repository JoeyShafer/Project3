import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateTimeOneTest {

	
	@Test
	public void getSecondTest() {
		LocalTime time = LocalTime.now();
		int expected = time.getSecond();
		DateTimeOne test = new DateTimeOne();
		int actual = test.getValueOfSecond();
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void getDateTest() {
		String expected = "10/23/2019";
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String actual = dateFormat.format(date);
		assertEquals(expected, actual);
	}
	
	@Test
	public void getHour() {
		String expected = "02";
		LocalDateTime Cst = LocalDateTime.now(ZoneId.of("GMT"));
		String actual = Integer.toString(Cst.getHour());
		assertEquals(expected, actual);
		
	}

}
