import java.io.IOException;

public class DeSerialMain {

        public static void main(String args[]) {
                CustomerInfo object;

                try {
                        object = (CustomerInfo)Serialization_Util.deSerialization("customerInfo.bin");
			System.out.println("Customer = " + object.getCustomer());
			System.out.println("ContactName = " + object.getContactName());
                } catch (Exception exp) {
                        exp.printStackTrace();
                }
        }
}
