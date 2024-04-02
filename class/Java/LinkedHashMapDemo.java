/*
syntax interface Map<K,V>
1 ClassCastExceptin - object incompatiable
2 NullPointerException  - null value
3 UnsupportedOperationException  - unsupport operation
4 IllegalArgumentException - wrong type for get/put operations

2basics operations:
1 get() to obtain the value
2put() to put the value

entryset() returns a set that contains the elements in map
keyset()  return a set of the keys.
values() returns a collection view of values contained in this map. The returned collection is created at the moment it

collections views
all that means by which  you can iterate over the collection of entries or key and values

SortedMap 
-ensures that collections are maintained in asc order.
-syntax interface SortedMap<K,V>
-exceptions{
    no such  element exception(optional)
    ClassCastExceptin 
    UnsupportedOperationException  - unsupport operation
    IllegalArgumentException - wrong type for get/put operations
}
to get submap
headMap(endKey inclusive), tailMap(startKey exclusive),subMap(startKey , endKey )
to get first and last key
firstKey(),lastKey()

navigable interface
extends SortedMap  interface and supports  additional methods : lowerEntry(), higherEntry(), floorEntry(), ceilingEntry().

HashMap Class 
extends  AbstractMap class implements Map Interface & Cloneable interface
use hash table to stote the map
excutoion time to get() and put() remains constant
syntax class HashMap<K,V>

constructers-
HashMap();                     //creates an empty map with default capacity (16) & load factor (0.75). 
HashMap(int initialCapacity);//creats an empty map with given initial capacity & defalut load factor (0.75).
HashMap( int initialCapacity, float loadFactor );   //creates an empty map with given initial capacity & load factor .
HashMap(Map<?    extends K,? extends V> m);     //creates a new map with contents of the specified map.

// Mapping names to the account balance
*/
import  java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> hmap= new HashMap<>();
        //to put elements
        hmap.put("John",2345.98);
        hmap.put("oh",85.98);
        hmap.put("David",1234.99);
        hmap.put("vid",14.99);
        System.out.println("\nPrinting the original Hashmap:"+hmap);
        System.out.println(hmap.size());
        hmap.merge("John",1000.0, Double::sum);   //add john's balance by 1000$ 
        System.out.println(hmap.get("John"));

        // to get a set of enteries
        Set <Map.Entry<String, Double>> entryset = hmap.entrySet();
        // System.out.println(entryset);
        for(Map.Entry<String,Double> en : entryset){
            System.out.println(en.getKey()+"\t"+en.getValue());
     }}}



//     public static void main(String [] args) {
//         LinkedHashMapDemo<Integer, String> lhm = new LinkedHashMapDemo<>();
//         lhm.put(1,"A");
//         lhm.put(2,"B");
//         lhm.put(3,"C");
//         lhm.put(4,"D");
//         //remove(key) method is used to remove element by key from linkedhashmap
//         // lhm.remove(3);
//         System.out.println("LinkedHashMap: "+lhm);
//         //containskey
//         System.out.println(lhm.containsKey(3));
//         System.out.println(lhm.containsValue("A"));
//         // System.out.println(lhm.clear());   //this method is used to clear all the mappings in this linked hashmap.
//         System.out.println(lhm.values());
//         System.out.println(lhm.keySet());
//         System.out.println(lhm.hashCode() + "\n");
//         // clear
//         lhm.clear();
//         System.out.println("After Clearing:\n" + lhm);
    
// }}