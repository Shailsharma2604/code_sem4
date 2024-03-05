
//stringtokinezer class is used break string into tokens.
// astringtokenizer object initally maintains a current position 
//inrder strtoken class we need to specify an input string and string that contais delivator
//delivators are characters that separate tokens
//defailt delivatures are white spaces ,newline and tabs
//

// import java.util.StringTokenizer;

// public class Stokenizer {
//     static String str="title=Java: The Complete"+
//     "Refernce;author=Schildt;Publisher=The McGraw Hill;"+
//     "Copyright=2014";
//     public static void main(String[] args) {
//         StringTokenizer st=new StringTokenizer(str,"=;");
//         while (st.hasMoreTokens()) {
//             String key = st.nextToken();
//             String value = st.nextToken();
//             System.out.println(key+"\t"+value);
//         }
//     }
// }


// import java.util.StringTokenizer;

// public class Stokenizer {
//     static String str="title=Java: The Complete"+
//     "Refernce;author=Schildt;Publisher=The McGraw Hill;"+
//     "Copyright=2014";
//     public static void main(String[] args) {
//         StringTokenizer st=new StringTokenizer(str,"=;");
//         while (st.hasMoreTokens()) {
//             String key = st.nextToken();
//             // String value = st.nextToken();
//             System.out.println(key+"\t");
//         }
//     }
// }

// import java.util.StringTokenizer;

// public class Stokenizer {
//     static String str="title=Java: The Complete"+
//     "Refernce;author=Schildt;Publisher=The McGraw Hill;"+
//     "Copyright=2014";
//     public static void main(String[] args) {
//         StringTokenizer st=new StringTokenizer(str,"=;");
//         while (st.hasMoreTokens()) {
//             // String key = st.nextToken();
//             String value = st.nextToken();
//             System.out.println("\t"+value);
//         }
//     }
// }


// import java.util.StringTokenizer;

// public class Stokenizer {
//     static String str="title=Java: The Complete"+
//     "Refernce;author=Schildt;Publisher=The McGraw Hill;"+
//     "Copyright=2014";
//     public static void main(String[] args) {
//         StringTokenizer st=new StringTokenizer(str,"=;");
//         while (st.hasMoreTokens()) {
//             String token = st.nextToken();
//             // String value = st.nextToken();
//             System.out.println(token+"\t");
//         }
//     }
// }

// import java.util.StringTokenizer;

// public class Stokenizer {
//     static String str="title=Java: The Complete"+
//     "Refernce;author=Schildt;Publisher=The McGraw Hill;"+
//     "Copyright=2014";
//     public static void main(String[] args) {
//         StringTokenizer st=new StringTokenizer(str,"=;",true);
//         int count = st.countTokens();
//         System.out.println(count);
//         while (st.hasMoreTokens()) {
//             String key = st.nextToken();
//             String value = st.nextToken();
//             System.out.println(key+"\t"+value);
//         }
//     }
// }

import java.util.StringTokenizer;

public class Stokenizer {
    static String str="title=Java: The Complete"+
    "Refernce;author=Schildt;Publisher=The McGraw Hill;"+
    "Copyright=2014";
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer(str,"=;");
        int count = st.countTokens();
        System.out.println(count);
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String value = st.nextToken();
            System.out.println(key+"\t"+value);
        }
        int count1 = st.countTokens();
        System.out.println(count1);
    }
}
//java provides the built in
// a multithreadedd program contains two or more paths that can run concurrently
//each path of such a program is called thread
//each thread defines a seperate path of execution
//a program has several threads
//multitasking can take place in two ways
//process based and thread based
//a process is a program that is executing
//the process based myltitasking is a feature that allows the computer to run two or more programs concurrently
//in a process based multitasking a program is the smallest unit of he code that canbe dispatched by the scheduler
//in a thread based- the thread is the smallest unit of the dispatchable code
//difference between process based-its more diverse than 
// multitasking threads requires less overhead than multitasking proceess
//{processes require their own seperate address space whereas thread are light based entities which share same memory space as parent process}
//context switching from one process to another process is too costly
//whereas one thread to another thread is not that costly
// what is the benefit of multithreading ??
//multithreading allows us to write more efficient program that makees the maximum use of proceessing[cpu] power in our system
