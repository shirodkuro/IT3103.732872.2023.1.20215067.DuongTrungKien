package hust.soict.dsai.aims.media;

public class Disc extends Media{
	
	protected int length;
	protected String director;
	private static int nbDisc = 0;
	

	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Disc(String title, String category, String director, float cost, int length) {
		super(title, category,cost);
		super.setId(++nbDisc);
		this.length = length;
		this.director = director;
	}

}
