package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	
	private static int nbCompactDisc = 0;
	private String artist;
	private ArrayList<Track> tracks;
	
	public String getArtist() {
		return artist;
	}

	public CompactDisc(String title, String category, String director, float cost, int length, String artist) {
		super(title, category, director, cost, 0);
		this.artist = artist;
		
	}

	public void addTrack(Track trackName) {
		if(!tracks.contains(trackName)) {
			tracks.add(trackName);
			System.out.println("The track " + trackName + " has been added.");
			setLength(getLength()+trackName.getLength());
		}
		else {
			System.out.println("This track already exists in the database");
		}
	}
	
	public void removeTrack(Track trackName) {
		if(tracks.contains(trackName)) {
			tracks.remove(trackName);
			System.out.println("The track " + trackName + " has been removed.");
			setLength(getLength()-trackName.getLength());
		}
		else {
			System.out.println("This track doesn't exist in the database.");
		}
	}
	
	public int getLength() {
		int tracksLength = 0;
		for(Track x : tracks) {
			tracksLength+=x.getLength();
		}
		return tracksLength;
	}
	
	public String toString() {
		return "CD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getCost() + " $ - " + getLength() + " minutes - " + getArtist();
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		for(Track x : tracks) {
			x.play();
		}
	}
}
