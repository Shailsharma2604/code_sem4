
//------------------CHARACTER EXTRACTION--------------------------

//1- charAt(int index)
//2-getChars(int sourcestart,intsource_end,char target[],int targetstart)--to get multiple characters
//3-getBytes -asciivalue of chars
//4-toCharArray() -return array of characters unlike getchars
//5-regionMatches  ==>> s1.regionMatches(int startindex,string s2, int s2startindex,int num chars)--> match subparts of two strings 

public class charaqcter_extraction {

    public static void main(String[] args) {

        // ***************charAt***************//

        // char ch;
        // String str = "hello";
        // ch = str.charAt(4);
        // System.out.println(ch);

        // *********************getChars****************//

        // String s = "example of getchars function";
        // int start = 10;// included
        // int end = 20; // not included
        // char arr[] = new char[end - start];
        // s.getChars(start, end, arr, 0);
        // System.out.println(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }

        // *************getBytes*******************/

        // String s = "example of getchars function";
        // byte[] arr = s.getBytes();

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // *****************toCharArray()*********** /

        // String s = "example of getchars function";

        // char[] arr = s.toCharArray();
        // System.out.println(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }

        // *******************Equals()and equalsIgnoreCase************************

        // String s1 = "hello my name is";
        // String s2 = "HELLO my name is";
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equalsIgnoreCase(s2));

        // ***************region matches() ***********************/

        // String s1 = "hello world";
        // String s2 = "world";

        // boolean result = s1.regionMatches(6, s2, 0, s2.length());
        // System.out.println(result);

        // for (int i = 0; i < s1.length(); i++)

        // {
        // boolean result = s1.regionMatches(i, s2, 0, s2.length());
        // System.out.println(i + " " + result);
        // }

        // *********************startsWith()**************************************** */

        // String s = "javasstarts";
        // System.out.println(s.startsWith("javas"));
        // System.out.println(s.endsWith("ts"));

        // ************************************************************ */

        // String s = "hello guys";
        // String m = new String("hello guys");
        // // String m="Hello Guys";

        // boolean r = (s == m);
        // System.out.println(s.equalsIgnoreCase(m));
        // System.out.println(s.equals(m));
        // System.out.println(r);

        // ********************************compareTo()*********************************
        // */

        // [if we want to match the string saccording to dictionary in chronological
        // order]

        // String s1 = "hello guys";
        // String s2 = "HELLO world";
        // System.out.println(s1.compareTo(s2));

        String[] str = { "Now", "abstarct", "abc", "class", "static" };
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }

            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

    }

}
