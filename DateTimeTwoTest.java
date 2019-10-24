import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTimeTwoTest {
	
	@Test
	public void dayOfTheWeekTest() {
		String expected = "Thursday";
		
		Date date1 = (new GregorianCalendar(2019, 9, 10)).getTime();
	    SimpleDateFormat format = new SimpleDateFormat("EEEE");
	    String actual = format.format(date1);
	    
	    assertEquals(expected, actual);
	}

	
}
