package playground.week4.ex2;

import playground.week4.ex1.Car;

public class Amb extends Car {
	public void sideWindow(boolean open) {
		if (open == true) {
			System.out.println("openSidewindow");
		} else {
			System.out.println("closeSidewindow");
		}
	}
}