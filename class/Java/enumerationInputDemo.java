
import java.util.*;
import java.io.*;


public class enumerationInputDemo {
    public static void main(String[] args) {
        int c;
        try {
            FileInputStream f1 = new FileInputStream("FileOutputfile1.txt");
            FileInputStream f2 = new FileInputStream("FileOutputfile2.txt");
            FileInputStream f3 = new FileInputStream("FileOutputfile3.txt");
            FileInputStream f4 = new FileInputStream("BufferOutputStreamfile.txt");
            Enumeration<FileInputStream> e = new Enumeration<FileInputStream>() {
                private int count = 0;
                private final FileInputStream[] fis = {f1, f2, f3, f4};
                public boolean hasMoreElements() {
                    return count < fis.length;
                }
                public FileInputStream nextElement() {
                    return fis[count++];
                }
            };
            SequenceInputStream sis = new SequenceInputStream(e);
            while ((c = sis.read()) != -1) {
                System.out.print((char)c);
            }
            sis.close();
            f1.close();
            f2.close();
            f3.close();
            f4.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
