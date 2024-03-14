
class Stats<T extends Number>{
    T[] nums;
    Stats(T[]o){
        nums = o;
    }
    double average(){
        double sum=0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();}
        return sum/nums.length;
    }
    public static void main(String[] args) {
        Integer[] inums={1,2,3,4,5,6};
        Stats<Integer> iob=new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is :"+v);
        Double[] dnums={1.0,2.0,2.5,3.5,4.5,5.3,6.5};
        Stats<Double> dob=new Stats <>(dnums);

        double d = dob.average();
        System.out.println("iob average is :"+d);
    }
}



// class Stats<T extends Number>{
//     T[] nums;
//     Stats(T[]o){
//         nums = o;
//     }
//     double average(){
//         double sum=0.0;
//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i].doubleValue();
//         }
//         return sum / nums.length; // return the average
//     }
// }

// public class Main {
//     public static void main(String[] args) {
        
//     }
// }