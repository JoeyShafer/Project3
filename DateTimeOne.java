import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

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
		System.out.println("The value of the current second now: " + second);
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
		//Get current time locally, GMT, and BSt
		LocalTime timeNow = LocalTime.now();
		LocalTime GMT = LocalTime.now(ZoneId.of("GMT"));
		LocalTime BST = LocalTime.now(ZoneId.of("GMT+6"));
		LocalTime CST = LocalTime.now(ZoneId.of("GMT-5"));
					
						
		//Create ArrayList to hold the different time zones.
		ArrayList<String> timeZones = new ArrayList<String>();
		timeZones.add("Time on Server: " + timeNow.getHour() +":" + timeNow.getMinute());
		timeZones.add("GMT: " + GMT.getHour() + ":" + GMT.getMinute());
		timeZones.add("BST (90E): " + BST.getHour() + ":" + BST.getMinute());
		timeZones.add("CST (90W): " + CST.getHour() +":" + CST.getMinute());
						
		//Print out the time in different time zones
		for(int i = 0; i < timeZones.size(); ++i) {
			System.out.println(timeZones.get(i));
		}
		
	}
   
	public void dateTimeDifferentZone() {
		//Create a Hashmap to hold the info about the time zones.
		HashMap<String, String> timeZones = new HashMap<String, String>();
				
		//Get the date and time of different time zones.
		LocalDateTime Gmt = LocalDateTime.now(ZoneId.of("GMT"));
		LocalDateTime Bst = LocalDateTime.now(ZoneId.of("GMT+6"));
		LocalDateTime Cst = LocalDateTime.now(ZoneId.of("America/Chicago"));
				
		//Create an arraylist to hold the time zone ids.
		ArrayList<String> timeZoneId = new ArrayList<String>();
		timeZoneId.add("GMT: ");
		timeZoneId.add("BST: ");
		timeZoneId.add("CST: ");
				
		//Create an arraylist to hold the date and time.
		ArrayList<String> dateAndTime = new ArrayList<String>();
		dateAndTime.add(Gmt.getMonthValue() + "/" + Gmt.getDayOfMonth() + "/" + Gmt.getYear()
		+" " + Gmt.toString().substring(11, 13) + ":" + Gmt.getMinute());
		dateAndTime.add(Bst.getMonthValue() + "/" + Bst.getDayOfMonth() + "/" + Bst.getYear()
					+" " + Bst.toString().substring(11, 13) + ":" + Bst.getMinute());
		dateAndTime.add(Cst.getMonthValue() + "/" + Cst.getDayOfMonth() + "/" + Cst.getYear()
					+" " + Cst.toString().substring(11, 13) + ":" + Cst.getMinute());
				
		//put the two arraylist into the HashMao
		for (int i = 0; i < timeZoneId.size(); ++i) {
			timeZones.put(timeZoneId.get(i), dateAndTime.get(i));
		}
				
		//Print out the HashMap
		for (Map.Entry<String, String> entry : timeZones.entrySet())  {
			System.out.println(entry.getKey() + entry.getValue());
		}
				
	   
	}
   
	public void timeZoneHashMap() {
		HashMap<String, String> timeZones1 = new HashMap<String, String>();
		
		//Get the date and time of different time zones.
		LocalDateTime Gmt = LocalDateTime.now(ZoneId.of("GMT"));
		LocalDateTime Bst = LocalDateTime.now(ZoneId.of("GMT+6"));
		LocalDateTime Cst = LocalDateTime.now(ZoneId.of("America/Chicago"));
		
		//Create an arraylist to hold the time zone ids.
		ArrayList<String> timeZoneId = new ArrayList<String>();
		timeZoneId.add("GMT");
		timeZoneId.add("BST");
		timeZoneId.add("CST");
		timeZoneId.add("AST");
		timeZoneId.add("ZST");
		
		//Create an arraylist to hold the date and time.
		ArrayList<String> dateAndTime = new ArrayList<String>();
		dateAndTime.add(Gmt.getMonthValue()+ "/" + Gmt.getDayOfMonth() + "/" + Gmt.getYear()
			+" " + Gmt.toString().substring(11, 13) + ":" + Gmt.getMinute());
		dateAndTime.add(Bst.getMonthValue() + "/" + Bst.getDayOfMonth() + "/" + Bst.getYear()
			+" " + Bst.toString().substring(11, 13) + ":" + Bst.getMinute());
		dateAndTime.add(Cst.getMonthValue() + "/" + Cst.getDayOfMonth() + "/" + Cst.getYear()
			+" " + Cst.toString().substring(11, 13) + ":" + Cst.getMinute());
		dateAndTime.add("10/01/2020 19:59");
		dateAndTime.add("11/05/2018 19:59");
		
		//put the two arraylist into the HashMap
		for (int i = 0; i < timeZoneId.size(); ++i) {
			timeZones1.put(timeZoneId.get(i), dateAndTime.get(i));
		}
		
		//Convert the HashMap to a TreeMap to sort
		TreeMap<String, String> sort = new TreeMap<String, String>(timeZones1);
		timeZones1 = new HashMap<String, String>(sort);
		
		//Print out style 1
		System.out.println("Print Style 1:");
		for (Map.Entry<String, String> entry : sort.entrySet())  {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//create a second HashMap to store the values of the first HashMap as keys
		HashMap<String, String> timeZones2 = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : timeZones1.entrySet()) {
			timeZones2.put(entry.getValue(), "");
		}
		
		//use a TreeMap to sort the keys of the second HashMap
		sort = new TreeMap<String, String>(timeZones2);
		timeZones2 = new HashMap<String, String>(sort);
		
		//Print out style 2
		System.out.println("Print Style 3:");
		for (Map.Entry<String, String> entry : sort.entrySet())  {
			System.out.println(entry.getKey() + entry.getValue());
		}
		
		//Create an Arraylist to store the localDateTime of the dates in the HashMaps
		ArrayList<LocalDateTime> localDateTime = new ArrayList<LocalDateTime>();
		
		//Format the String into LocalDateTime and add to ArrayList
		DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
				.appendPattern("MM/dd/yyy HH:mm")
				.toFormatter(Locale.ENGLISH);
		localDateTime.add(Gmt);
		localDateTime.add(Bst);
		localDateTime.add(Cst);
		localDateTime.add(LocalDateTime.parse(timeZones1.get("AST"), formatter));
		localDateTime.add(LocalDateTime.parse(timeZones1.get("ZST"), formatter));
		
		//Sort ArrayList and print it out.
		Collections.sort(localDateTime);
		
		System.out.println("Print Style 5: Final sorted Array:");
		for (int i = 0; i < localDateTime.size(); ++i) {
			System.out.println(localDateTime.get(i).toString().substring(0, 16));
		}
	   
   }
}