
import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("BufferOutputStreamfile.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i = 0;
            while((i = bin.read()) != -1) {
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
