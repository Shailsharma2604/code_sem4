
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}

class MyClass<T extends Comparable<T>>implements MinMax<T>{
    T[] vals;
    MyClass(T[] o){
        vals=o;
    }

    // vals={21,19,34,56}
    // v=vals[0]//v=21

    public T min(){
        T v=vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v)<0){
                v=vals[i];
            }
        }
    }

    public T max(){

    }
}

// class MyClass implements MinMax<T>{

// }

public class GenIFDemo {
    public static void main(String[] args) {
        
    }
}
