//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//
//public class CopyOfFindTrains {
//	
//	String sourceCode;
//	String destinationCode;
//	String sourceName;
//	String destinationName;
//	
//	Station sourceStation;
//	Station destinationStation;
//	static int position;
// Map map = new Map();
//	
//	CopyOfFindTrains() {
//		
//	}
//	
//	CopyOfFindTrains(String sourceName, String sourceCode, String destinationName, String destinationCode)
//	{
//		this.destinationCode = destinationCode;
//		this.destinationName = destinationName;
//		this.sourceCode = sourceCode;
//		this.sourceName = sourceName;
//	}
//	
//	private Train[] findDirectTrains(DummyTrainCreator dummyTrainCreator)
//	{
//		Train allTrains[] = dummyTrainCreator.getAllTrains();
//		Train directTrains[] = new Train[Constants.Trains];
//		int trainCount=0;
//		
//		for(Train train : allTrains)
//		{
//			Station allStation[] = train.getAllStation();
//				
//				int stationCount=0;	
//				
//				for(Station stationSource: allStation)
//				{	
//					if(stationSource.getStationCode().equals(sourceCode))
//					{	
//					
//						
//						for(int j=stationCount+1;j<allStation.length ;j++)
//						{	
//							
//							if(allStation[j].getStationCode().equals(destinationCode))
//								{
//									
//									directTrains[trainCount]= train;
//									
//								}
//						}
//					}
//					
//					stationCount++;
//				}
//			trainCount++;	
//		}
//		
//		
//		return directTrains;
//		
//	}
//	
//	public void findConnectedStationBySource(Train[] allTrains, List<Station> connectedStation, Station destinationStation)
//	{
//		int trainCount=0, i;
//	for(i=0;i<connectedStation.size();i++)	
//		{
//		for(Train train : allTrains)
//		{
//			Station allStation[] = train.getAllStation();
//				
//				int stationCount=0;	
//				
//				for(Station station: allStation)
//				{	
//					//for(Station connectStation : connectedStation)
//					if(connectedStation.get(position)!=null)
//						if(station.getStationCode().equals(connectedStation.get(position).getStationCode()))
//						{	
//							while(station.next!=null)
//							{
//								connectedStation.add(station);
//								if(station!=null)
//								{	
//									map.addPath(train, station, station.next);
//									if(station.next.getStationCode().equals(destinationStation.getStationCode()))
//										System.out.println("Route found!!");
//									station=station.next;
//								}
//									
//							}
//							
//						
//							position++;
//							
//						}
//						
//					stationCount++;
//				}
//				
//			trainCount++;	
//		}
//		
//	}
//}
//	
//	public boolean findIndirectTrains(DummyTrainCreator dummyTrainCreator, Station sourceStation, Station destinationStation)
//	{
//		//Add the starting stations to Path.station
//		
//		Train allTrains[] = dummyTrainCreator.getAllTrains();
//		map.setRootStation(allTrains);
//		Station rootStation[] = map.getRootStation();	
//		List<Station> connectedStation = map.getConnectedStation();
//		connectedStation.add(sourceStation);
//
//		
//		
//		for(Station station: rootStation)
//			System.out.println("Root station is: "+station.getStationName());
//		
//		System.out.println("Connected station is: "+connectedStation.get(0).getStationName());
//		findConnectedStationBySource(allTrains, connectedStation, destinationStation);
//		
//		map.printMap();
//		//map.displayAllRootStation();
//		
//		return false;
//	}
//	
//	public void setSourceStation()
//	{
//		this.sourceStation = sourceStation;
//	}
//	static public Train[] setRoute(DummyTrainCreator dummyTrainCreator, String sourceLabel, String destinationLabel)
//	{	
//		String sourceCode = Utility.parseCode(sourceLabel);
//		String destinationCode = Utility.parseCode(destinationLabel);
//		
//		String sourceName = Utility.parseName(sourceLabel);
//		String destinationName = Utility.parseName(destinationLabel);
//		Station sourceStation = Utility.getStationBySouceCode(dummyTrainCreator.getAllTrains(), sourceCode);
//		Station destinationStation = Utility.getStationBySouceCode(dummyTrainCreator.getAllTrains(), destinationCode);
//		
//		System.out.println("The source code and station is "+ sourceStation.getStationCode() + " And "+ sourceStation.getStationName());
//		System.out.println("SC:"+sourceCode+" SN: "+sourceName+" DC: " +destinationCode+" DN: " +destinationName);
//		
//		CopyOfFindTrains findTrain = new CopyOfFindTrains(sourceName, sourceCode, destinationName, destinationCode);
//		findTrain.findIndirectTrains(dummyTrainCreator,sourceStation,destinationStation);
//		
//		return findTrain.findDirectTrains(dummyTrainCreator);
//		
//	}
//	
//	
//	
//	
//
//}
