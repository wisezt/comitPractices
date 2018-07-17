package july11;

public class Song {
	
	
	// create title
	String title;
	
	// create author
	String author;
	
	// constructor takes the parameter title and author
	public Song(String title, String author) {
		this.title = title;
		this.author = author;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString(){
		String result = "Titile:" + title + ", author: " + author + "." ;
		return result;
		
	}
		
	
}
