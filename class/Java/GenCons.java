public class GenCons {
    private double val;
    <t extends Number>GenCons(t arg){
        val=arg.doubleValue();
    }
    void showval(){
        System.out.println(val);
    }
    public static void main(String[] args) {
        GenCons ob1= new GenCons(100);
        GenCons ob2= new GenCons(100.5855);

        ob1.showval();
        ob2.showval();
        

    }
}