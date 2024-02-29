public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer bf = new StringBuffer("HELLO");
        System.out.println(bf);
        bf.insert(5," WORLD!");
        System.out.println("Use of insert  method : "+bf);
        //use of length and acpacity
        System.out.println("\nLength: "+bf.length()+"\tCapacity:"+bf.capacity());
        //use of ensure  capacity
        bf.ensureCapacity(80);
        System.out.println(bf.capacity());
     
    }
}