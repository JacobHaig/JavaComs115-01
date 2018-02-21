/**
Jacob Haig
Chapter 6 
part 2 of 2
 */
package retail;

public class Item {
	private String description;
	private int unitsOnHand;
	private double price;

	Item(String descript, int items, double cost) {
		description = descript;
		unitsOnHand = items;
		price = cost;
	}
	
	Item(Item obj) {
		description = obj.description;
		unitsOnHand = obj.unitsOnHand;
		price = obj.price;
	}

	Item() {
		description = "";
		unitsOnHand = 0;
		price = 0;
	}

	public boolean equals(Item i) {
		if (description.equals(i.description) && i.unitsOnHand == unitsOnHand && i.price == price)
			return true;
		return false;
	}

	public Item copy() {	
		return new Item(description, unitsOnHand, price);	
	}

	public String getDescription() 	{	return description;	}
	public int getUnitsOnHand() 	{	return unitsOnHand;	}
	public double getPrice() 		{	return price;		}

	public void setDescription(String in) 	{	description = in;	}
	public void setUnitsOnHand(int in) 		{	unitsOnHand = in;	}
	public void setPrice(double in) 		{	price = in;			}
}