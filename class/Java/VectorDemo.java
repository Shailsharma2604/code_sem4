
import java.util.*;



public class VectorDemo {
    public static void main(String[] args) {

        ////// it for the Capacity //////

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


        ////// To find the elements //////

        // use of if else

        System.out.println("use of if else");

        if(v.contains("A"))
            System.out.println("A is in vector");
        else
            System.out.println("A is not in vector");

        // use of for each

        System.out.println("use of for each");

        for(String str:v){
            System.out.println(str);
        }

        // use of Iterator

        System.out.println("use of Iterator");

        Iterator<String> itr=v.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());


        // use of Enumeration
        
        System.out.println("use of Enumeration");

        Enumeration<String> vnum = v.elements();
        while(vnum.hasMoreElements());
            System.out.println(vnum.nextElement());
    }
}
