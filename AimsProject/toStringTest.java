package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class toStringTest {

		public static void main(String[] args) {
	
		List<Media> mediae = new ArrayList<Media>();
		CompactDisc cd = new CompactDisc("Test CD", "CD", "Duong Trung Kien", 1.23F, 0, "Duong Trung Kien");
		DigitalVideoDisc dvd = new DigitalVideoDisc("Test DVD", "DVD", "Duong Trung Kien", 456, 1.23F);
		Book book = new Book("Test Book", "Book", 1.23F, "Duong Trung Kien");
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(book);
		for(Media x: mediae) {
			System.out.println(x.toString());
		}
	}

}
