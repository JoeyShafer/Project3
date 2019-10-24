
public class MesoAsciiCal extends MesoAsciiAbstract 
{
	private String stid;
	public MesoAsciiCal(MesoStation stid) {
		this.stid = stid.getStID();
	}
	
	public int calAverage() {
		//Create array to store the average and the station id in ascii form
		int[] calAverage = new int[3];
		int[] ascii = new int[4];
		
		//converts station id to ascii number
		for (int i = 0; i < stid.length(); ++i) {
			ascii[i] = (int)stid.charAt(i);
		}
				
		//finds the average of the ascii numbers
		double average = 0;
		for (int i = 0; i < ascii.length; ++i) {
			average += ascii[i];
		}
		average = average/ascii.length;
				
		//Finds the ceiling, floor, as well as rounds the average up or down
		calAverage[0] = (int)Math.ceil(average);
		calAverage[1] = (int)Math.floor(average);
		if ((average -calAverage[1]) > 0.25) {
			calAverage[2] = (int)Math.ceil(average);
		}
		else {
			calAverage[2] = (int)Math.floor(average);
		}
		return calAverage[2];
	}

}