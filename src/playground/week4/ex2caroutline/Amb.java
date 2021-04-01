package playground.week4.ex2caroutline;

import playground.week4.ex2caroutline.Car;

public class Amb extends Car {
	public void sideWindow(boolean open) {
		if (open == true) {
			System.out.println("openSidewindow");
		} else {
			System.out.println("closeSidewindow");
		}
	}
}