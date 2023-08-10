package circulo_gui;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Square square = new Square();

		circle.makeVisible();
		triangle.makeVisible();
		square.makeVisible();

		int delay = 100;
		int interval = 200;

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				triangle.aleatoryMove();
				circle.aleatoryMove();
				square.aleatoryMove();
			}
		}, delay, interval);
	}
}
