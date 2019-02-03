import java.util.ArrayList;

public class Seller extends User {
	/**
	 * A User class that can sell books 
	 */
	private ArrayList<Rating> ratings = new ArrayList<>();
	private ArrayList<Book> sellerList = new ArrayList<>();
	private Catalogue cat = new Catalogue();

	public ArrayList<Rating> getRatings() {
		return ratings;
	}

	public Catalogue getCat() {
		return cat;
	}

	/**
	 * @return the sellerList
	 */
	public ArrayList<Book> getSellerList() {
		return sellerList;
	}

	/**
	 * @param sellerList the sellerList to set
	 */
	public void setSellerList(ArrayList<Book> sellerList) {
		this.sellerList = sellerList;
	}
	
	/**
	 * Adds a book to the sellerList and the catalogue
	 * 
	 * @param book
	 */
	public void addBook(Book book) {
		sellerList.add(book);
		cat.addBook(book);
		book.setSeller(this);
	}
	
	/**
	 * Removes a book from the sellerList and the catalogue
	 * 
	 * @param book
	 */
	public void removeBook(Book book) {
		if (sellerList.contains(book)) {
			sellerList.remove(book);
			cat.removeBook(book);
		} else {
			System.out.println("This book is not in the sellerList");
		}
	}
	
	/**
	 * Updates the serviceCode with a rating out out 5
	 * 
	 * @param rating a rating out of 5
	 * @return the average rating
	 */
	public void addRating(Rating rating) {
		ratings.add(rating);
	}
	
	/**
	 * Returns the average rating of a seller
	 * 
	 * @return the average rating
	 */
	public float getAverageRating() {
		float sum = 0;
		for(Rating r: ratings) {
			sum += r.getRating();
		}
		
		float avg = sum / ratings.size();
		return avg;
	}
	
	//TODO: documentation
	public void orderStatusUpdate(Order order) {
		order.getBuyer().sendNotification(this.getName() + " has confirmed your order (" + order.getBook().getAuthor() + " - " + order.getBook().getTitle()+ ")");
	}
	
}
