
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // By default the capacity of Queue is 11
        // PriorityQueue<String> q=new PriorityQueue<>();
        PriorityQueue<String> q=new PriorityQueue<String>();
        // q.add("java");
        q.offer("java");
        q.add("DBMS");
        q.add("ML");
        System.out.println("Content of priority :- "+q);
        System.out.println("Content of element :- "+q.element());
        System.out.println("Content of peek :- "+q.peek());
        System.out.println("Content of Queue :- "+q);
        System.out.println("Content of remove :- "+q.remove());
        System.out.println("Content of Queue :- "+q);
        System.out.println("Content of poll :- "+q.poll());
        System.out.println("Content of Queue :- "+q);
    }
}
