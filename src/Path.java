
public class Path {
	
	Train connectedTrain;
	Station station;
	Path nextPath;
	
	Path()
	{
		nextPath= null;
	}
	
	Path(Train connectedTrain, Station staion)
	{	
		this();
		this.connectedTrain = connectedTrain;
		this.station = staion;
	}
	
	public Train getConnectedTrain()
	{
		return connectedTrain;
	}
	
	public Station getStation()
	{
		return station;
	}
	public Path getNextPath()
	{
		return this.nextPath;
	}
	
	public void setNextPath(Path nextPath)
	{
		this.nextPath = nextPath;
	}
	
	public void setTrain(Train connectedTrain)
	{
		this.connectedTrain = connectedTrain;
	}
	
	public void setStation(Station station)
	{
		this.station = station;
	}

}
