package p1;
class Balance{
    String name;
    double bal;
    Balance(String s,double b){
        name=s;
        bal=b;
    }
    void show(){
        if (bal<0) {
            System.out.print("-->"+" ");
        }
        System.out.println(name + ": $"+bal);
    }
}
public class demo{
    public static void main(String[] args) {
        Balance ob[]=new Balance[3];
        ob[0]=new Balance("AB", 156.09);
        ob[1]=new Balance("CD", -45.78);
        ob[2]=new Balance("EF", 234.89);
        for(int i=0;i<3;i++){
            ob[i].show();
        }
        
    }
}