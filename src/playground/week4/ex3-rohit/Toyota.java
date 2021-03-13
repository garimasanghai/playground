package playground.week4.ex2;

import playground.week4.ex1.Car;

public class Toyota extends Car {
	public boolean window;
	
	public boolean windowRoll (boolean button)
	{
		if (window == true && button == true)
		{
			return false;
		}
		
		if (window == false && button == false)
		{
			return false;
		}
		if (window == false && button == true)
		{
			System.out.println ("Window Roll Up");
			window = true;
			return true;
		}
		if (window == true && button == false)
		{
			System.out.println ("Window Roll Down");
			window = false;
			return true;
		}
		else {
			return false;
		}
	
	
	
	
	
	}
}
	
	
