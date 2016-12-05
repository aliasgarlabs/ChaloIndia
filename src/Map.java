import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;



public class Map {
	List<Path> pathStations = new ArrayList<Path>();
	Station rootStation[] = new Station[10];
	int noOfStations;
	List<Station> connectedStation = new ArrayList<Station>();
	HashMap<Station, Path> mapGraph = new HashMap<>();
	
	Map()
	{
		
	}
	public void printMap()
	{
		  Iterator it = mapGraph.entrySet().iterator();
	      while (it.hasNext()) {
	          java.util.Map.Entry pair = (java.util.Map.Entry)it.next();
	          {
	        	  //while((Path)pair.getValue().nextPath != null))
	          }
	          {
	        
	          }
	          //if(((Path)pair.getValue()).getNextPath()!=null)
	          System.out.println((  "PATH: " + ((Station)pair.getKey()).getStationName() +" -> " +((Path)pair.getValue()).getStation().getStationName() ));
	       	 
	      }
      
	}
	public void addPath(Train train, Station newRootStation, Station allStation)
	{
		Path path = new Path(train,allStation);
		
		if(mapGraph.containsKey(newRootStation))
		{
			mapGraph.get(newRootStation).setNextPath(path);
		}
		else
		{
			mapGraph.put(newRootStation, path);
		}
		
		int j=0;
		boolean connected = false;
		for(Station connectStation: connectedStation)
		{
	
			if(connectStation==null)
				break;
			else if(connectStation.getStationCode().equals(allStation.getStationCode()))
				connected = true;
			j++;
		}
		
		if(allStation!=null && !connected)
			connectedStation.add(allStation.next);
	
		
	}
	
	public int getPathPosition(Station newRootStation)
	{
		int i=0;
		for(Station newRoot: rootStation)
		{
			if(newRoot.getStationCode().equals(newRootStation.getStationCode()))
				return i;
			i++;
		}
				
		return -1;
	}
	
	public Station[] getRootStation()
	{
		return this.rootStation;
	}
	
	public List<Station> getConnectedStation()
	{
		return this.connectedStation;
	}
	
	public void setRootStation(Train[] allTrains)
	{	
		this.rootStation = Utility.getUniqueStationList(allTrains);	
		
	}
	
	
}
