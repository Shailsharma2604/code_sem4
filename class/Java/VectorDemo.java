
import java.util.*;



public class VectorDemo {
    public static void main(String[] args) {
        // Vector<String> v= new Vector<>(); it is for default capacity
        // Vector<String> v= new Vector<>();
        // Vector<String> v= new Vector<>(3,2); it is to take your own default capacity
        Vector<String> v= new Vector<>(3,2);
        
        // System.out.println("Capacity of vector :- "+v.capacity()); defalut it will be 10
        System.out.println("Capacity of vector :- "+v.capacity());

        // v.add("A");
        // v.add("B");
        // v.add("C");

        v.addElement("A");
        v.addElement("B");
        v.addElement("C");
        System.out.println("Elements of Vector v :- "+v);
        System.out.println("Capacity of vector :- "+v.capacity());
        v.addElement("D");
        v.addElement("E");
        v.addElement("F");
        System.out.println("Elements of Vector v :- "+v);
        System.out.println("Capacity of vector :- "+v.capacity());
        v.addElement("G");
        v.addElement("H");
        v.addElement("i");
        System.out.println("Elements of Vector v :- "+v);
        System.out.println("Capacity of vector :- "+v.capacity());
        v.addElement("k");
        v.addElement("L");
        v.addElement("M");
        System.out.println("Elements of Vector v :- "+v);
        System.out.println("Capacity of vector :- "+v.capacity());


    }
}
