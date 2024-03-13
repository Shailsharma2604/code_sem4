// Syntax : class name<object type>
// Only take wrapper classes


class gen<T> {
    T obj;
    gen(T name) {              // Type t with variable name
        obj = name;
    }

    T getData() {
        return obj;
    }

    void Showtype() {
        System.out.println("Type is: "+ obj.getClass().getName());
    }
}

public class GenDemo{
    public static void main(String[] args) {
        gen<Integer> iob = new gen<Integer>(9);                  // Object Creation ; Integer is wrapper classes
        iob.Showtype();
        System.out.println(iob.getData());

        System.out.println();
        
        gen<String> sob = new gen<String>("String");
        sob.Showtype();
        System.out.println(sob.getData());
    }
}