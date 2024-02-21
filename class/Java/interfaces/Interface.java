package interfaces;
// Interfaces are collection of methods
interface Callback{
    void Callback(int param);
}
public class Interface implements Callback {
    // when you implement an interface method , it must be declared as public 
    public void Callback(int p){
        System.out.println("Interface used with parameter "+p);
    }
    void show(){
        System.out.println("Member of InterfaceE class");
    }
}