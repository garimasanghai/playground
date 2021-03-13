package playground.week1.Example1;

public class SimpleLocation 
{
	public double latitude;
	public double longitude;

	public SimpleLocation(double lat, double lon)
	{
		this.latitude = lat;
		this.longitude = lon;
	}

	public double distance(SimpleLocation other) 
	{
		return this.latitude - other.latitude;
	}

}
