
class staticExample{
    static int a =30;
    static int b;
    static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("x = "+a);
        System.out.println("x = "+b);
    }
    static{
        System.out.println("static block initialized");
        b = a+2;
    }
// }

// public class StaticDemo {
    public static void main(String[] args) {
        meth(40);
        System.out.println("inside Main");
            
    }
}
