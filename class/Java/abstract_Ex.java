
abstract class AB {
    abstract void show();

    void callmetoo(){
        System.out.println("call me too");
    }
}

class child extends AB{
    void show(){
        System.out.println("inside the child class");
    }
}

public class abstract_Ex {
    public static void main(String[] args) {
        AB obj=new child();
        child c = new child();
        c.show();
        c.callmetoo();
        c.callmetoo();
        c.show();
    }
}
