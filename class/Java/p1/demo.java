package p1;

class Balance{
    String name;
    double bal;

    Balance(String n , double b){
        name=n;
        bal=b;
    }

    void show(){
        if(bal<0){
            System.out.println("-->");
        }
        System.out.println(name +": $"+ bal);
    }
}

public class demo{
    public static void main(String[] args){
        Balance ob[] = new Balance[3];

        ob[0] = new Balance("AB",159.09);
        ob[1]= new Balance("CD", 160.45 );
        ob[2]= new Balance("EF", 123.9);

        for(int i=0;i<3;i++){
            ob[i].show();
        }
    //     System.out.println("User defined Packages");
    
 }
}