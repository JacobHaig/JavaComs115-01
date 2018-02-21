package JoesRepair;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class nonRoutinePanel extends JPanel {
	public final double HOURLY_COST = 65.00;

	private JLabel partsLabel;
	private JTextField partsAmount;

	private JLabel hoursWorkedLabel;
	private JTextField hoursWorked;

	nonRoutinePanel() {
		partsLabel = new JLabel("Amount for parts");
		hoursWorkedLabel = new JLabel("Amount of hours worked");

		setBorder(BorderFactory.createTitledBorder("maintenance"));

		add(partsLabel);
		add(partsAmount);
		add(hoursWorkedLabel);
		add(hoursWorked);
	}

	public double getNonRoutineCost() {
		double nonRoutineCost = 0.0;
		double hours = Double.parseDouble(hoursWorked.getText());
		double cost = Double.parseDouble(partsAmount.getText());

		nonRoutineCost = HOURLY_COST * hours + cost;
		return nonRoutineCost;
	}

}
