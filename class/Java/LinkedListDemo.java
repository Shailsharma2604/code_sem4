import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<String>();

        System.out.println("Size: " + a1.size());
        
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        a1.add("E");
        
        a1.add(1, "A2");
        
        System.out.println("Size: " + a1.size());
        System.out.println("Contents: " + a1);
        
        a1.remove("D");         // Removing using element
        a1.remove(0);           // Removing using index
        
        System.out.println("Size: " + a1.size());
        System.out.println("Contents: " + a1);
        
        a1.addFirst("Welcome");
        System.out.println("Size: " + a1.size());
        System.out.println("Contents: " + a1);
        
        a1.addLast("Last");
        System.out.println("Size: " + a1.size());
        System.out.println("Contents: " + a1);
        
        a1.removeFirst();
        a1.removeLast();
        System.out.println("Contents: " + a1);
        
        String value = a1.get(0);
        a1.set(0, value+" changed");
        System.out.println("Contents: " + a1);
    }
}