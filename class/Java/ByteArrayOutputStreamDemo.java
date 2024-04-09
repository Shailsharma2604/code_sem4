
import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception{
       FileOutputStream f1= new FileOutputStream("ByteFileOutputfile1.txt");
       FileOutputStream f2= new FileOutputStream("ByteFileOutputfile2.txt");
       ByteArrayOutputStream f3 = new ByteArrayOutputStream();
       f3.write(65);
       f3.writeTo(f2);
       f3.writeTo(f1);



       f3.flush();
    }
}
