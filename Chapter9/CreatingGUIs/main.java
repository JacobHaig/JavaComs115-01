package CreatingGUIs;

import java.awt.*;
import javax.swing.*;

public class main {

	public static void main(String[] args) throws InterruptedException {

		JFrame window = new JFrame();

		window.setTitle("HELLO!");
		window.setSize(new Dimension(500, 600));
		window.setVisible(true);

		double incr = 0;
		double scaleFactor = 0.5;

		while (true) {
			incr += 0.01;

			double sin = (scaleFactor) + Math.sin(incr) * (scaleFactor);
			double width = 1920 * ((scaleFactor) + Math.sin(incr) * (scaleFactor));

			window.setLocation((int) (1920 / 2 - sin * 1920 / 2), (int) (1080 / 2 - sin * 1080 / 2));
			window.setSize(new Dimension((int) (sin * 1920), (int) (sin * 1080)));

			Thread.sleep(20);
		}

	}

}
