import java.io.*;
import java.beans.*;

public class xmldecoder
{
    public static void main(String args[]) throws IOException
    {
        deserializeFromXML();
        
    }

    private static UserSettings deserializeFromXML() throws IOException {
        FileInputStream fis = new FileInputStream("settings.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        UserSettings decodedSettings = (UserSettings) decoder.readObject();
        decoder.close();
        fis.close();
        return decodedSettings;
    }
    
    
}