package interfaces;


interface demo1{
    void meth1();
    void meth2();
}

interface demo2 extends demo1{
    void meth3();
}

class myclass implements demo2{
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
    public void meth3(){
        System.out.println("Method 3");
    }

}

public class IFextend {
    public static void main(String[] args) {
        myclass ob=new myclass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
