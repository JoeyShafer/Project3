import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MesoEquivalent {
	//Stores the station id
	private String stid;
	private ArrayList<String> stations = new ArrayList<String>();
	
	//Constructor for MesoEquivalent takes a string input the repersents a station id.
	public MesoEquivalent(String stid) throws IOException {
		this.stid = stid;
		read();
	}
	
	public HashMap<String, Integer> calAsciiEqual() {
		//Create a HashMap to store the stations with the same average.
		HashMap<String, Integer> asciiEqual = new HashMap<String, Integer>();
		
		//calculate the asciiAcerage of the station id
		MesoAsciiCal asciiAverage = new MesoAsciiCal(new MesoStation(stid));
		int asciiAvg = asciiAverage.calAverage();	
		
		//add the station and the average to the hashmap
		asciiEqual.put(stid, asciiAvg);
		
		//go through all the stations calculating their averages 
		// and comparing if they match, if they do add the station to HashMap
		for (int i = 0; i < stations.size(); ++i) {
			asciiAverage = new MesoAsciiCal(new MesoStation(stations.get(i)));
			int avg = asciiAverage.calAverage();
			if (asciiAvg == avg) {
				asciiEqual.put(stations.get(i), asciiAvg);
			}
		}
		return asciiEqual;
	}
	
	/*
	 * Loads a list of station Id's from a txt file. Each line repersents one station.
	 * 
	 *  @Param filename name of txt file that will be read in.
	 */
	public void read() throws IOException
	{
		// Declare a BufferReader to read in file.
	   BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
       String strg;
       
       // Read in and throw out the first five lines of the file to get to station Id's.
       for (int i = 0; i < 3; ++i) {
       	strg = br.readLine();
       }
       
       //read in first line of station Id's.
       strg = br.readLine();
       
     
       while (strg != null) {
       
       	// Get the station Id from the line and add to staion array.
       	String stationID = strg.substring(1,5);
       	stations.add(stationID);
       	
       	//Read next line and increase lineNum and index.
       	strg = br.readLine();      	
       }
      
       br.close();
		
	}
}
