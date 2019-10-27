
public class MesoAsciiCal extends MesoAsciiAbstract 
{
	private String stid;
	public MesoAsciiCal(MesoStation stid) {
		this.stid = stid.getStID();
	}
	
	public int calAverage() {
		//Create array to store the average and the station id in ascii form
		String Nrmn ="NRMN";
		double calAverage;
		int average;
		int[] ascii = new int[4];
		
		//converts station id to ascii number
		for (int i = 0; i < stid.length(); ++i) {
			ascii[i] = (int)stid.charAt(i);
		}
				
		//finds the average of the ascii numbers
		double paramAverage = 0;
		for (int i = 0; i < ascii.length; ++i) {
			paramAverage += ascii[i];
		}
		paramAverage = paramAverage/ascii.length;
		
		//converts station id to ascii number
		for (int i = 0; i < Nrmn.length(); ++i) {
				ascii[i] = (int)Nrmn.charAt(i);
		}
						
		//finds the average of the ascii numbers
		double nrmnAverage = 0;
		for (int i = 0; i < ascii.length; ++i) {
			nrmnAverage += ascii[i];
		}
		nrmnAverage = nrmnAverage/ascii.length;
				
		//Finds the ceiling, floor, as well as rounds the average up or down
		calAverage = (int)(paramAverage + nrmnAverage) / 2;
		average = (int)Math.ceil(calAverage);
		/*
		if ((average -calAverage[1]) > 0.25) {
			calAverage[2] = (int)Math.ceil(average);
		}
		else {
			calAverage[2] = (int)Math.floor(average);
		}*/
		return average;
	}

}