import java.util.EmptyStackException;

public class StackDemoTry<E> {
    private E[] elements;
    private int size = 0;

    public StackDemoTry(int initialCapacity) {
        elements = (E[]) new Object[initialCapacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    public E push(E item) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = item;
        return item;
    }

    private void resize() {
        E[] newArray = (E[]) new Object[2 * size];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }


    public static void main(String[] args) {
        StackDemo<Integer> stack = new StackDemo<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Top element of stack: " + stack.peek());
        System.out.println("Popped element from stack: " + stack.pop());
        System.out.println("Top element of stack after pop: " + stack.peek());
    }
}