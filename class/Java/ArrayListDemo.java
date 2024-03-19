
// Collection interface methods

// 1. boolean add(E obj)
// 2. boolean addall(Collection<? extends e>c)
// 3. void clear()
// 4. boolean Contains(Object obj)
// 5. boolean ContainsAll(Collection<?> c)
// 6. boolean equals(Object obj)
// 7. int hashcode()
// 8. boolean isEmpty()
// 9. Iterator<E> Iterator()
// 10. boolean remove(Object obj)
// 11. boolean removeAll(Collection<?> c)
// 12. default boolean remofeIf(Predicate<? extends E> predicate)
// 13. boolean retainAll(Collection<?> c)
// 14. int size()
// 15. Object[] toArray()
// 16. <T> T[] toArray(T arraay[])



// List interface methods

// 1. interface list<E>

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        // ArrayList<String> al=new ArrayList<String>();

        System.out.println("Size of al : -" +al.size());

        // al.add("A");
        // al.add("B");
        // al.add("C");
        // al.add("D");
        // al.add("E");
        // al.add(1,"A2");

        // System.out.println("After adding elements size of al :- "+al.size());
        // System.out.println("Contant of al :-"+al);

        // al.remove("D");
        // al.remove(2);

        // System.out.println("After deleting elements size of al :- "+al.size());
        // System.out.println("Content of al :- "+al);


        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println("Content of al :- "+al);

        Integer ia[]=new Integer[al.size()];
        ia=al.toArray(ia);

        int sum=0;
        for(int i:ia)
            sum+=i;
            
        System.out.println("Content of array :- "+sum);
        
        System.out.println("Content of array :- "+ia);
    }
}
