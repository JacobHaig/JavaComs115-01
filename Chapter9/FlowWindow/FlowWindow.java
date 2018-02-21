package FlowWindow;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowWindow extends JFrame {
	private final int WINDOW_HIDTH = 200;
	private final int WINDOW_HEIGHT = 105; // Window height

	public FlowWindow() {
		setTitle("Flow Layout");
		setSize(WINDOW_HIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add a FlowLayout manager to the content
		setLayout(new FlowLayout());

		// Create three buttons.
		JButton buttonl = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");

		// Add the three buttons to the content
		add(buttonl);
		add(button2);
		add(button3);

		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowWindow();
	}

}
