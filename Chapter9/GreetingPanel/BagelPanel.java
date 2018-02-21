package GreetingPanel;

import javax.swing.JRadioButton;

public class BagelPanel {
	private Bagel whiteBagel;
	private Bagel wheatBagel;
	private double bagelCost;

	BagelPanel() {
		setLayout(new GridLayout(2, 1));
		whiteBagel= new JRadioButton("White",true);
		wheatBagel= new JRadioButton("Wheat");
		
		bg = new(whiteBagel);
		bg = new(whiteBagel);
	}

	public double getBagelCost() {
		double price = 0;

		if (whiteBagel /* .isSelected */)
			bagelCost = WHITE_BAGEL;
		else
			bagelCost = WHEAT_BAGEL;
		return bagelCost;
	}
}}
