public class day_7 {
    // static int sum(int a,int b){
    //     return a+b;
    // }
    // static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a,int b,int c,int d){
    //     return a+b+c+d;
    // }
    // static int sum(int ...arr){
    //     // Available as int [] arr;
    //     int result=0;
    //     for(int a:arr){
    //         result += a;
    //     }
    //     return result;
    // }

    static int sum(int x,int ...arr){
        // Available as int [] arr;
        int result=0;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial"); 
        // System.out.println("The sum of 0 is :- "+sum());
        System.out.println("The sum of 4,5 is :- "+sum(4,5));
        System.out.println("The sum of 4,5,6 is :- "+sum(4,5,5));
        System.out.println("The sum of 4,5,6,7 is :- "+sum(4,5,6,7));
        System.out.println("The sum of 4,5,6,7,8 is :- "+sum(4,5,6,7,8));
        System.out.println("The sum of 4,5,6,7,8,9 is :- "+sum(4,5,6,7,8,9));
    }
}
