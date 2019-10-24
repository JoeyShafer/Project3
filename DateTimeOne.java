import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	// Holds the value of the current second.
	private int timeSecond;
	

	public DateTimeOne() {
		
	}
	public int getValueOfSecond() {
		//Get the local time
		LocalTime time = LocalTime.now();
		
		//get the value of the current second from the local time
		int second = time.getSecond(); 
		this.timeSecond = second;
		return timeSecond;
	   
	}
   
	public void dateTimeNow() {
		// Get the current date and time. 
		Date dateNow = new Date();
		LocalTime timeNow = LocalTime.now();
		SimpleDateFormat dateFormat = new SimpleDateFormat("M/dd/yyyy");
		
		//Convert the date and time to String arrays to format the time and in the correct order. 
		String [] times = timeNow.toString().split(":");
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
		
		System.out.println("Current Date/Time: " + dateFormat.format(dateNow) + " " + time);
		
		
	   
	}
	
	public void sleepForFiveSec() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
	   
	}
   
	public void dateTimeOfOtherCity() {
		HashMap<String, String> timeZones = new HashMap<String, String>();
		LocalDateTime Gmt = LocalDateTime.now(ZoneId.of("GMT"));
	
	   
	}
   
	public void dateTimeDifferentZone() {
		//Get current time locally, GMT, and BSt
		LocalTime timeNow = LocalTime.now();
		LocalTime GMT = LocalTime.now(ZoneId.of("GMT"));
		LocalTime BST = LocalTime.now(ZoneId.of("GMT+6"));
			
				
		//Create ArrayList to hold the different time zones.
		ArrayList<String> timeZones = new ArrayList<String>();
		timeZones.add("Time of Server: " + timeNow.getHour() +":" + timeNow.getMinute());
		timeZones.add("GMT: " + GMT.getHour() + ":" + GMT.getMinute());
		timeZones.add("BST (90E): " + BST.getHour() + ":" + BST.getMinute());
		timeZones.add("CST (90W): " + timeNow.getHour() +":" + timeNow.getMinute());
				
		//Print out the time in different time zones
		System.out.println("Time at other zones:");
		for(String s : timeZones) {
			System.out.println(s);
		}
	   
	}
   
	public void timeZoneHashMap() {
	   
   }
}