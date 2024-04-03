import java.util.*;
import java.io.*;

public class MainDemo {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(new Student1(100, "Pratham", 21));
        arr.add(new Student1(101, "A", 20));
        arr.add(new Student1(102, "B", 19));
        arr.add(new Student1(103, "C", 18));


        System.out.println("Sorting by name");

        Collections.sort(arr, new NameComparator());


        Iterator itr = arr.iterator();
        while(itr.hasNext()) {
            Student1 s = (Student1)itr.next();
            System.out.println(s.rollno + " " + s.name + " " + s.age);
        }
    }
}