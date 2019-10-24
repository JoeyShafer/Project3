import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimeTwo {
	
	public DateTimeTwo () {
		
	}
	
	public void daysOfTheCurrentMonth() {
		//Get the date for the 10 of October 
		Date date1 = new GregorianCalendar(2019, 9, 10).getTime();
	    SimpleDateFormat format = new SimpleDateFormat("EEEE");
	    String tenthDay = format.format(date1).toUpperCase();
	    
	    //Get the date for the 18 of October
	    date1 = new GregorianCalendar(2019, 9, 18).getTime();
	    String eighteenthtDay = format.format(date1).toUpperCase();
	    
	    System.out.println("The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthtDay);
	   
		
	}

}
