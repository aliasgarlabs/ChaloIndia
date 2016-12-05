import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;


public class Utility {
	
	static public int[] readableToMinutes(String[] readable)
	{	
		StringTokenizer st;
		int minutes[] = new int[readable.length];
		int i=0;
		for(String read: readable)
		{
			st= new StringTokenizer(read,":");
			minutes[i] = Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
			i++;
		}
		return minutes;
		
	}
	
	static public String parseCode(String label)
	{
		StringTokenizer st = new StringTokenizer(label,"(");
		String code=null;
		while(st.hasMoreTokens())
		{	
			code = st.nextToken();
			code = code.substring(0, code.length()-2);
		}
		return code;
		
	}
	
	static public String parseName(String label)
	{
		StringTokenizer st = new StringTokenizer(label,"(");
		String name=null;
			
		name = st.nextToken();
			
		
		return name;
		
	}
	
	static public boolean isAlreadyAdded(Station[] rootStation, Station newRootStation)
	{
		//System.out.println("Lenght of rootStation is "+ rootStation.length);
		for(Station station: rootStation)
		{	
			if(station!=null)
				{	//System.out.println("Already added station "+station.getStationName());
					if(station.getStationName().equals(newRootStation.getStationName()))
						return true;
				}	
		}
		
		return false;
		
		
		
	}
	
	static public Station[] getUniqueStationList(Train[] allTrains)
	{
		List<Station> stationList = new ArrayList<Station>();
		
		for(Train train : allTrains)
		{
			Station allStation[] = train.getAllStation();
			
			for(Station station: allStation)
			{	
				
						stationList.add(station);
					
			}
		
		}
		
		int i,j;
		for(i=0;i<stationList.size();i++)
		{
			for(j=i+1;j<stationList.size();j++)
			{
					if(stationList.get(i).getStationCode().equals(stationList.get(j).getStationCode()))
						stationList.remove(i);
					
			}
		}
		
		Set<Station> hs = new HashSet<>();
		hs.addAll(stationList);
		stationList.clear();
		stationList.addAll(hs);
		
		Station[] allUniqueStation = stationList.toArray(new Station[Constants.MAX_STATIONS]);
		
		
		
				
		return allUniqueStation;
	}
	static public int getNoOfFoundTrain(Train[] foundTrain)
	
	{
		int dt=0;
		if(foundTrain!=null)
		{	
			
			for(Train train: foundTrain)
			{		
					if(train!=null)
					{	
						dt++;
						
					}
			}
		}
		return dt;
		
	}
	static public String getReadableTime(int time)
	{
		return  "" + time/60 +" : " + time%60;
	}
	static public void showTrainDetails(Train train)
	{
		System.out.println("Train No: " + train.getTrainNo()+"\nTrain Name: "+ train.getTrainName()+"\nSorce: "+ train.getSourceStation().getStationName()+"\tat " + Utility.getReadableTime(train.getSourceStation().getDeparture())+"\nDestination: "+ train.getDestinationStation().getStationName()+"\tat "+Utility.getReadableTime(train.getDestinationStation().getArrival())+"\n");
	}
	static public Station getStationBySouceCode(Train[] allTrains, String sourceCode)
	{
		Station uniqueStation [] = getUniqueStationList(allTrains);
		for(Station station: uniqueStation)
		{
			if(station.getStationCode().equals(sourceCode))
				return station;
		}
		
		return null;
	}

}
