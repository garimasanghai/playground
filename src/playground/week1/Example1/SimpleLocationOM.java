package playground.week1.Example1;

public class SimpleLocationOM

{
	public double latitude;
	public double longitude;

	public SimpleLocationOM() 
	{
		this.latitude = 32.9;
		this.longitude = -117.2;

	}

	public SimpleLocationOM(double lat, double lon) 
	{
		this.latitude = lat;
		this.longitude = lon;

	}

	public double distance(SimpleLocation other)
	
	{
		return this.latitude - other.latitude;
	}
	
	public double distance (double otherLat, double otherLon)
	{	
	return this.latitude - otherLat;
}
}







