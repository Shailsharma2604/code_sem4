class GenM{
    static <T extends Comparable<T> , v extends T> boolean  isIn(T x,v[] y){
        for (int i = 0; i < y.length ; i++) {
            if (x.equals(y[i])) return true;
        }return false;
    }
}
// public class GenMeth {
//     public static void main(String[] args) {
//         Integer nums[]= {1,2,3,4};
//         if(GenM.isIn(2,nums)){
//             System.out.println(2+" is in the array");
//         }
//         Strin strs[]={"one","two","three"};
//     }
// }
public class GenMeth {
    public static void main(String[] args) {
        Integer nums[]= {1,2,3,4};
        if(GenM.isIn(2,nums)){
            System.out.println(2+" is in the array");
        }
        String strs[]={"one","two","three"};
        if(GenM.isIn("two",strs)){
            System.out.println("two is in the array");
        }
    }
}