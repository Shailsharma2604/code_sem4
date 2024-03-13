
class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }
    T getdata(){
        return ob;
    }
    void showType(){
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen ob;
    }
}
