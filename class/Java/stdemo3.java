public class stdemo3 {
    public static void main(String[] args) {

        char[] chars = { 'a', 'b', 'c', 'd', 'e' };
        String s = new String(chars);
        System.out.println(s);

        char[] chars1 = { 65, 66, 67, 68, 69, 70, 71 };
        String s1 = new String(chars1);
        System.out.println(s1);

        char[] chars3 = { 'a', 'b', 'c', 'd', 'e' };
        String s3 = new String(chars3, 1, 3);
        System.out.println(s3);

    }
}
