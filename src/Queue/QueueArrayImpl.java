package Queue;

public class QueueArrayImpl {

    private int[] queue;
    private int data;
    private int head;
    private int tail;
    private int size;
    private int INITIAL_SIZE = 10;

    QueueArrayImpl(){
        this.queue = new int[INITIAL_SIZE];
        this.data = 0;
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enQueue(int data){
        queue[tail] = data;
        tail++;
        size++;
    }

    public int deQueue(){
        int data = queue[head];
        head ++;
        size--;
        return data;
    }

    @Override
    public String toString(){
        String result = "";
        for(int i = 0; i < size; i++){
            result += queue[head + i] + " , ";
        }
        return result;
    }


    public static void main(String[] args) {
        QueueArrayImpl impl = new QueueArrayImpl();
        impl.enQueue(10);
        impl.enQueue(15);
        impl.enQueue(18);
        impl.enQueue(30);

        System.out.println(impl);

        System.out.println("Removing ele : " + impl.deQueue());

        System.out.println(impl);
    }
}
