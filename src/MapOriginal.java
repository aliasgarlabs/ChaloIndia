//
//public class MapOriginal {
//
//}
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Map {
//	List<Path> pathStations = new ArrayList<Path>();
//	Station rootStation[] = new Station[10];
//	int noOfStations;
//	List<Station> connectedStation = new ArrayList<Station>();
//	
//	Map()
//	{
//		
//	}
//	public void printMap()
//	{
//		System.out.println ("Connected station : ");
//		for(Station cStaion : connectedStation)
//			if(cStaion!=null)  
//			System.out.println (""+cStaion.getStationName());
//		/* Prints the adjacency List representing the graph.*/
//        System.out.println ("the given Adjacency List for the graph \n");
//        int i=0;
//        for (Path path : pathStations)
//        {
//            System.out.print(rootStation[i].getStationName()+" : ");
//            if(path!=null)
//            //for (int j = 1 ;j<pathStations.size() ; j++ )
//            {
//              if(path.getStation()!=null)
//               System.out.print(path.getStation().getStationName()+"->");
//               				 
//            }
//            i++;
//            System.out.println();					
//         }
//      
//	}
//	public void addPath(Train train, Station newRootStation, Station allStation)
//	{
//		int pos = getPathPosition(newRootStation);
//		//System.out.println("The position is " + pos);
//		Path path = new Path(train,allStation);
//		pathStations.add(path);
//		
//		int i=0;
//		for(Path pathStation: pathStations)
//		{
//			if(pathStation==null)
//				break;
//			else
//				System.out.println("Paths is: "+pathStation.getStation().getStationName());
//			
//			i++;
//		}
//		
//		
//		System.out.println();
//		
//		int j=0;
//		for(Station connectStation: connectedStation)
//		{
//			if(connectStation==null)
//				break;
//			j++;
//		}
//		if(allStation!=null)
//			connectedStation.add(allStation.next);
//		
//		
//		//System.out.println("Root station in path "+ rootStation[pos].getStationName());
//		//System.out.println("Connected station in path at j = "+ j+" "+ connectedStation.get(j).getStationName());
//		for(Path st: pathStations)
//	{
//			Station temp = st.getStation();
//		while(temp!=null)
//		{
//			System.out.println("Other station in path "+ temp.getStationName());
//			temp = temp.next;
//		}
//	}
//		
//	}
//	
//	public int getPathPosition(Station newRootStation)
//	{
//		int i=0;
//		for(Station newRoot: rootStation)
//		{
//			if(newRoot.getStationCode().equals(newRootStation.getStationCode()))
//				return i;
//			i++;
//		}
//				
//		return -1;
//	}
//	
//	public Station[] getRootStation()
//	{
//		return this.rootStation;
//	}
//	
//	public List<Station> getConnectedStation()
//	{
//		return this.connectedStation;
//	}
//	
//	public void setRootStation(Train[] allTrains)
//	{	
//		this.rootStation = Utility.getUniqueStationList(allTrains);	
//		
//	}
//	
//	
//}
