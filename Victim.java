import java.io.Serializable;
import java.io.IOException;

public class Victim implements Serializable {
  private int i = 1;
  private int j = 1;

  private void readObject(java.io.ObjectInputStream in)
     throws IOException, ClassNotFoundException
  {
     System.out.println("Victim got activated magically!");
  }
}
