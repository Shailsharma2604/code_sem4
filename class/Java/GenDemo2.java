
class Gen2<T,V> {
    T ob1;
    V ob2;

    Gen2(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    // Show types of ob1 and ob2

    void Showtype() {
        System.out.println("Type of ob1 is: "+ ob1.getClass().getName());
        System.out.println("Type of ob2 is: "+ ob2.getClass().getName());
    }

    T getData1() {
        return ob1;
    }

    V getData2() {
        return ob2;
    }

}

public class GenDemo2 {
    public static void main(String[] args) {
        Gen2<Integer, String> trgobj = new Gen2<Integer, String>(88, "Generics");

        trgobj.Showtype();

        int v = trgobj.getData1();
        System.out.println("value: "+v);

        String str = trgobj.getData2();
        System.out.println("value: "+str);
    }
}
