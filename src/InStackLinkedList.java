public class InStackLinkedList {

    private int data;
    Node head;


    public void push(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    public int pop(){
        data = head.getData();
        return data;
    }


    @Override
    public String toString(){
        String result = "";
        Node currentNode = head;
        while(currentNode != null){
            result += currentNode.toString() + ", ";
            currentNode = currentNode.getNextNode() ;
        }
        return result;

    }

    public static void main(String[] args) {
        InStackLinkedList list = new InStackLinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        System.out.println("New List : "+ list);
        System.out.println("Popped data is : "+ list.pop());
    }

    class Node{
        private int data;
        Node head;

        Node(int data){
            this.data = data;
        }

        public void setData(int data){
            this.data = data;
        }

        public int getData(){
            return this.data;
        }

        public void setNextNode(Node node){
            this.head = node;
        }

        public Node getNextNode(){
            return this.head;
        }

        @Override
        public String toString(){
            return "Data : " +this.data;
        }
    }
}
