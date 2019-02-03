public class Order {
	/**
	 * 
	 */
	private Book book;
	private Buyer buyer;
	private Seller seller;
	
	/**
	 * 
	 * @param book
	 * @param buyer
	 * @param seller
	 */
	public Order(Book book, Buyer buyer, Seller seller) {
		this.book = book;
		this.buyer = buyer;
		this.seller = seller;
	}

	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
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
