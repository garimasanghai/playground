package playground.week1.Example1;

public class LocationTester {

	public static void main(String[] args)
	{
		
		SimpleLocation singapore = new SimpleLocation (31.9, -118.8);
		SimpleLocation uscd = new SimpleLocation (32.9, -117.8);
		SimpleLocation lima = new SimpleLocation (54.5, 38.5);
		System.out.println(lima.distance(lima));
	}

}
