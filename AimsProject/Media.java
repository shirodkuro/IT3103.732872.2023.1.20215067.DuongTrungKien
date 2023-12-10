package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {

	protected int id;
	protected String title;
	protected String category;
	protected float cost;
			
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public Media(String title) {
		super();
		this.title = title;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Media)) {
			return false;
		}
		Media media = (Media) o;
		return this.title.equals(o);
	}
	
	public static class MediaComparatorByCostTitle implements Comparator<Media>{
		public int compare(Media media1, Media media2) {
			int costComparision = Float.compare(media2.getCost(), media1.getCost());
			if(costComparision == 0) {
				return media1.getTitle().compareToIgnoreCase(media2.getTitle());
			}
			return costComparision;
		}
	}
	
	public static class MediaComparatorByTitleCost implements Comparator<Media>{
		public int compare (Media media1, Media media2) {
			int titleComparision = media1.getTitle().compareToIgnoreCase(media2.getTitle());
			if(titleComparision == 0) {
				return Float.compare(media2.getCost(), media1.getCost());
			}
			return titleComparision;
		}
	}
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST_COMPARATOR = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
}
