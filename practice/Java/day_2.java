import java.util.Scanner;
public class day_2 {
    public static void main(String[] args) {
        // System.out.println("Enter Your Marks fomr subject 1 : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks from subject 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter Your Marks from subject 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter Your Marks from subject 3 : ");
        int c = sc.nextInt();
        System.out.println("Enter Your Marks from subject 4 : ");
        int d = sc.nextInt();
        System.out.println("Enter Your Marks from subject 5 : ");
        int e = sc.nextInt();
        int average_1= (a+b+c+d+e)/5;
        double average_2= (a+b+c+d+e)/5;
        float average_3= (a+b+c+d+e)/5;
        System.out.println("Your Marks average int = "+average_1);
        System.out.println("Your Marks average double = "+average_2);
        System.out.println("Your Marks average float = "+average_3
        );
    }
}
