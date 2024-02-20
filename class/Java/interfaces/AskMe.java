package interfaces;
import java.util.*;


interface shareConstants{
    int NO=0;
    int YES=1;
    int MAYBE=2;
    int LATER=3;
    int SOON=4;
    int NEVER=5;
}

class Question implements shareConstants{
    Random rand=new Random();
    int ask(){
        int prob=(int)(100*rand.nextDouble());
        if(prob<30){
            return NO;
        }
        else if(prob<60){
            return YES;
        }
        else if(prob<75){
            return LATER;
        }
        else if(prob<90){
            return SOON;
        }
        else{
            return NEVER;
        }
    }
}

public class AskMe implements shareConstants{
    public static void main(String[] args) {
        switch (result) {
            case NO:
                System.out.println("NO");
            case NO:
                System.out.println("NO");
            case NO:
                System.out.println("NO");
            case NO:
                System.out.println("NO");

            default:
                break;
        }
    }
}
