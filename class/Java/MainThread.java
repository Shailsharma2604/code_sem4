public class MainThread {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("Current Thread :-"+t);

        t.setName("My Thread");

        System.out.println("After changing name :-"+t);

        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                // execution will come for this 
                // we need to handle it 
                // Thread.sleep(1000);
                Thread.sleep(1000);
                System.out.println("Current Thread"+t.currentThread());
                System.out.println("Current Thread Name :-"+t.getName());
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread interrupted");
        // System.out.println("Current Thread"+t.currentThread());
        // System.out.println("Current Thread Name"+t.getName());
        }
        System.out.println("Loop End Here");
        System.out.println("Current Thread"+t.currentThread());
        System.out.println("Current Thread Name :-"+t.getName());
    }
}
