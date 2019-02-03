public class Buyer extends User {
	/**
	 * A subclass of User that can buy books from Sellers
	 */
	private String ccDetails;
	
	/**
	 * Constructor for Buyer
	 */
	public Buyer() {
		ccDetails = "0000 0000 0000 0000";
	}

	/**
	 * @return the ccDetails
	 */
	public String getCcDetails() {
		return ccDetails;
	}

	/**
	 * @param ccDetails the ccDetails to set
	 */
	public void setCcDetails(String ccDetails) {
		this.ccDetails = ccDetails;
	}
	
	/**
	 * Creates a new open order between the buyer and seller of a book
	 * 
	 *@param book the Book being bought by the Buyer from a Seller 
	 */
	public void purchase(Book book) {
		Order newOrder = new Order(book, this, book.getSeller());
		this.getOpenOrderList().add(newOrder);
		book.getSeller().getOpenOrderList().add(newOrder);
	}
	
	/**
	 * After buying a Book from a Seller, a Buyer can give the Seller a rating 
	 * that will be updated to the sellers serviceCode
	 * 
	 * @param seller a seller user who sells a Book
	 * @param rating a rating out of 5
	 */
	public void rateSeller(Seller seller, int rating) {
		seller.updateServiceCode(rating);
	}

}
