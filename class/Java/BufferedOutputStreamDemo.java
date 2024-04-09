
////////////////////////////// BufferedOutputStreamDemo //////////////////////////////

// import java.io.*;

// public class BufferedOutputStreamDemo {
//     public static void main(String[] args) {
//         String source = "This is my files"
//         + "This is my files"
//         + "This is my files";

//         byte buf[] = source.getBytes();
//         try {
//             BufferedOutputStream f0 = new BufferedOutputStream(new FileOutputStream("BufferedOutputfile1.txt"));
//             BufferedOutputStream f1 = new BufferedOutputStream(new FileOutputStream("BufferedOutputfile2.txt"));
//             BufferedOutputStream f2 = new BufferedOutputStream(new FileOutputStream("BufferedOutputfile3.txt"));

//             for (int i = 0; i < buf.length; i += 2) {
//                 f0.write(buf[i]);
//             }

//             f1.write(buf);

//             f2.write(buf, buf.length - buf.length/4, buf.length/4);
            
//             f0.close();
//             f1.close();
//             f2.close();
//         } catch (IOException e) {
//             System.out.println("An I/O Error Occurred");
//         }
//     }
// }

////////////////////////////// BufferedOutputStreamDemo //////////////////////////////

import java.io.*;

// Works similar as file output stream but it is used to write data to buffer ; It is faster than file output stream

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file."
        + "\n" 
        + "This is a second line of text inside the file."
        + "\n" 
        + "This is a third line of text inside the file.";

        byte[] barr = data.getBytes();

        try (FileOutputStream f = new FileOutputStream("BufferOutputStreamfile.txt");
            BufferedOutputStream b = new BufferedOutputStream(f);) {
            b.write(barr);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}