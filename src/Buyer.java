import java.util.ArrayList;

public class Buyer extends User {
    /**
     * A subclass of User that can buy books from Sellers
     */
    private String ccDetails;

    /**
     * Constructor for Buyer
     */
    public Buyer() {
        ccDetails = ""; // Credit Card details are transferred and stored using RSA encryption !!!
    }

    /**
     * Creates a new open order between the buyer and seller of a book
     *
     * @param books the Book being bought by the Buyer from a Seller
     */
    public void purchase(ArrayList<Book> books) {
        Order newOrder = new Order(books, this, books.get(0).getSeller());
        this.getOpenOrderList().add(newOrder);
        books.get(0).getSeller().getOpenOrderList().add(newOrder);
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
     * After buying a Book from a Seller, a Buyer can give the Seller a rating
     * that will be updated to the sellers serviceCode
     *
     * @param seller a seller user who sells a Book
     * @param rating a rating out of 5
     */
    public void rateSeller(Seller seller, Rating rating) {
        seller.addRating(rating);
    }

}
