package playground.week4.ex2;

import playground.week4.ex2.Car;
import playground.week4.ex2.Toyota;

public class ClassTester1 
{

	public static void main(String[] args) 
	{
			//define and declare a Custom data type
			Car rohitCar = new Car ();
			rohitCar.setName ("Rohit1");
			rohitCar.setRegNo (4221);
			
			//define and declare a Custom data type
			Toyota cherryToyota = new Toyota ();
			cherryToyota.setName ("Cherry1");
			cherryToyota.setRegNo (2301);
			
			//define and declare a primitive data type
			boolean result = false;
			
			//RHS will get calculated first and then assigned to LHS
			result = cherryToyota.windowRoll(false);
			System.out.println(result);
			//give me false
			result = cherryToyota.windowRoll(true);
			System.out.println(result);
			//give me true by rolling up
			result = cherryToyota.windowRoll(true);
			System.out.println(result);
			//give me false
			result = cherryToyota.windowRoll(false);
			System.out.println(result);
			//give me true by rolling down 
			result = cherryToyota.windowRoll(true);
			System.out.println(result);
			//give me true
	}

}
