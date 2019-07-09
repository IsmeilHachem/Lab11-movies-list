
public class Movie {
	
	private String title;
	private String category;
	
	public Movie() {}
	
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String toString () {
		return "Movie(Title: " + title + " " + "Category: " + category + ")";
	}
	
	
	

}
