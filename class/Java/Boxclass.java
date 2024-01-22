// public class JAVA_Class_CLASSES {
//     public static void main(String[] args) {
//         System.out.println("hello");
//     }
// }
public class Boxclass{
    double width;
    double height;
    double depth;
}
// public class vol
class Main{
    public static void main(String[] args) {
        Boxclass b1 = new Boxclass();
        double vol;
        b1.width=10;
        b1.depth=9;
        b1.height=11;
        vol=b1.depth*b1.height*b1.width;
        System.out.println("The volume of box is :"+vol);
    }
}
