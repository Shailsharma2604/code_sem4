
import java.util.*;

public class StackDemo {

    static void showPush(Stack<Integer>st,int a){
        // To push elemnts in stack
        st.push(a);
        // To show the element
        System.out.println("push("+a+")");
        // To show the elements of stack
        System.out.println("stack :- "+st);
    }
    static void showPop(Stack<Integer>st){
        // To pop elemnts in stack
        Integer val=st.pop();
        // To show the element
        System.out.println("pop :-"+val);
        // To show the elements of stack
        System.out.println("stack :- "+st);
    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<Integer>();
        showPush(st,21);
        showPush(st,22);
        showPush(st,23);
        showPush(st,24);
        System.out.println("content of stack :- "+st);
        showPop(st);
        showPop(st);
        showPop(st);
        showPop(st);
    }
}
