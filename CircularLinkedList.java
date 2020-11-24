// public class CircularLinkedList{
//     Node first; 
//     Node last;

//     public boolean isEmpty(){
//         return (first == null);
//     }

//     public void insertFirst(int aNode){
//         Node newNode = new Node()
//         newNode.data = aNode;

//         if(isEmpty()){
//             first = newNode
//         }

//         newNode.next = first;
//         first = newNode;

//     }

//     public void insertLast(int aNode) {
//         Node newNode = new Node();
//         newNode.data = aNode;

//         if(isEmpty()){
//             first = newNode;
//         }else{
//             last.next = newNode;
//             last = newNode;
//         }
//     }

//     public int deleteFirst(){
//         int temp = first;

//         if(first.next == null){
//             last = null;
//         }

//         first = first.next
//         return temp

//     }

// }