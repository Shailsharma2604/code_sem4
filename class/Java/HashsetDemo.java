import java.util.*;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("AWS");
        hset.add("Biology");
        hset.add("Java");
        hset.add("Dbms");

        System.out.println("Contents of hash set: " + hset);

        // adding duplicate element
        hset.add("Dbms");
        System.out.println("Contents of hash set: " + hset);

        // remove element
        hset.remove("Java");
        System.out.println("After removing element: " + hset);

        // Iterate through the elements of HashSet
        Iterator<String> itr = hset.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        // for (String str : hset) {
        // System.out.println(str);
        // }

        System.out.println(hset.contains("Dbms"));

        // size of hashset
        System.out.println(hset.size());

        // clear hashSet
        hset.clear();
        System.out.println(hset);

    }

}

/*
 * first()
 * last()
 * subSet(start, end)
 * headSet(end)
 * tailSet(start)
 */