import java.util.ArrayList;
import java.util.Date;

public class Order {
	/**
	 * 
	 */
	private ArrayList<Book> books;
	private Buyer buyer;
	private Seller seller;
	private Date date;
	private boolean confirmed;
	
	/**
	 * 
	 * @param books
	 * @param buyer
	 * @param seller
	 */
	public Order(ArrayList<Book> books, Buyer buyer, Seller seller) {
		this.books = books;
		this.buyer = buyer;
		this.seller = seller;
	}

	/**
	 * @return the books
	 */
	public ArrayList<Book> getBooks() {
		return books;
	}

	/**
	 * @param books the book to set
	 */
	public void setBook(ArrayList<Book> books) {
		this.books = books;
	}

	/**
	 * @return the buyer
	 */
	public Buyer getBuyer() {
		return buyer;
	}

	/**
	 * @param buyer the buyer to set
	 */
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	/**
	 * @return the seller
	 */
	public Seller getSeller() {
		return seller;
	}

	/**
	 * @param seller the seller to set
	 */
	public void setSeller(Seller seller) {
		this.seller = seller;
	}

}
