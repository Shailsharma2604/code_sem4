class Example1 {
    Example1() {
        System.out.println("Inside Example 1");
    }
}

class Example2 extends Example1 {
    Example2() {
        System.out.println("Inside Example 2");
    }
}

class Example3 extends Example1 {
    Example3() {
        // super(); calling the constructor of parent class
        System.out.println("Inside Example 3");
    }
}

public class constructorE{

public static void main(String[] args) {
    Example3 ob = new Example3();
    }
}