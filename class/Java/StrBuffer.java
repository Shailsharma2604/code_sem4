
// String Buffer()
// String Buffer(int size)
// String Buffer(String str)
// String Buffer(charSquence chars)

// Default constructor 

// StringBuffer str=new StringBuffer()   capacity=21
// StringBuffer str=new StringBuffer(50)   capacity=50
// StringBuffer str=new StringBuffer("Hello class")   capacity=21


// 1. length() and capacity()
// 2. ensureCapacity()
// 3. setLength()
// 4. charAt() and setCharAt()
// 5. getchars()
// 6. append
// 7. insert()
// 8. reverse()
// 9. delete() and deleteCharAt()
// 10. replace()
// 11. subString()

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
        System.out.println("\nAfter using ensure Capacity Method:\nLength: "+bf.length()+"\tCapacity:"+bf.capacity());
        //use of stlength
        bf.setLength(80);
        System.out.println("\nAfter using setLength, Length: "+bf.length());
        //use of charat and setcharat
        System.out.println(bf.charAt(3));
        bf.setCharAt(3,'z');
        System.out.println("After using setCharAt, string is :"+bf);
        //use of getchars()
            char c[]=new char[6];
            bf.getChars(1,7,c,0);
            System.out.print("Substring from index 1 to 7 are : "+ new String(c));
            //use of append
            bf.append(" Java Programming.");
            System.out.println("\nAfter appending the string : "+bf);
            //use of reverse
            bf.reverse();
            System.out.println("\nReversed string is : "+bf);
     
    }
}