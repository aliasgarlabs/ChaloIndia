import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Train {
	
	String trainNo;
	String trainName;
	int stops;
	
	Station sourceStation = new Station();  	//sourceStation is nothing but 'head' of the list
	
	Train()
	{
		sourceStation = null;
	}
	
	public String getTrainName()
	{
		return this.trainName;
	}
	public Station getSourceStation()
	{
		return this.sourceStation;
	}
	
	public Station getDestinationStation()
	{
		Station temp = sourceStation;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		return temp;
	}
	public String getTrainNo()
	{
		return this.trainNo;
	}
	
	public int getStops()
	{
		return this.stops;
	}
	
	Train(String trainName, String trainNo, int stops)
	{
		this();
		this.trainName = trainName;
		this.trainNo = trainNo;
		this.stops = stops;
	}
	
	public void addStation(Station station)
	{
		if(sourceStation==null)				//First station is the source station
			sourceStation = station;
		else 								//Traverse to the end to add station
		{
			Station tempStation = sourceStation;
		
			while(tempStation.next!=null)
				tempStation = tempStation.next;
			
			if(tempStation.next==null)
			{
				tempStation.next = station;
			}
		}
	}
	
	public void showAllStations()
	{	
		System.out.println(trainName +" ("+trainNo+") Stations:");
		System.out.println(getAllStations());
	}
	
	public List<String> getAllStations()
	{
		Station tempStation = sourceStation;
		List<String> allStations= new ArrayList<String>();
	
		while(tempStation!=null)
		{	
			allStations.add(tempStation.stationName);
			
			tempStation = tempStation.next;
		}
		
		return allStations;
	}
	
	public Station[] getAllStation()
	{
		Station tempStation = sourceStation;
		Station allStations[]= new Station[stops];
		int i=0;
		
		while(tempStation!=null)
		{	
			allStations[i]= tempStation;			
			tempStation = tempStation.next;
			i++;
		}
		
		return allStations;
	}
	
	public HashMap<String,String> getAllStationCodes()
	{
		Station tempStation = sourceStation;
		
		HashMap<String,String> hm=new HashMap<String,String>();  
		  
		  
		while(tempStation!=null)
		{	
			if(!hm.containsKey(tempStation.stationCode))
				hm.put(tempStation.stationCode, tempStation.stationName);
			tempStation = tempStation.next;
		}
		
		return hm;
	}
	
	
	
}
