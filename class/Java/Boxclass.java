public class Boxclass{
    double width;
    double height;
    double depth;
    double volume(){
        // System.out.println("The volume of box is : "+width*depth*height);
        return width*depth*height;
    }
    void setDim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
}
// public class vol
class Main{
    public static void main(String[] args) {
        Boxclass b1 = new Boxclass();
        // double vol;
        // b1.width=10;
        // b1.depth=9;
        // b1.height=11;
        b1.setDim(1, 5, 8);
        double vol=b1.volume();
        System.out.println("The Volume of box 1 : "+vol);



        Boxclass b2 = new Boxclass();
        // double vol;
        // b2.width=1;
        // b2.depth=9;
        // b2.height=1151;
        b2.setDim(7, 54, 54);
        vol=b2.volume();
        System.out.println("The Volume of box 2 : "+vol);
        
    }
}
