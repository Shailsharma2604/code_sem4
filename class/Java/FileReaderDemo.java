
import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception{
        File fin = new File("FileReaderDemoInput.txt");
        FileReader reader = new FileReader(fin);
        
        char chars[]=new char[(int)fin.length()]; // Creating an array of characters
        // Reading data from the file
        reader.read(chars);
        // writing the data to the another file
        FileWriter writer = new FileWriter("FileReaderDemoOutput.txt");
        writer.write(chars);
        writer.flush();
        writer.close();
        reader.close();
        
    }
}
