public class Queue {
    //initialize variables for queue
    int maxSize;
    long[] arrayQueueSlot; //slots to store data 
    int front;
    int rear;
    int nItems;


    public Queue(int size){
        this.maxSize = size;
        this.arrayQueueSlot = new long[size];
        this.front = 0;
        this.rear = -1; 
        this.nItems = 0;

    }

    public void insert(long j){
        rear++; //increment counter to 0 
        arrayQueueSlot[rear] = j; //array index poisition changes to 0 and stores item value
        nItems++; //number of items increases in the queue
    }

    public long remove(){
      long temp = arrayQueueSlot[front];  //pop elements on index 0 
      front++; 
      nItems --;
      return temp; 
    }

    public void view(){
        System.out.print("[ ");
        for(int i = 0; i < arrayQueueSlot.length; i++){
            System.out.print(arrayQueueSlot[i] + " ");
        }
        System.out.print("]");
    }

}