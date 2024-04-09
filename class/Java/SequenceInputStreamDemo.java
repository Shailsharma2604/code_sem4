
import java.io.*;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        try {
            FileInputStream f1 = new FileInputStream("FileOutputfile1.txt");
            FileInputStream f2 = new FileInputStream("FileOutputfile2.txt");
            FileInputStream f3 = new FileInputStream("FileOutputfile3.txt");
            FileInputStream f4 = new FileInputStream("BufferOutputStreamfile.txt");
            SequenceInputStream sis = new SequenceInputStream(f1, f2);
            SequenceInputStream sis2 = new SequenceInputStream(sis, f3);
            SequenceInputStream sis3 = new SequenceInputStream(sis2, f4);
            while ((c = sis3.read()) != -1) {
                System.out.print((char)c);
            }
            sis3.close();
            f1.close();
            f2.close();
            f3.close();
            f4.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
