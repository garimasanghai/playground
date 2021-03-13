package playground.week1.Example1;

public class LocationTesterGS {

	public static void main(String[] args) 
	{
	
		SimpleLocationGS ucsd = new SimpleLocationGS (32.9, -117.8);
		SimpleLocationGS lima = new SimpleLocationGS (54.5, 38.5);
		
		lima.latitude = -12.4;
		
		{System.out.println("ucsd.distance(lima)");}
	}

}
