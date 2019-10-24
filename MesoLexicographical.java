import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{
	/*
	 * Sort an unsorted HashMap and return the sorted map
	 * 
	 * @Param unsorted - unsorted HashMap
	 * @see MesoSortedAbstract#sortedMap(java.util.HashMap)
	 */
	public Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		//Use a TreeMap the sort the HashMap.
		TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(unsorted);
		return sorted;
		
	}
}