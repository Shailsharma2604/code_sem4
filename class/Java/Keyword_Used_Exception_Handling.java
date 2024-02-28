public class Keyword_Used_Exception_Handling {
    public static void main(String[] args) {
        // try {
        //     int result = 1 / 0;
        // } catch (NumberFormatException e) {
        //     e.printStackTrace();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // System.out.println("bye");
        // try{
        //     int a[]=new int[5];
        //     a[5]=3/0;
        // }
        // catch(ArrayIndexOutOfBoundsException E){
        //     System.out.println(E);
        // }
        // catch(ArithmeticException A){
        //     System.out.println(A);
        // }
        try
        {
            int a=5/0;
        }
        finally
        {
            System.out.println("Hello");
        }
        System.out.println("Bye");
    }
}