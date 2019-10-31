# Project3
For this Project I had to preform operations with date/time and Ascii values as well as sort list using hashMaps. In this project I had to get the current date and time in different locations as well as find the difference between times, and then sort lists of date in different orders. I also had to take in a four letter string that repersented a station id from a list of stations and find the Ascii average value of that String, then find and sort a list of stations that had the same average Ascii value. The first thing I had to do was create the DateTimeOne Class I had to get the value of the current second and the curretn time and date and I used localDateTime to get this, also had to get the time in different timezones and put them in a hashMap to sort. The next thing I had to do was create the DateTimeTwo class which would get the certain day of any month and it would find the time between the current date and a given date, next this class wpuld sort dates from a txt file in decending and increasing order. The next thing I had to do was the MesoAsciiCal class which extends the MesoAsciiAbstract class, this class would take a four letter String repersenting a station id and find the average Ascii value of that string and the Ascii average of the NRMN station. The next thing I did was create the MesoEquivalent class which would go through the list of stations and finds stations that have the same Ascii average and put them into a HashMap. After this I created the MesoLexographical class which would take the HashMap of stations, sort them and print them out. Finally the last thing I did was create the DateSortUsingAlgrothims class which would sort dates from a txt in decreasing, and increasing order and I did this using the slection sort.

DateTimeOne Class

public int getValueOfSecond() 
  This method gets the value of the current second by using the LocalTime class to get the current second.
  
public void dateTimeNow() 
  This gets the current time and date and prints them out using the Date and LocalTime class.
  
public void dateTimeOfOtherCity() 
  This method would get the time in four different time zones, current location, Gmt, Bst, Cst, and put them in a HashMap and print them out.
  
public void dateTimeDifferentZone()
  This method would get the date and time in three different time zones, Gmt, Bst, Cst, and put them in a HashMap and print them out.\
  
public void timeZoneHashmap()
  This method would get the date and time of five differnt time zones and put them in a HashMap and sort them and print them out, then it would put the values of the first HashMap as key of another HashMap and them sorts those value. The next thing this method does is it takes the value of the second HashMap and converts them into a LocalDateTime ArrayList and sorts them.
  
  DateTimeTwo() 
  
  public void daysOfCurrentMonth()
    This method gets the tenth and eighteenth day of the current month and prints them out using LocalDate and GeograinCalendar.
    
  public void daysOfAnyMonth()
    This method would get the fifeenth and last day of any month and prints them out LocalDate and GeograinCalendar.
    
  public void compareYear() 
    This method gets the dates from a txt file and finds if it is a leap year or not and then finds how far the dates are from the current dates and this does that by using the period class.
    
public void dateHashMap() 
  This method takes the dates from the txt file and puts them into a HashMap and print them out.
  
public void dateHashMapSorted()
  This method takes the dates from the txt file and puts them into a HashMap, sorts them and print them out.
    
MesoAsciiCal Class

public int calAverage() 
  This method takes a given four letter String, and the String NRMN, finds the average Ascii value of each one then adds them to find the average Ascii value of both of them combined and returns it.
  
MesoEquivalent Class

public HashMap<String, Integer> calAsciiEqual() 
  This method uses the Ascii average calculated from the method above and loops through an array containing all the station ids to find stations that share the same Ascii average value and then stores them into a HashMap and returns it.
  
MesoLexicographical class

public Map<String, Integer> sortedMap() 
  this method takes the HashMap from the prevoius class and sorts and prints the keys of the HashMap.
  
DateSortingUsingAlgrothim class
  
public void dateHashMapSortingDescending() 
  This method takes input dates read in from a txt file and uses selection sort to sort them in a descending order.
  

public void dateHashMapSorting() 
  This method takes input dates read in from a txt file and uses selection sort to sort them.
