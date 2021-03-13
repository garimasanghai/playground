package playground.week1.Example1;

public class SimpleLocationGetSet {
	private double latitude;
	private double longitude;

	public SimpleLocationGetSet(double lat, double lon) {
		this.latitude = lat;
		this.longitude = lon;

	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setlatitude(double lat)

	{
		if (lat < -180 || lat > 180) {
			System.out.println("Illegal value for latitude");
		}

		else {
			this.latitude = lat;
		}
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double lon) {
		if (lon < -180 || lon > 180) 
		{
			System.out.println("Illegal value for Longitude");
		} else {
			this.longitude = lon;
		}
	}
}
