package p2;
  class AnotherClient implements Callback{
    public void Callback(int p){

    }
  }


public class Interface {
    public static void main(String[] args) {
        AnotherClient e= new AnotherClient();
        Callback ob=new Interface();
        ob=e;
        ob.Callback(param:42);
    }
}
