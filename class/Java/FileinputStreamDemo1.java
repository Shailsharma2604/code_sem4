
import java.io.*;

public class FileinputStreamDemo1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("SteamClasses.txt");
            int i = fin.read();
            System.out.println((char)i);
            byte[] b = new byte[100];
            int bytesRead = fin.read(b);
            for (byte c : b) {
                System.out.print((char)c);
            }
            
            System.out.println("bytesRead :- "+bytesRead);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
