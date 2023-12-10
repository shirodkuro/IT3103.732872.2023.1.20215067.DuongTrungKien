package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemOrdered = new ArrayList<Media>();
	
	public float totalCost() {
		float totalCost = 0;
		for (Media x : itemOrdered) {
			totalCost+=x.getCost();
		}
		return totalCost;
	}
	
	public void addMedia (Media media) {
		if(itemOrdered.size()<=MAX_NUMBERS_ORDERED) {
			itemOrdered.add(media);
			System.out.println("Successfully added.");
		} else {
			System.out.println("The cart is full.");
		}
	}
	
	public void removeMedia (Media media) {
		if(itemOrdered.contains(media)) {
			itemOrdered.remove(media);
			System.out.println("Successfully removed.");
		} else {
			System.out.println(media.getTitle() + " doesn't exist in the cart.");
		}
	}
	
	//Duong Trung Kien - 20215067
	//Ham in danh sach
//	public void print() {
//		float totalCost = 0.0f;
//		System.out.println("*****CART*****");
//		System.out.println("Ordered Items: ");
//		for (int i = 0; i < qtyOrdered; i++) {
//			DigitalVideoDisc dvd = itemsOrdered[i];
//			totalCost += dvd.getCost();
//			System.out.println((i+1) + ". " + dvd.toString());
//		}
//		System.out.println("Total cost: " + totalCost + "$");
//		System.out.println(("**************"));
//	}
//	//Duong Trung Kien - 20215067
//	//Ham tim theo ID
//	public void searchByID(int idsearch) {
//		boolean found = false; //bien kiem tra da tim duoc chua
//		for (int i = 0; i < qtyOrdered; i++) {
//			if(idsearch == itemsOrdered[i].getId()) {
//				System.out.println(itemsOrdered[i].toString());
//				found=true;//xet tung dia mot xem trung id khong
//				break;
//			}
//		}
//		if(!found) { //thong bao khong tim duoc
//			System.out.println("DVD with the ID " + idsearch + " doesn't exist in the cart.");
//		}
//	}
	//Duong Trung Kien - 20215067
	//Ham tim kiem theo ten
//	public void searchByTitle(String titlesearch) {
//		boolean found = false;
//		for (int i = 0; i < qtyOrdered; i++) {
//			if(itemsOrdered[i].isMatch(titlesearch)) {
//				System.out.println(itemsOrdered[i].toString());
//				found=true;//tim lan luot tung dia den khi nao tim duoc ten trung qua isMatch
//				break;
//			}
//		}
//		if(!found) {
//			System.out.println("DVD with the title " + titlesearch + " doesn't exist in the cart.");
//		}
//	}
	
}