import java.io.Serializable;

public class CustomerInfo implements Serializable {

	private String customer;
	private String contactName;
	
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
}
