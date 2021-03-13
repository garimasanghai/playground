package playground.week1.Example1;

public class MemoryModelTester2 {

	public static void main(String[] args)
	{
		int var1 = 52;
		SimpleLocation ucsd;
		ucsd = new SimpleLocation(32.9, -117.2);
		SimpleLocation lima = new SimpleLocation(-12.0, -77.0);
		lima.latitude = -12.4;
	
		System.out.println (lima.latitude);
		


	}

}
