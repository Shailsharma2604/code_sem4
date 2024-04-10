import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("FileReaderDemoOutput.txt");
        BufferedReader buf = new BufferedReader(reader);
        
        int i=0;
        while ((i=buf.read()) != -1) {
            System.out.print((char)i);
        }
    }
}
