import Stack.Node;

public class StackLinkedList {

    private int data;
    Node node;

//    StackLinkedList(){
//
//    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.setNode(node);
        node = newNode;

    }


    public int pop(){
        data = node.getData();
        return data;
    }

//    public int peek(){
//
//    }

    @Override
    public String toString(){
        String result = "";
        Node current = node;
        while(current != null){
            result += current.toString() + ",";
            current = current.getNode();
        }
        return result;
    }

    public static void main(String[] args) {
        StackLinkedList list = new StackLinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        System.out.println("New List : "+list);
       System.out.println("Value removed : "+list.pop());
    }
}
