// public class stdemo2 {
//     public static void main(String[] args) {
//         String st1 = "first st";
//         String st2 = "second st";
//         String st3 = st1;

//         System.out.println("Length of st1: " + st1.length());
//         System.out.println("Char at index 3: " + st1.charAt(3));

//         if (st1.equals(st2))
//             System.out.println("st1==st2");
//         else
//             System.out.println("st1 !==st2");

//         if (st1.equals(st3))
//             System.out.println("st1==st3");
//         else
//             System.out.println("st1 !==st3");

//     }
// }

public class stdemo2 {
    public static void main(String[] args) {
        String st[] = { "one", "two", "three", "four", "five", "six", "seven", "eight" };

        for (int i = 0; i < st.length; i++) {
            System.out.println("st[" + i + "] = " + st[i]);
        }

    }
}
