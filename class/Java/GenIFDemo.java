
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
        for (int i = 0; i < vals.length; i++) {
            if(vals[i].compareTo(v)<0){
                v=vals[i];
            }
        }
        return v;
    }

    public T max(){
        T v=vals[0];
        for (int i = 0; i < vals.length; i++) {
            if(vals[i].compareTo(v)>0){
                v=vals[i];
            }
        }
        return v;
    }
}

// class MyClass implements MinMax<T>{

// }

public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[]={4,2,21,40,12};
        MyClass<Integer> iob= new MyClass<>(inums);
        System.out.println("Min :- "+iob.min());
        System.out.println("Max :- "+iob.max());

        Character chars[]={'b','r','o','i','e'};
        MyClass<Character> cob= new MyClass<>(chars);
        System.out.println("Min :- "+cob.min());
        System.out.println("Max :- "+cob.max());
    }
}
