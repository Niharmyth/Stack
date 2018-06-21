package Stack;

public class InStackArray {

    private int[] stack;
    private int size;
    private static final  int INITIAL_SIZE = 10;

    public InStackArray(){
        this.stack = new int[INITIAL_SIZE];
        size = 0;
    }

    /**
     * Puts a new value at the top of the stack
     * @param value
     */
    public void push(int value){

        if(size == stack.length)
            doubleStackSize();

        stack[size] = value;
        size++;
    }

    /**
     * Removes and returns the value from the top of the stack
     * @return
     */
    public int pop(){
        if(size == 0)
            throw new ArrayIndexOutOfBoundsException();

        int result = stack[size-1]; // Pop the stack
        size--;
        return result;
    }

    /**
     * Returns the value at the top of the stack
     * @return
     */
    public int peek(){
        if(size == 0)
            throw new ArrayIndexOutOfBoundsException();

        return stack[size-1];
    }

    /**
     * Return the length of the stack
     * @return
     */
    public int capacity(){
        return stack.length;
    }

    /**
     * Returns the number of unused cells
     * @return
     */
    public int capacityRemaining(){
        return stack.length - size;
    }

    public void empty(){
        for(int i = 0; i<stack.length; i++){
            stack[i] = 0;
        }
        size = 0;
    }

    private void doubleStackSize(){
        int newCapacity = 2 * stack.length;

        int[] newStack = new int[newCapacity];

        //Arrays.copyOf(stack, stack.length);
        for(int i = 0; i < stack.length; i++)
            newStack[i] = stack[i];

        stack = newStack;
    }

    public static void main(String[] args) {
        InStackArray myStack = new InStackArray();
        myStack.push(5);
        myStack.push(15);
        myStack.push(25);
        myStack.push(35);
        myStack.push(45);

        System.out.print(myStack.pop());
    }

}
