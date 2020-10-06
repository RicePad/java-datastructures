class Main {
  public static void main(String[] args) {
     
    Stack myStack = new Stack(5);
    myStack.push(10);
    myStack.push(20);
    myStack.push(30);

    System.out.println(myStack.peek());

    while(!myStack.isEmpty()) {
      long value = myStack.pop();
      // System.out.println(value);
    }
  }
}