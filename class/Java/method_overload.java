class Base1 {
    int i, j;

    // Base1() {
        
    // }
    Base1(int a, int b) {
        i = a;
        j = b;
    }

    void display() {
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}

class subclass1 extends Base1 {
    int k;

    subclass1(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    
    void display() {
        super.display();
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
public class method_overload {
    public static void main(String[] args) {
        subclass1 obj = new subclass1(4, 5, 6);
        obj.display();
    }
}