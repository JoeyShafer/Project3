import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
	   
	}
   
	public void timeZoneHashMap() {
	   
   }
}