import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DateSortingUsingAlgorithmTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void sortingTest() {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2018, 10, 25);
		LocalDate[] dates = new LocalDate[2]; 
		dates[1] = date1;
		dates[0] = date2;
		
		String actual ="";
		 for (int i = 0; i < dates.length - 1; i++) {

	            int min = i;

	            // find the first, second, third, fourth... smallest value
	            for (int j = i + 1; j < dates.length; j++) {
	                if (dates[j].compareTo(dates[min]) > 0) {
	                    min = j;
	                }
	            }

	            // swaps the smallest value with the position 'i'
	            LocalDate temp = dates[i];
	            dates[i] = dates[min];
	            dates[min] = temp;
	            
	            //next pls
	        }
		 actual = dates[0].toString() +" "+  dates[1].toString();
		 String expected = "2019-10-25 2018-10-25";
		 assertEquals(expected, actual);
	}

}
