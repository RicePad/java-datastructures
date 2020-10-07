class Main {
  public static void main(String[] args) {
     
     Queue myQueue = new Queue(5);
     myQueue.insert(1);
     myQueue.insert(100);
     myQueue.insert(1000);
     myQueue.insert(10000);
     myQueue.insert(100000);
     myQueue.view();
     System.out.println(myQueue.remove());
   
  }
}