import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Iterator allows iteration in forward direction
// ListIterator allows iteration in backward direction

public class lterableDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();

        System.out.println("Size: " + a1.size());
        
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        a1.add("E");
        
        a1.add(1, "A2");

        System.out.println("Array: " + a1);

        Iterator<String> itr = a1.iterator();
        while(itr.hasNext()) {                          // hasNext() returns true or false 
            System.out.print(itr.next() + " ");         // next() func provides next element
        }
        System.out.println();

        ArrayList<Integer> i1 = new ArrayList<Integer>();

        i1.add(1);
        i1.add(2);
        i1.add(3);
        i1.add(4);
        i1.add(5);

        // Initially the cursor is in the beginning of the list, so we have to first traverse to the last

        ListIterator<Integer> itr2 = i1.listIterator();
        while(itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }
        System.out.println();
        while(itr2.hasPrevious()) {
            System.out.print(itr2.previous() + " ");
        }
    }
}