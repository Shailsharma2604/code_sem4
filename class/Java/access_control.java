
class Test{
    int a;
    public int b;
    private int c;

    void setc(int val){
        c=val;
    }
    int getc(){
        return c;
    }
}
public class access_control {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.a=10;
        obj.b=20;
        obj.setc(30);

        System.out.println("a = "+obj.a);
        System.out.println("b = "+obj.b);
        System.out.println("c = "+obj.getc());

    }
}
