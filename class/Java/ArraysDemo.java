// public class ArraysDemo {
//     public static void main(String[] args) {
//         // int[] arr = new int[5];
//         int arr[] = new int[5];

//         for(int i=0; i<10; i++){
//             arr[i]=-4+i;
//             display(arr);
//         }
//         arr[0] = 10;
//         arr[1] = 20;
//         arr[2] = 30;
//         arr[3] = 40;
//         arr[4] = 50;
//         System.out.println("Put Elements :- " + arr);
//         // Firstentry
//         System.out.println("Firstentry :- " + arr[0]);
//         System.out.println("FirstKey :- " + arr[0]);
//         // Lastentry
//         System.out.println("Lastentry :- " + arr[4]);
//         System.out.println("LastKey :- " + arr[4]);
//         // ceilingEntry
//         System.out.println("ceilingEntry :- " + arr[0]);
//         System.out.println("ceilingKey :- " + arr[0]);
//         // floorEntry
//         System.out.println("floorEntry :- " + arr[1]);
//         System.out.println("floorKey :- " + arr[1]);
//         // lowerEntry
//         System.out.println("lowerEntry :- " + arr[1]);
//         System.out.println("lowerKey :- " + arr[1]);
//         // higherEntry
//         System.out.println("higherEntry :- " + arr[1]);
//         System.out.println("higherKey :- " + arr[1]);

//         // pollFirstEntry
//         int first = arr[0];
//         System.out.println("\npollFirstEntry" + first);
//         System.out.println("After pollFirstEntry" + arr);

//         // pollLastEntry
//         int last = arr[4];
//         System.out.println("\npollFirstLast" + last);
//         System.out.println("After pollFirstLast" + arr);

//         // forEach
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }

//         // defaultorder
//         // System.out.println(map.getOrDefault(map, null));

//         // // descendingMap
//         // System.out.println("DescendingMap :- "+map.descendingMap());
//         // System.out.println("NavigableKeySet :- "+map.navigableKeySet());
//         // System.out.println("DescendingKeySet :- "+map.descendingKeySet());
//         // System.out.println("NavigableKeySet :- "+map.navigableKeySet());
//         // System.out.println("SubMap :- "+map.subMap(10,true,40,true));
//         // System.out.println("HeadMap :-
//     }
// }


import java.util.*;
public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -4 * i;
        }
            System.out.print("original array : ");
            display(array);
            System.out.println();

            System.out.print("After sorting before filling : ");
            Arrays.sort(array);
            display(array);
            System.out.println();

            Arrays.fill(array, 2, 6, -1);
            System.out.print("After filling : ");
            display(array);
            Arrays.sort(array);
            System.out.println();

            System.out.print("After sorting after filling : ");
            Arrays.sort(array);
            display(array);
            System.out.println();

            // int index=Arrays.binarySearch(array, -16);                      //binary search
            // System.out.print("After binary search at - 16 : ");           //it is not there so it will show any valve
            // System.out.println(index);                                        

            int index1=Arrays.binarySearch(array, -12);
            System.out.print("After binary search at - 12 : ");
            System.out.println(index1);
            
    }

    static void display(int array[]) {
        for (int ele : array)
        System.out.print(ele + " ");
    }
}