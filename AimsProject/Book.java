package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private static int nbBook = 0;
	private List<String> authors = new ArrayList<String>();
	
	

	public Book(String title, String category, float cost, String author) {
		super(title, category, cost);
		super.setId(++nbBook);
		addAuthor(author);
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("The author " + authorName + " has been added.");
		}
		else {
			System.out.println("This author already exists in the database");
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("The author " + authorName + " has been removed.");
		}
		else {
			System.out.println("This author doesn't exist in the database.");
		}
	}

	@Override
	public String toString() {
		String authorList = "";
		for(String x : authors) {
			authorList = authorList + x + "\n";
		}
		return "*******Book Detail********\n" +
				"ID: " + this.id + "\n" +
				"Title: " + this.title + "\n" +
				"Category: " + this.category+ "\n" +
				"Cost: " + this.cost + "$\n" +
				"Authors:\n" + authorList;
	}

	
}


