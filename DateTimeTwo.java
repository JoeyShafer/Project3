import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeTwo {
	
	private ArrayList<String> dates = new ArrayList<String>();
	
	public DateTimeTwo () throws IOException {
		read();
		
	}
	
	public void daysOfCurrentMonth() {
		//Get the date for the 10 of October 
		Date day = new GregorianCalendar(2019, 9, 10).getTime();
	    SimpleDateFormat format = new SimpleDateFormat("EEEE");
	    String tenthDay = format.format(day).toUpperCase();
	    
	    //Get the date for the 18 of October
	    day = new GregorianCalendar(2019, 9, 18).getTime();
	    String eighteenthtDay = format.format(day).toUpperCase();
	    
	    System.out.println("The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthtDay);
	   
		
	}
	
	public void daysOfAnyMonth(int month, int year) {
		
		Date day = new GregorianCalendar(year, month, 15).getTime();
		SimpleDateFormat format = new SimpleDateFormat("EEEE");
		String fifeenthDay = format.format(day).toUpperCase();
		
		day = new GregorianCalendar(year, month, Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH)).getTime();
		String lastDay = format.format(day).toUpperCase();
		
		System.out.println("For the year (" + year + ") and month (" +  month + "), the fifeenth day is "
				+ fifeenthDay + "and the last day is " + lastDay);
	}
	
	public void compareYear() {
		
	}
	
	public void read() throws IOException
	{
		// Declare a BufferReader to read in file.
	   BufferedReader br = new BufferedReader(new FileReader("Dates.txt"));
       String strg;
       
       //read in first line of the Dates.
       strg = br.readLine();
       
     
       while (strg != null) {
       
       	dates.add(strg);
       	
       	//Read next line.
       	strg = br.readLine();      	
       }
      
       br.close();
		
	}
	
	

}
