import java.util.ArrayList;

public class Catalogue {
	private ArrayList<Book> books = new ArrayList<>();
	
	public Catalogue() {
		
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}

	//TODO: documentation
	public Book findBook(String searchText){
		for(Book b : books){
			if(b.getTitle().toLowerCase().contains(searchText.toLowerCase()) ||
				b.getAuthor().toLowerCase().contains(searchText.toLowerCase())){
				return b;
			}
		}
		return null;
	}
}
