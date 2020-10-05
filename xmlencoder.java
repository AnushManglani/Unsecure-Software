// import UserSettings;
import java.io.*;
import java.beans.*;
public class xmlencoder
{


    public static void main(String args[]) throws IOException
    {
        UserSettings obj = new UserSettings();
        obj.setFieldOne(1);
        serializeToXML(obj);
    }

    private static void serializeToXML (UserSettings settings) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("settings.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
                public void exceptionThrown(Exception e) {
                    System.out.println("Exception! :"+e.toString());
                }
        });
        encoder.writeObject(settings);
        encoder.close();
        fos.close();
    }

}
