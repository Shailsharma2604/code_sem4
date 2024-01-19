import java.util.Scanner;
public class JAVA_Class_1 {
    public static void main(String[] args) {
        System.out.print("enter the number");
        // int n = args.length;
        // for (int i=0;i<=10;i++){
        //     n+=i;
        //     System.out.println(n);
        // }
        // System.out.println(n);
        Scanner x= new Scanner(System.in);
        int i =x.nextInt();
        // int i=1;
        int sum=0;
        while (i!=0) {
            sum+=i;
            System.out.println(sum);
            i =x.nextInt();
        }
        System.out.println(sum);
        x.close();

    }
}
