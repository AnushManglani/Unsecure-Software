import java.io.IOException;

public class SerialVictim {

        public static void main(String args[]) {
                Victim object = new Victim();
                try {
                        Serialization_Util.serialization("victim.bin", object);
                } catch (IOException exp) {
                        exp.printStackTrace();
                }
        }
}
