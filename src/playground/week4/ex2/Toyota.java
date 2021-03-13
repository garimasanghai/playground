package playground.week4.ex2;

import playground.week4.ex2.Car;

public class Toyota extends Car {
	public boolean window;
	public int movement;
	public int up;
	public int down;

	public boolean windowRoll(boolean button) {
		if (button == true) {
			up = up + 1;
		}
		if (button == false) {
			down = down + 1;
		}

		if (window == true && button == true) {
			System.out.println(this.getName() + " cannot operate as window is already up");
			return false;
		}
		if (window == false && button == false) {
			System.out.println(this.getName() + " cannot operate as window is already down");
			return false;
		}
		if (window == false && button == true) {
			movement = movement + 1;
			System.out.println(this.getName() + " Window Roll Up");
			window = true;
			return true;
		}
		if (window == true && button == false) {
			movement = movement + 1;
			System.out.println(this.getName() + " Window Roll Down");
			window = false;
			return true;
		}

		else {
			return false;
		}
	}

	public void accelerator() {
		speed = speed + 15;
	}

	public void speedBreak() {
		speed = speed - 15;
	}

	public void accelerator(int otherSpeed) {
		if (speed + otherSpeed >= 0 && speed + otherSpeed <= 180)

		{
			speed = speed + otherSpeed;

		} else {
			System.out.println("Operation Failure");
		}

	}

	public void speedBreak(int otherSpeed) {
		if (speed - otherSpeed >= 0 && speed - otherSpeed <= 180)

		{
			speed = speed - otherSpeed;

		} else {
			System.out.println("Operation Failure");
		}
	}

	public void carDiaganostics() {
		System.out.println(this.getName() + " movement " + this.movement);
		System.out.println(this.getName() + " up " + this.up);
		System.out.println(this.getName() + " down " + this.down);
		System.out.println(this.getName() + " speed is " + this.speed);
	}

}
