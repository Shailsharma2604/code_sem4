import java.util.*;

// Maintains the insertion order
// Tree set implements navigable set interface and extends abstract sorted set class

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("C");
        lhs.add("A");
        lhs.add("E");
        lhs.add("D");
        lhs.add("B");

        System.out.println(lhs);

        Iterator<String> itr=lhs.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
    }
}
