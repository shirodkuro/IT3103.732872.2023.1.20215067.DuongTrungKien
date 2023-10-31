
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		} else if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full.");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i< qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; j<qtyOrdered-1;j++) {
				itemsOrdered[j] = itemsOrdered[j+1];
			}
			qtyOrdered--;
			System.out.println("The disc has been removed.");
			return;
			}
		}
	System.out.println("Unable to find this disc.");
	}
	public float totalCost() {
		float cost = 0;
		for (int i = 0; i<qtyOrdered;i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
}