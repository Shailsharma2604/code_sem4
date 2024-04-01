import java.util.*;

// Mapping names to the account balance

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> hMap=new HashMap<>();
        hMap.put("john",3454.64);
        hMap.put("smith",8974.23);
        hMap.put("clark",2134.23);
        hMap.put("hero",7418.21);
        System.out.println(hMap);

        // to get a set of the entries

        Set<Map.Entry<String,Double>>hSet=hMap.entrySet();

        // display the set
        System.out.println("Set :-"+hSet);
        
    }
}
