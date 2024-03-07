
// static void sleep(long milliseconds) throws InterruptedException
// static void sleep(long milliseconds int nanoseconds) throws InterruptedException


// class NewThread extends Thread{
//     NewThread(){
//         super("Demo Thread");
//         System.out.println("Child Thread :-"+this);
//         start();
//     }
//     public void run(){
//         try{
//             for (int i = 0; i <= 5; i++) {
//                 System.out.println("Child Thread :-"+i);
//                 Thread.sleep(500);
//             }
//         }catch(InterruptedException e){
//             System.out.println("Child Thread Interruption");
//         }
//         System.out.println("Child Thread Exiting");
//     }
// }

// class NewThread implements Runnable{
//     Thread t;
//     NewThread(){
//         // super("Demo Thread");
//         t = new Thread("Demo Thread");
//         System.out.println("Child Thread :-");
//         t.start();
//     }
//     public void run(){
//         try{
//             for (int i = 0; i <= 5; i++) {
//                 System.out.println("Child Thread :-"+i);
//                 Thread.sleep(500);
//             }
//         }catch(InterruptedException e){
//             System.out.println("Child Thread Interruption");
//         }
//         System.out.println("Child Thread Exiting");
//     }
// }

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        // super("Demo Thread");
        t = new Thread(this,"Demo Thread");
        System.out.println("Child Thread :-"+this);
        t.start();
    }
    public void run(){
        try{
            for (int i = 0; i <= 5; i++) {
                System.out.println("Child Thread :-"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child Thread Interruption");
        }
        System.out.println("Child Thread Exiting");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        // NewThread t = new NewThread();
        new NewThread();
        try{
            for (int i = 0; i <= 5; i++) {
                System.out.println("Main Thread :-"+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Child Thread Interruption");
        }
        System.out.println("Main Thread Exiting");
    }
}
