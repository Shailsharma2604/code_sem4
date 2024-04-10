
import java.io.*;

public class charArrayReaderDemo {
    public static void main(String[] args) throws IOException{
      char[] names={'A','B','C','D','E','F','G','H','I','J'};
        CharArrayReader reader = new CharArrayReader(names);
        
        int i=0;
        while ((i=reader.read()) != -1){
            System.out.println((char)i+" ");
        }
    }
}
