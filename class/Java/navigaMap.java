import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.*;

public class navigaMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String>map=new TreeMap<>();
        //put elements
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");
        System.out.println("Put Elements :- "+map);
        // Firstentry
        System.out.println("Firstentry :- "+map.firstEntry());
        System.out.println("FirstKey :- "+map.firstKey());
        // Lastentry
        System.out.println("Lastentry :- "+map.lastEntry());
        System.out.println("LastKey :- "+map.lastKey());
        // ceilingEntry
        System.out.println("ceilingEntry :- "+map.ceilingEntry(6));
        System.out.println("ceilingKey :- "+map.ceilingKey(6));
        // floorEntry
        System.out.println("floorEntry :- "+map.floorEntry(20));
        System.out.println("floorKey :- "+map.floorKey(20));
        // lowerEntry
        System.out.println("lowerEntry :- "+map.lowerEntry(20));
        System.out.println("lowerKey :- "+map.lowerKey(20));
        // higherEntry
        System.out.println("higherEntry :- "+map.higherEntry(20));
        System.out.println("higherKey :- "+map.higherKey(20));

        // pollFirstEntry
        Map.Entry<Integer,String>first=map.pollFirstEntry();
        System.out.println("\npollFirstEntry"+first);
        System.out.println("After pollFirstEntry"+map);

        // pollLastEntry
        Map.Entry<Integer,String>last=map.pollFirstEntry();
        System.out.println("\npollFirstLast"+last);
        System.out.println("After pollFirstLast"+map);

        // forEach
        map.forEach((k,v)->System.out.println(k+" "+v));

        // defaultorder
        // System.out.println(map.getOrDefault(map, null));


        // // descendingMap
        // System.out.println("DescendingMap :- "+map.descendingMap());
        // System.out.println("NavigableKeySet :- "+map.navigableKeySet());
        // System.out.println("DescendingKeySet :- "+map.descendingKeySet());
        // System.out.println("NavigableKeySet :- "+map.navigableKeySet());
        // System.out.println("SubMap :- "+map.subMap(10,true,40,true));
        // System.out.println("HeadMap :- "+map.headMap(30,true));
        // System.out.println("TailMap :- "+map.tailMap(30,true));

        // replace all
        map.replaceAll((k,v)->"X");
        System.out.println("After replaceAll :- "+map);

    }
}
