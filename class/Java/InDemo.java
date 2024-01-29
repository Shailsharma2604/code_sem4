
class A {
    int i;
    int j;

    void showij() {
        System.out.println("i : " + i);
        System.out.println("j : " + j);
    }
}

class B extends A{
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k : "+(i+j+k));
    }
}
public class InDemo {
    public static void main(String[] args) {
        A superobj = new A();
        B subobj = new B();

        superobj.i = 10;
        superobj.j = 12;
        superobj.showij();

        subobj.i=7;
        subobj.j=8;
        subobj.k=9;
        subobj.showij();
        subobj.showk();
        subobj.sum();
    }
}