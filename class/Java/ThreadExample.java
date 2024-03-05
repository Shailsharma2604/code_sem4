class Mthreading extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread :-"+Thread.currentThread());
            System.out.println("Thread :-"+Thread.currentThread().getId());
            System.out.println("Thread :-"+Thread.currentThread().getId()+"count :-"+i);
        }
    }
}

public class ThreadExample{
    public static void main(String[] args) {
        Mthreading thread1=new Mthreading();
        Mthreading thread2=new Mthreading();

        thread1.start();
        thread2.start();
        thread1.run();
        thread2.run();

        for(int i=1;i<=5;i++){
            System.out.println("Main Thread Count :-"+i);
        }
    }
}

