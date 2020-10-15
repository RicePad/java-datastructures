public class SinglyLinkedList {
    Node first;


    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return (first == null);
    }

    public int insertFirstNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.first = first;
        first = newNode;
    }

    public Node deleteFirst(){
         Node temp = first; 
         first = first.next;
         return temp;
    }


}