
//Dynamic method dispatch a mechanism by which a call to an overriden method is resolved at runtime rather than at compile time.
// It allows a reference variable of a super class type to refer to an object of subclass type.
// When the method is called on this refernce variable, the actual method that gets executed is determined at runtime based on the type of the object to which the reference variable points.

class X {
    void display() {
        System.out.println("Inside A");
    }
}

class Y extends X {
    void display() {
        System.out.println("Inside B");
    }
}

class Z extends X {
    void display() {
        System.out.println("Inside C");
    }
}
public class dynamic_method {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Z z = new Z();

        X r; // obtain refernce of type A
        r = y; // r is object of class B
        r.display();
    }
}
