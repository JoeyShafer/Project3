import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
	
	@Test
	public void lastDayOfTheMonthTest() {
		Date day = new GregorianCalendar(2019, 9, Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH)).getTime();
		SimpleDateFormat format = new SimpleDateFormat("EEEE");
		String actual = format.format(day);
		
		String expected = "Thursday";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void differenceOfDatesTest() {
		LocalDate today = LocalDate.now();
		LocalDate past = LocalDate.of(2017, 10, 12);
		
		Period period = Period.between(past, today);
	    int actual = period.getYears();
	    int expected = 2;
	    assertEquals(expected, actual);
	    actual = period.getMonths();
	    expected = 0;
	    assertEquals(expected, actual);
	    actual = period.getDays();
	    expected = 12;
	    assertEquals(expected, actual);
	    
		
	}

	
}
