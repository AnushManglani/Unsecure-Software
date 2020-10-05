import java.io.IOException;

public class SerialMain {

	public static void main(String args[]) {
		CustomerInfo object = new CustomerInfo();
		object.setCustomer("UMD");
		object.setContactName("George");

		try {
			Serialization_Util.serialization("customerInfo.bin", object);
		} catch (IOException exp) {
			exp.printStackTrace();
		}
	}
}
