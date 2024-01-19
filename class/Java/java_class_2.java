import java.util.Random;
import java.util.Scanner;
public class java_class_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand =new Random();
        int mynum=rand.nextInt(100)+1;
        int k=1;
        // int mynum=rand.nextInt(100)+100; //for range 100-200
        // int mynum=(int)(Math.random()*100);

        int usernum =0;
        do{
            k++;
            System.out.println("Guess a number between 0 and 99:");
            usernum=sc.nextInt();
            if (usernum == mynum){
                System.out.println("Congratulations! You are right!");
                break;
        }
        else if(usernum>mynum){
            System.out.println("Your number is too high.");
        }
        else if(usernum<mynum){
            System.out.println("Your number is too low.");
        }
            
        }while (usernum!=mynum && k<5); 
        if(usernum!=mynum && k==5){
            System.out.println("You have used up all your attempts, the correct answer was "+ mynum);
        }
        
        
}
}