
import java.io.*;

public class BufferReaderDemo3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        String name = "";
        while (true) {
            System.out.println("Enter data: ");
            name = bf.readLine();
            if (name.equals("stop")) {
                break; 
            }
            System.out.println("Data entered is: " + name);
        }

        bf.close();
        in.close();
    }
}