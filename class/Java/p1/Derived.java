package p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("Derived class constructor");
        System.out.println("n = "+n);
        // System.out.println("n_pri = "+n_pri);  // Error 
        System.out.println("n_pro = "+n_pro);
        System.out.println("n_pub = "+n_pub);
    }
}
