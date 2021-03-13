package playground.week4.ex2;

public class Car {
	private String name;
	private double regNo;
	public int speed;

	public String getName() {
		return name;
	}

	public double getRegNo() {
		return regNo;
	}

	public void drive() {
	}

	public void accelerator() 
	{
		speed = speed + 10;
	}

	public void speedbreak() 
	{
		speed = speed - 10;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public void setRegNo(double regNo) {
		this.regNo = regNo;
	}

}
