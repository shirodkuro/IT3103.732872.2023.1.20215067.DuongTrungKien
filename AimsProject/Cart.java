
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
	//Duong Trung Kien - 20215067
	//Them danh sach dia vao gio
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int i = 1; //bien dem so luong dia trong danh sach
		while(qtyOrdered< MAX_NUMBERS_ORDERED && i<=dvdList.length) {
				itemsOrdered[qtyOrdered]= dvdList[i-1];	
				System.out.println("The " + i + " th disc has been added.");
				qtyOrdered ++;
				i ++;
		} //cho vao gio hang den khi nao day thi thoi
		if(qtyOrdered>= MAX_NUMBERS_ORDERED)
				System.out.println("The cart is almost full. ");
		}

	public void addDigitalVideoDisc1(DigitalVideoDisc... dvds) {
		for (DigitalVideoDisc dvd : dvds) {
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {//kiem tra so luong da day chua
				itemsOrdered[qtyOrdered] = dvd;
				qtyOrdered ++;
				System.out.println("The disc has been added.");
			}
			else {
				System.out.println("The cart is almost full.");
				break;
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered<MAX_NUMBERS_ORDERED-1) {
			qtyOrdered +=2 ;
			itemsOrdered[qtyOrdered]=dvd1;
			itemsOrdered[qtyOrdered]=dvd2;
			System.out.println("Both discs have been added. ");

		}
		else {
			System.out.println("The cart is almost full. ");
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
	//Duong Trung Kien - 20215067
	//Ham in danh sach
	public void print() {
		float totalCost = 0.0f;
		System.out.println("*****CART*****");
		System.out.println("Ordered Items: ");
		for (int i = 0; i < qtyOrdered; i++) {
			DigitalVideoDisc dvd = itemsOrdered[i];
			totalCost += dvd.getCost();
			System.out.println((i+1) + ". " + dvd.toString());
		}
		System.out.println("Total cost: " + totalCost + "$");
		System.out.println(("**************"));
	}
	//Duong Trung Kien - 20215067
	//Ham tim theo ID
	public void searchByID(int idsearch) {
		boolean found = false; //bien kiem tra da tim duoc chua
		for (int i = 0; i < qtyOrdered; i++) {
			if(idsearch == itemsOrdered[i].getId()) {
				System.out.println(itemsOrdered[i].toString());
				found=true;//xet tung dia mot xem trung id khong
				break;
			}
		}
		if(!found) { //thong bao khong tim duoc
			System.out.println("DVD with the ID " + idsearch + " doesn't exist in the cart.");
		}
	}
	//Duong Trung Kien - 20215067
	//Ham tim kiem theo ten
	public void searchByTitle(String titlesearch) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].isMatch(titlesearch)) {
				System.out.println(itemsOrdered[i].toString());
				found=true;//tim lan luot tung dia den khi nao tim duoc ten trung qua isMatch
				break;
			}
		}
		if(!found) {
			System.out.println("DVD with the title " + titlesearch + " doesn't exist in the cart.");
		}
	}
	
}