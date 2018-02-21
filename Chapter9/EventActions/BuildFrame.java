package EventActions;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BuildFrame extends JFrame {

	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JButton calcButton;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 100;

	BuildFrame() {
		this.setTitle("Register");
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setBackground(Color.BLUE);

		buildPanel();
		add(panel);
		setVisible(true);
	}

	public void buildPanel() {
		messageLabel = new JLabel("Enter a distance in kilometers: ");
		kiloTextField = new JTextField(10);
		calcButton = new JButton("Calculate");

		panel = new JPanel();

		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);
	}
}
