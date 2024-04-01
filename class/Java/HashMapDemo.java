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

        for(Map.Entry<String,Double>entry : hSet) {
            System.out.println(entry.getKey()+":");
            System.out.println(entry.getValue());
        }

        // deposite INR 1000 to john's account
        double acc=hMap.get("john");
        System.out.println(acc);

        hMap.put("john", acc + 1000);
        System.out.println("Updated Hash Map :-"+hMap);
        System.out.println("John's new balanace :-");
        System.out.println(hMap.get("John"));
    }
}
