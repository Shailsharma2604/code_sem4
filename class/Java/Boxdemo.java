
class Box{
    double width;
    double height;
    double depth;
    double volume(){
        return width*height*depth;
    }
    void setDim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
}

public class Boxdemo {
    public static void main(String[] args) {
        // Box box1;
        // box1=new Box(); 
        Box box1 = new Box();
        // box1.width=45;
        // box1.height=45;
        // box1.depth=45;
        box1.setDim(45, 45, 45);
        double vol = box1.volume();
        System.out.println(vol);


        Box box2 = new Box();
        // box2.width=45;
        // box2.height=45;
        // box2.depth=45;
        box2.setDim(45, 45, 45);
        vol =box2.volume();
        System.out.println(vol);
        
    }
}
