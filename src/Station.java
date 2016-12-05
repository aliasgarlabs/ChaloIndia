import java.util.HashMap;


public class Station {
	
	String stationCode;
	String stationName;
	int departure;            //All the times are in minutes
	int arrival;			  //For ex: 14:30 will be 14*60 + 30 = 870 
	int duration;
	double distance;
	int day;
	Station next;			  //Next station in the route
	
	//Constructors
	Station()
	{
		next=null;
	}
	
	Station(String stationCode, String stationName)
	{	
		this();
		this.stationCode = stationCode;
		this.stationName = stationName;
	}
	
	Station(String stationCode, String stationName, int arrival, int departure, double distance, int day)
	{
		
		this(stationCode,stationName);
		this.arrival = arrival;
		this.departure = departure;
		this.duration = getDuration();
		this.distance = distance;
		this.day = day;
		
	}
	
	Station(String stationCode, String stationName, Station next)
	{	
		this(stationCode,stationName);
		this.next = next;
	}
	
	Station(String stationCode, String stationName, int arrival, int departure, double distance, int day, Station next)
	{
		
		this(stationCode,stationName,arrival,departure,distance,day);
		this.next = next;
		
	}
	
	//Getters & Setters
	
	void setStationCode(String stationCode)
	{
		this.stationCode = stationCode;
	}
	
	void setStationName(String stationName)
	{
		this.stationName = stationName;
	}
	
	String getStationCode()
	{
		return this.stationCode;
	}
	
	String getStationName()
	{
		return this.stationName;
	}
	
	int getDeparture()
	{
		return this.departure;
	}
	
	void setDeparture(int departure)
	{
		this.departure = departure;
	}
	
	void setArrival(int arrival)
	{
		this.arrival = arrival;
	}
	
	int getArrival()
	{
		return this.arrival;
	}
	
	void setStation(Station next)
	{
		this.next = next;
	}
	
	Station getStation()
	{
		return this.next;
	}
	
	double getDistance()
	{
		return this.distance;
	}
	
	void setDistance(double distance)
	{
		this.distance = distance;
	}
	
	int getDay()
	{
		return this.day;
	}
	
	void setDay(int day)
	{
		this.day = day;
	}
	
	private int getDuration()
	{
		if(departure<arrival) 		//For situations when train arrives before midnight 
									//and departs at/after midnight
			departure+=arrival;
		
		return departure-arrival;
	}
	
	static public HashMap<String, String> getAllUniqueStations(Train allTrains[])
	{	
		HashMap<String, String> allUniqueStationCodes =new HashMap<String,String>();  
		
		  
		for(Train train: allTrains)
		{
			HashMap <String, String> allStation = train.getAllStationCodes();
			allUniqueStationCodes.putAll(allStation);
			
		}
		
		
	
				
		System.out.println(allUniqueStationCodes);
		
		return allUniqueStationCodes;
		
	}
	
	
	
	
	
	
}
