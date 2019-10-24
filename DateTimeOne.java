import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
		//Create a Hashmap to hold the info about the time zones.
		HashMap<String, String> timeZones = new HashMap<String, String>();
		
		//Get the date and time of different time zones.
		LocalDateTime Gmt = LocalDateTime.now(ZoneId.of("GMT"));
		LocalDateTime Bst = LocalDateTime.now(ZoneId.of("GMT+6"));
		LocalDateTime Cst = LocalDateTime.now(ZoneId.of("America/Chiago"));
		
		//Create an arraylist to hold the time zone ids.
		ArrayList<String> timeZoneId = new ArrayList<String>();
		timeZoneId.add("GMT: ");
		timeZoneId.add("BST: ");
		timeZoneId.add("CST: ");
		
		ArrayList<String> dateAndTime = new ArrayList<String>();
		dateAndTime.add(Gmt.getMonth() + "/" + Gmt.getDayOfMonth() + "/" + Gmt.getYear()
			+" " + Gmt.toString().substring(11, 13) + ":" + Gmt.getMinute());
		dateAndTime.add(Bst.getMonth() + "/" + Bst.getDayOfMonth() + "/" + Bst.getYear()
			+" " + Bst.toString().substring(11, 13) + ":" + Bst.getMinute());
		dateAndTime.add(Cst.getMonth() + "/" + Cst.getDayOfMonth() + "/" + Cst.getYear()
			+" " + Cst.toString().substring(11, 13) + ":" + Cst.getMinute());
		
		for (int i = 0; i < timeZoneId.size(); ++i) {
			timeZones.put(timeZoneId.get(i), dateAndTime.get(i));
		}
		
		System.out.println("Date/time at other zones:");
		
		for (Map.Entry<String, String> entry : timeZones.entrySet())  {
			System.out.println(entry.getKey() + entry.getValue());
		}
		
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