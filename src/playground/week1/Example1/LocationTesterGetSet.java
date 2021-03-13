package playground.week1.Example1;

public class LocationTesterGetSet 
{

	public static void main(String[] args)
	{
		System.out.println(args[0] + "  " + args[1]);
		SimpleLocationGetSet ucsd = new SimpleLocationGetSet (32.9, -117.8);
		SimpleLocationGetSet lima = new SimpleLocationGetSet (54.5, 38.5);
		
		
		
		System.out.println(lima.getLatitude());
	}

	}
 