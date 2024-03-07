

// exception handling //

// static method ke andar instance method mai directly call nhi kar sakte //

// throw keyword is used to throw exception explicitly//
// we can throw eith er checked or unchecked exception in java //



////////////////////////////////////1////////////////////////////////////////

// public class sir {

//     public static void main(String[] args) {
//         throw new NullPointerException("error in code!");
//     }
// }


/////////////////////////////////////////2/////////////////////////////////////

// import java.util.Scanner;


// public class sir {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//        if(a<18){
//         throw new ArithmeticException("age less than 18!");
//        }
//        else{
//         System.out.println("ok");
//        }
//     }
// }


/////////////////////////////////////////or/////////////////////////////////////



// import java.util.*;
// public class ExceptionPropagation{
//     void check(int age){
//         if(age>18) System.out.println(age);
//         else{
//             throw new ArithmeticException("Age less than 18");
//             // throw new Exception("Age less than 18");
//         }
//     }
//     public static void main(String[] args) {
//         // throw new NullPointerException("Error in code");
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         Throw ob=new Throw();
//         ob.check(age);
//     }
 
// }



/////////////////////////////////////////3/////////////////////////////////////



// by defalut Exception are called 
// checked execution is not called in calling chain

/////////////////////////////////////////content/////////////////////////////////////


// public class ExceptionPropagation {
//     void m(){
//         // int a=3/0;
//         // throw new ArithmeticException("Code error");
//         throw new Exception("Code error");
//     }
//     void n(){
//         m();
//     }
//     void p(){
//         try{
//             n();
//         }
//         catch(ArithmeticException e){
//             System.out.println(e);
//         }
//     }
//     public static void main(String[] args) {
//         ExceptionPropagation ob=new ExceptionPropagation();
//         ob.p();
//     }
// }


/////////////////////////////////////////4/////////////////////////////////////



// throws keyword 
// java throws keyworld is used to declare a exception 
// it give info to programmer
// that there may occer an exception

// checked exception can be propagated using throws keyword
// if we are calling a method that declares an exception, then we must either caught or declare the exception




// public class ExceptionPropagation {
//         void m() throws exception{
//             int a=3/0;
//             throw new ArithmeticException("Code error");
//             throw new Exception("Code error");
//         }
//         void n(){
//             m();
//         }
//         void p(){
//             try{
//                 n();
//             }
//             catch(ArithmeticException e){
//                 System.out.println(e);
//             }
//         }
//         public static void main(String[] args) {
//             ExceptionPropagation ob=new ExceptionPropagation();
//             ob.p();
//         }
//     }


/////////////////////////////////////////5/////////////////////////////////////



// class ExceptionPropagation{
//     public static void main(String[] args){
//         throw new exception("error");
//     }
// }


/////////////////////////////////////////6/////////////////////////////////////

// exception handling with method overriding
// if super class method declare an exception then sub class overridden method can not be declare the checked exception but not unchecked exception
// if super class method declare an exception then sub class overridden method can declare subclass exception but not parent exception

// class animal{
//     void disp(){
//         System.out.println("animal");
//     }
// }

// class cat extends animal{
//     void disp() throws ArithmeticException{
//         System.out.println("cat");
//     }
// }

// public class ExceptionPropagation{
//     public static void main(String[] args) {
//         cat c= new cat();
//         c.disp();
//     }
// }


/////////////////////////////////////////7/////////////////////////////////////



// class animal{
//     void disp() throws Exception{
//         System.out.println("animal");
//     }
// }

// class cat extends animal{
//     void disp() throws NullPointerException{
//         System.out.println("cat");
//     }
// }

// public class ExceptionPropagation{
//     public static void main(String[] args) {
//         cat c= new cat();
//         c.disp();
//     }
// }


/////////////////////////////////////////8/////////////////////////////////////

// import java.io.IOError;

// class animal{
//     void disp() throws Exception{
//         System.out.println("animal");
//     }
// }

// class cat extends animal{
//     void disp() throws IOError{
//         System.out.println("cat");
//     }
// }

// public class ExceptionPropagation{
//     public static void main(String[] args) {
//         cat c= new cat();
//         c.disp();
//     }
// }


/////////////////////////////////////////9/////////////////////////////////////



// import java.io.IOException;

// class animal{
//     void disp() throws Exception{
//         System.out.println("animal");
//     }
// }

// class cat extends animal{
//     void disp() throws IOException{
//         System.out.println("cat");
//     }
// }

// public class ExceptionPropagation{
//     public static void main(String[] args) {
//         cat c = new cat();
//         c.disp();
//     }
// }



/////////////////////////////////////////10/////////////////////////////////////


// user define exception 
// to crete our own exception class must be inherited from per defined exception class

class Worng extends ArithmeticException{
    public Worng(String s){
        super(s);
    }
}
public class ExceptionPropagation{
    public static void main(String[] args) {
        int a=5;
        if(a<18){
            throw new Worng("kdkdkdkd");
        }
        else{
            System.out.println("ok");
        }
    }
}
