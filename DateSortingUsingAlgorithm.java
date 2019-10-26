import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DateSortingUsingAlgorithm {
	
	private HashMap<LocalDate, Integer> dates = new HashMap<LocalDate, Integer>();
	private ArrayList<String> inputDates = new ArrayList<String>();
	
	public DateSortingUsingAlgorithm () throws IOException {
		read();
		ArrayList<LocalDate> date = new ArrayList<LocalDate>();
		DateTimeFormatter df = new DateTimeFormatterBuilder().parseCaseInsensitive()
				.appendPattern("yyyy-MM-dd").toFormatter(Locale.ENGLISH);
		for (String s : inputDates) {
			date.add(LocalDate.parse(s, df));
		}
		
		for (LocalDate d : date) {
			dates.put(d, null);
		}
	}
	
	public void dateHashMapSortedDescending() {
		//Create an array to hold the dates
		LocalDate[] date = new LocalDate[dates.size()];
		int index = 0;
		
		//Copy dates from HashMap to array
		for(Map.Entry<LocalDate, Integer> entry : dates.entrySet()) {
			date[index] = entry.getKey();
			++index;
		}
		
		//Sort the array using selection sort
		for (int i = 0; i < date.length - 1; i++) {

            int max = i;

            // find the biggest value
            for (int j = i + 1; j < date.length; j++) {
                if (date[j].compareTo(date[max]) > 0) {
                    max = j;
                }
            }

            // swaps the biggest value with the position 'i'
            LocalDate temp = date[i];
            date[i] = date[max];
            date[max] = temp; 
        }

        for (LocalDate d : date) {
        	System.out.println(d);
        }
		
		
	}
	
	public void dateHashMapSorted() {
		//Create an array to hold the dates
		LocalDate[] date = new LocalDate[dates.size()];
		int index = 0;
				
		//Copy dates from HashMap to array
		for(Map.Entry<LocalDate, Integer> entry : dates.entrySet()) {
			date[index] = entry.getKey();
			++index;
		}
				
		//Sort the array using selection sort
		for (int i = 0; i < date.length - 1; i++) {

            int min = i;

            // find the biggest value
            for (int j = i + 1; j < date.length; j++) {
            	if (date[j].compareTo(date[min]) < 0) {
	            min = j;
		                }
            }

            // swaps the biggest value with the position 'i'
            LocalDate temp = date[i];
	        date[i] = date[min];
	        date[min] = temp; 
		            
		 
		 }
		 
		for (LocalDate d : date) {
	          	System.out.println(d);
	    }
				
				
	}

	public void read() throws IOException
	{
		// Declare a BufferReader to read in file.
	   BufferedReader br = new BufferedReader(new FileReader("SortingDates.txt"));
       String strg;
       
       //read in first line of the Dates.
       strg = br.readLine();
       
     
       while (strg != null) {
    	 
    	   String line = strg.strip();
    	   line = line.replaceAll("\\s", "");
    	   inputDates.add(line);
       	
    	   //Read next line.
    	   strg = br.readLine();      	
       }
      
       br.close();
		
	}
	
}
