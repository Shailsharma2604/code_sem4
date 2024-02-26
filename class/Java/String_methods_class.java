public class String_methods_class {
    public static void main(String[] args) {
        String str="Hello Pratham";
        System.out.println(str.charAt(3));
        System.out.println();
        char[] arr=new char[8];
        str.getChars(0, 3, arr, 0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("\n");

        byte[] arr1=str.getBytes();
        for(int i:arr1){
            System.out.println(i+" ");
        }
        System.out.println("\n");

        char[] arr2=str.toCharArray();
        for(int i:arr2){
            System.out.println(i+" ");
        }
        String str1="Equals";
        String str2="equals";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println();
        System.out.println(str1.regionMatches(1, str2, 1, 3));

        

    }
}
