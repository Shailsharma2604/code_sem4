// No return type
// Self calling; Called at the time of object creation
// Name of constructor is same as class name




class Box_ {
    double width;
    double height;
    double depth;
    double volume(){
        return width*depth*height;
    }
    Box_(int w,int h,int d){
        System.out.println("const box");
        this.depth=d;
        this.height=h;
        this.width=w;
    }
    Box_(int val){
        width=height=depth=val;
    }
}



public class constDemo{
    public static void main(String[] args) {
        Box_ box1 = new Box_(10,11,12);
        System.out.println(box1.volume());
        Box_ box2 = new Box_(2);
        System.out.println(box2.volume());

    }
}