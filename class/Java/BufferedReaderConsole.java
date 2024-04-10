import java.io.*;
public class BufferedReaderConsole {
    public static void main(String[] args) throws Exception {
        InputStreamReader input =new InputStreamReader(System.in);
        BufferedReader bred= new BufferedReader(input);
        System.out.println("Enter the number of lines you want to read:");
        int n = Integer.parseInt(bred.readLine());
        
        FileWriter fw = new FileWriter("BufferedReaderConsoleOutput.txt");
        PrintWriter pw = new PrintWriter(fw);
        for (int i=0 ;i <n ;i++) 
        {
            System.out.println("Enter a line : ");
            String s = bred.readLine();
            pw.println(s); //writes into the file
            
        }
        pw.close();
        fw.close();

        
    }
}