package playground.week4.ex1;

public class CarTester {

	public static void main(String[] args) 
	{
		Car rohit1car = new Car ();
		rohit1car.setName ("Rohit1");
		rohit1car.setRegNo (4221);
		
		Toyota cherrytoyota = new Toyota ();
		cherrytoyota.setName ("Cherry1");
		cherrytoyota.setRegNo (2301);
		System.out.println("trying to call the window roll with true");
		cherrytoyota.windowRoll (true);
		System.out.println("trying to call the window roll with false");
		cherrytoyota.windowRoll (false);
		
		
		Amb cherryamb = new Amb ();
		cherryamb.setName ("Cherry2");
		cherryamb.setRegNo(3241);
		System.out.println("trying to call the window side with true");
		cherryamb.sideWindow (true);
		System.out.println("trying to call the window side with false");
		cherryamb.sideWindow (false);

	
		
	}
}
