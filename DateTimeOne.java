import java.time.LocalTime;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	private int timeSecond;

	public DateTimeOne() {
		
	}
	public int getValueOfSecond() {
		LocalTime time = LocalTime.now();
		String seconds = time.toString();
		String s = seconds.substring(6, 8);
		int second = Integer.parseInt(s);
		this.timeSecond = second;
		return timeSecond;
	   
	}
   
	public void dateTimeNow() {
	   
	}
	
	public void sleepForFiveSec() {
	   
	}
   
	public void dateTimeOfOtherCity() {
	   
	}
   
	public void dateTimeDifferentZone() {
	   
	}
   
	public void timeZoneHashMap() {
	   
   }
}