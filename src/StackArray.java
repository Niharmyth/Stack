import java.util.Arrays;

public class StackArray {

    private int[] stack;
    private int size;
    private static final int INITIAL_SIZE = 10;

    StackArray(){
        stack = new int[INITIAL_SIZE];
        size = 0;
    }

    public void push(int value){
        stack[size] = value;
        size ++;
    }

    public int pop(){
        if(size == 0)
            throw new ArrayIndexOutOfBoundsException();

        int value = stack[size-1];
        size --;
        return value;
    }

    public int peek(){
        if(size == 0)
            throw new ArrayIndexOutOfBoundsException();

        int value = stack[size-1];
        return value;
    }

    public void doubleStackSize(){
        int stackSize = 2 * stack.length;
        int[] newStack = new int[stackSize];

        for(int i = 0; i< stack.length; i++)
            newStack[i] =  stack[i];

        stack = newStack;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Popped value is : "+stack.pop());
    }

}
