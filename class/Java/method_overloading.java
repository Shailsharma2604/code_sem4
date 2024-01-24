
class box{
    double width;
    double height;
    double depth;

    double volume(){
        return width*depth*height;
    }
    void setDim(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        Box box1=new Box();
        box1.setDim(45, 45, 45);
        double vol = box1.volume();
        System.out.println();
    }
}
