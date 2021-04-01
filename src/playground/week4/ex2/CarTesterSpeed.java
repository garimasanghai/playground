package playground.week4.ex2;

public class CarTesterSpeed {

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
		
		
		
		cherryToyota.accelerator();
		cherryToyota.accelerator();
		cherryToyota.accelerator();
		System.out.println(cherryToyota.speed);
		cherryToyota.speedBreak();
		cherryToyota.speedBreak();
		System.out.println(cherryToyota.speed);
		cherryToyota.carDiaganostics();
		
		
		cherryToyota.accelerator(2);
		cherryToyota.accelerator(181);
		System.out.println(cherryToyota.speed);
		cherryToyota.accelerator(30);
		System.out.println(cherryToyota.speed);
		cherryToyota.speedBreak(30);
		cherryToyota.speedBreak(2);
		System.out.println(cherryToyota.speed);
		cherryToyota.carDiaganostics();
		
		
		
		
		
		
		//define and declare a primitive data type
		boolean result = false;
		
		//RHS will get calculated first and then assigned to LHS
		cherryToyota.windowRoll(false);
		result = cherryToyota.windowRoll(false);
		cherryToyota.getName();
		
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
	
	
	
	
	}

}
