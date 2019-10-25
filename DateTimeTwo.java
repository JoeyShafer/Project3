import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class DateTimeTwo {
	
	private ArrayList<String> inputDates = new ArrayList<String>();
	private HashMap<LocalDate, Integer> dates = new HashMap<LocalDate, Integer>();
	
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
		//Get date fo the 15 day of the month
		Date day = new GregorianCalendar(year, month, 15).getTime();
		SimpleDateFormat format = new SimpleDateFormat("EEEE");
		String fifeenthDay = format.format(day).toUpperCase();
		
		//Get the last day of the month
		day = new GregorianCalendar(year, month, Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH)).getTime();
		String lastDay = format.format(day).toUpperCase();
		
		System.out.println("For the year (" + year + ") and month (" +  month + "), the fifeenth day is "
				+ fifeenthDay + "and the last day is " + lastDay);
	}
	
	public void compareYear() {
		//Get the current date 
		LocalDate today = LocalDate.now();
		
		//Create an arraylist of LocalDates and convert the date from dates.txt to localDates.
		ArrayList<LocalDate> date = new ArrayList<LocalDate>();
		DateTimeFormatter df = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd").toFormatter(Locale.ENGLISH);
		for (String s : inputDates) {
			date.add(LocalDate.parse(s, df));
		}
		
		
		boolean isLeapYear;
		String output;
		
		//loop through dates to find out if the year id a leap year and the difference between to dates.
		GregorianCalendar cal = new GregorianCalendar();
		for (int i = 0; i < date.size(); ++i) {
			isLeapYear = cal.isLeapYear(date.get(i).getYear());
			if (isLeapYear) {
				output = date.get(i).getYear() + "is a leap year, ";
			}
			else {
				output = date.get(i).getYear() + "is not a leap year, ";
			}
			
			//Calculate the time between two dates and add to output.
			Period period = Period.between(date.get(i), today);
			output += "and Difference: " + Math.abs(period.getYears()) + " years, " +
					Math.abs(period.getMonths()) + " months, and " + Math.abs(period.getDays())
					+ " days.";
			
			//Store the Local date along with a number in the HashMap dates.
			dates.put(date.get(i), i + 1);
			
			//Print output.
			System.out.println(output);
		}
	}
	
	public void dateHashMap() {
		for (Map.Entry<LocalDate, Integer> entry : dates.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	public void dateHashMapSorted() {
		TreeMap<LocalDate, Integer> sorted = new TreeMap<LocalDate, Integer>(dates);
		
		for (Map.Entry<LocalDate, Integer> entry : sorted.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	public void read() throws IOException
	{
		// Declare a BufferReader to read in file.
	   BufferedReader br = new BufferedReader(new FileReader("Dates.txt"));
       String strg;
       
       //read in first line of the Dates.
       strg = br.readLine();
       
     
       while (strg != null) {
       
       	inputDates.add(strg);
       	
       	//Read next line.
       	strg = br.readLine();      	
       }
      
       br.close();
		
	}
	
	

}
