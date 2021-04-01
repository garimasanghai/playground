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
			
			Toyota shivCar = new Toyota ();
			shivCar.setName ("Shiv2");
			shivCar.setRegNo (4291);
			
			Car kaminiCar = new Car ();
			kaminiCar.setName ("kamini2");
			kaminiCar.setRegNo (3281);
			
			
			
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
			//give me true by rolling up
			result = cherryToyota.windowRoll(false);
			System.out.println(result);
			//give me true by rolling down
			cherryToyota.carDiaganostics();
			
			//define and declare a Custom data type
			Toyota rohitToyota = new Toyota ();
			rohitToyota.setName("Rohit Car");
			rohitToyota.setRegNo(007);
			
			//RHS will get calculated first and then assigned to LHS
			result = rohitToyota.windowRoll(false);
			System.out.println(result);
			//give me false
			result = rohitToyota.windowRoll(true);
			System.out.println(result);
			//give me true by rolling up
			result = rohitToyota.windowRoll(true);
			System.out.println(result);
			//give me false
			result = rohitToyota.windowRoll(false);
			System.out.println(result);
			//give me true by rolling down 
			result = rohitToyota.windowRoll(true);
			System.out.println(result);
			//give me true by rolling up
			result = rohitToyota.windowRoll(false);
			System.out.println(result);
			//give me true by rolling down
			result = rohitToyota.windowRoll(true);
			System.out.println(result);
			//give me true by rolling up
			result = rohitToyota.windowRoll(true);
			System.out.println(result);
			//give me false
			result = rohitToyota.windowRoll(false);
			System.out.println(result);
			//give me true by rolling down
			result = rohitToyota.windowRoll(false);
			System.out.println(result);
			//give me true by rolling down
			rohitToyota.carDiaganostics();

			
			Toyota kaminiToyota = new Toyota ();
			kaminiToyota.setName("Kamini Car");
			kaminiToyota.setRegNo(007);
			
			
			result = kaminiToyota.windowRoll(false);
			System.out.println(result);
			//give me false
			result = kaminiToyota.windowRoll(true);
			System.out.println(result);
			//give me true by rolling up
			result = kaminiToyota.windowRoll(true);
			System.out.println(result);
			//give me false
			result = kaminiToyota.windowRoll(false);
			System.out.println(result);
			
			
			result = shivCar.windowRoll(true);
			System.out.println(result);
			//give me true by rolling up
			result = shivCar.windowRoll(true);
			System.out.println(result);
			//give me false
			result = shivCar.windowRoll(false);
			System.out.println(result);
			//give me true by rolling down 
			result = shivCar.windowRoll(true);
			System.out.println(result);
			
			
			//how many times did we press down
			//how many times did we press up
			//how many times did the glass move
	}

}
