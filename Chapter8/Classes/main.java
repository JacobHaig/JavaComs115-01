/**
Jacob Haig
Chapter 8
Multi Classes
 */

package Classes;

/* Main Class */
public class main {
	public static void main(String[] args) {
		CashRegister myStore = new CashRegister(new RetailItem("COOL Shirts", 23, 19.95), 7);
		System.out.println(myStore.getSubtotal());
	}
}

/* CashRegister Class */
class CashRegister {
	private RetailItem item;
	private int quantity;

	CashRegister(RetailItem item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return item.price * quantity;
	}
}

/* RetailItem Class */
class RetailItem {
	public String description;
	public double price;
	public int UnitsOnHand;

	RetailItem(String description, int UnitsOnHand, double price) {
		this.price = price;
		this.UnitsOnHand = UnitsOnHand;
		this.description = description;
	}
}