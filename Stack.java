public class Stack {

    int maxSize;
    long[] stackArray;
    int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long j){
        top++;
        stackArray[top] = j;
    }

    public long pop(){
        int old_top = top;
        top--;
        return stackArray[old_top];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty(){
      return (top == -1);
    }

}