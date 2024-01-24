// No return type
// Self calling; Called at the time of object creation
// Name of constructor is same as class name




class Box__ {
    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
    }

    void setDim(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    void setDim(double val) {
        width = height = depth = val;
    }
}


class Demo {
    void test() {
        System.out.println("NO ARGS");
        System.out.println();
    }

    void test(int a) {
        System.out.println("Integer Value A: " + a);
        System.out.println();
    }

    void test(int a, int b) {
        System.out.println("Integer value A: " + a + "\n" + "Integer Value B: " + b);
        System.out.println();
    }

    void test(double a) {
        System.out.println( "Double value: " + a);
        System.out.println();
    }
}


public class method_overloading{
    public static void main(String[] args) {
        // Box__ box1 = new Box__();
        // box1.setDim(10, 11, 12);
        // System.out.println(box1.volume());

        // Box__ box2 = new Box__();
        // box2.setDim(6, 7, 8);
        // System.out.println(box2.volume());

        // Box__ cube = new Box__();
        // cube.setDim(3);
        // System.out.println(cube.volume());

        Demo dem = new Demo();
        dem.test();
        dem.test(1);
        dem.test(3,4);
        dem.test(6.78);
    }
}