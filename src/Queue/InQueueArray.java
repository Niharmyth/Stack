package Queue;

import org.omg.CORBA.INITIALIZE;

public class InQueueArray {

    private int[] queue;
    private int size;
    private int data;
    private int head;
    private int tail;
    private static final int INITIALIZE_SIZE = 10;

    InQueueArray(){
        queue = new int[INITIALIZE_SIZE];
        data = 0;
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(int data){
        queue[tail] = data;
        tail++;
        size++;
    }

    public int dequeue(){
        int data = queue[head];
        head++;
        size--;
        return data;
    }

    @Override
    public String toString(){
        String result = "";
        for(int i = 0; i< size; i++)
            result += queue[head + i] + ", ";
        return result;
    }

    public static void main(String[] args) {
        InQueueArray queueValue = new InQueueArray();
        queueValue.enqueue(10);
        queueValue.enqueue(20);
        queueValue.enqueue(30);
        queueValue.enqueue(40);

        System.out.println(queueValue);

        System.out.println("Removed value : "+queueValue.dequeue());

        System.out.println(queueValue);
    }

}
