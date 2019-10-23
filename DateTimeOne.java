import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	// Holds the value of the current second.
	private int timeSecond;
	

	public DateTimeOne() {
		
	}
	public int getValueOfSecond() {
		//Get the local time
		LocalTime time = LocalTime.now();
		
		//convert local time to string and get the second value to convert to int
		String seconds = time.toString();
		String s = seconds.substring(6, 8);
		int second = Integer.parseInt(s);
		this.timeSecond = second;
		return timeSecond;
	   
	}
   
	public void dateTimeNow() {
		// Get the current date and time. 
		LocalDate dateNow = LocalDate.now();
		LocalTime timeNow = LocalTime.now();
		
		//Convert the date and time to String arrays to format the time and in the correct order. 
		String [] dates = dateNow.toString().split("-");
		String [] times = timeNow.toString().split(":");
		String date = dates[1] + "/" + dates[2] + "/" + dates[3];
		String time;
		int hours = Integer.parseInt(times[0]);
		
		//Check if the hour is in am or pm
		if (hours > 12) {
			hours = hours - 12;
			times[0] = "0" + Integer.toString(hours);
			time = times[0] + ":" + times[1] + "PM";
		}
		else {
			time = times[0] + ":" + times[1] + "AM";
		}
		
		System.out.println("Current Date/Time: " + date + " " + time);
		
		
	   
	}
	
	public void sleepForFiveSec() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
	   
	}
   
	public void dateTimeOfOtherCity() {
	
	   
	}
   
	public void dateTimeDifferentZone() {
		//Get current time locally and for GMT
		LocalTime timeNow = LocalTime.now();
		LocalTime GMT = LocalTime.now(ZoneId.of("GMT"));
			
		//Take GMT and convet string to then get BST
		String [] gmt = GMT.toString().split(":");
		int hour = Integer.parseInt(gmt[0]) + 6;
				
		//Check to make sure time in on 24 hour scale.
		if (hour > 24) {
			hour = hour - 24;
			gmt[0] = Integer.toString(hour);
		}
		String BST = gmt[0] + ":" + gmt[1];
				
		//Create ArrayList to hold the different time zones.
		ArrayList<String> timeZones = new ArrayList<String>();
		timeZones.add("Time of Server: " + timeNow.toString().substring(0, 6));
		timeZones.add("GMT: " + GMT.toString().subSequence(0, 6));
		timeZones.add("BST: " + BST);
		timeZones.add("CST: " + timeNow.toString().substring(0, 6));
				
		//Print out the time in different time zones
		System.out.println("Time at other zones:");
		for(String s : timeZones) {
			System.out.println(s);
		}
	   
	}
   
	public void timeZoneHashMap() {
	   
   }
}