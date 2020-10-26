public class DoublyLinkedList{
    Node first;
    Node last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    
    }


    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }else {
            first.previous = newNode;
        }
        
        newNode.next = first;
        first = newNode;

    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode
        }else {
            last.next = newNode;
            newNode.previous = last;

        }
    
        last = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null) {
            last = null;
        }else {
            first.next.previous = null;
        }

        first = first.next;

        return temp;
    }
  

}