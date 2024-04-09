
import java.io.*;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        byte[] b = {35, 36, 37, 38};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int i=0;
        while ((i=bis.read()) != -1) {
            char c = (char)i;
            System.out.println("ASCII value of Character is: " + i + "; Special Character is: " + c);
            
        }
    }
}
