import java.util.ArrayList;
import java.util.Date;

public abstract class User {
	/**
	 * An abstract class for user containing contact details and book order details 
	 */
	private String name = "";
	private String address = "";
	private String email = "";
	private String telNum = "00000000000";
	private Date regDate = new Date();
	private ArrayList<Order> openOrderList = new ArrayList<>();
	private ArrayList<Order> closedOrderList = new ArrayList<>();
	private ArrayList<String> messages = new ArrayList<>();

	//TODO: documentation
	public void sendNotification(String message){
		//send message as a notification to user's phone
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telNum
	 */
	public String getTelNum() {
		return telNum;
	}

	/**
	 * @param telNum the telNum to set
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	/**
	 * @return the openOrderList
	 */
	public ArrayList<Order> getOpenOrderList() {
		return openOrderList;
	}

	/**
	 * @param openOrderList the openOrderList to set
	 */
	public void setOpenOrderList(ArrayList<Order> openOrderList) {
		this.openOrderList = openOrderList;
	}

	/**
	 * @return the closedOrderList
	 */
	public ArrayList<Order> getClosedOrderList() {
		return closedOrderList;
	}

	/**
	 * @param closedOrderList the closedOrderList to set
	 */
	public void setClosedOrderList(ArrayList<Order> closedOrderList) {
		this.closedOrderList = closedOrderList;
	}
	
	
	/**
	 * @return the messages
	 */
	public ArrayList<String> getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}

	/**
	 * Sends a message to another user
	 * 
	 * @param user another user 
	 */
	public void sendMessage(User user, String message) {
		user.getMessages().add(message);
	}
}
