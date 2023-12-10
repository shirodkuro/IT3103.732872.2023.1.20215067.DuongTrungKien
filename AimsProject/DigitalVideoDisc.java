package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

	private static int nbDigitalVideoDiscs = 0;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public DigitalVideoDisc(String title, String category, String director, int length,float cost ) {
		super(title, category, director, cost, length);
		super.setId(++nbDigitalVideoDiscs);
	}
	public boolean isMatch(String title) {
		return getTitle().equals(title);
	}
	public String toString() {
		return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + " minutes - " + getCost() + " $";
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
