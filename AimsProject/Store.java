
public class Store {
	public static final int MAX = 999999;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX];
	private int itemcount;
	
	public void addDVD(DigitalVideoDisc dvd) {//them dia moi vao cua hang
		if(itemcount < MAX) {
			itemsInStore[itemcount] = dvd;
			itemcount ++;
			System.out.println("The disc has been added to the store.");
		}
	}
	
	public void removeDVD(int i) {
		if(i >= 0 && i < itemcount) {
			System.arraycopy(itemsInStore, i + 1, itemsInStore, i, itemcount - i - 1);//day cac phan tu phia sau len
			itemsInStore[itemcount - 1] = null;//xoa phan tu cuoi di
			itemcount--;
			System.out.println("The disc has been removed from the store.");
		}
		else {
			System.out.println("The disc doesn't exist in the store.");
		}
	}
	public void printList() {
		for (int i = 0; i < itemcount; i++) {
			System.out.println((i+1) + ". " + itemsInStore[i].getTitle());
		}//in danh sach cac dia da them
	}
}