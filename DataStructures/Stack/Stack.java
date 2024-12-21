package DataStructures.Stack;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 100;
    public Stack(int size){
        this.data = new int[size];
    }

    public Stack(){
        this(DEFAULT_SIZE);
    }

    int ptr = -1;

    public boolean push(int val){
        if(isFull()){
            System.out.println("STACK IS FULL!!");
            return false;
        }
        ptr ++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int removed = data[ptr];
        ptr --;
        return removed;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Peek cant be done coz its empty");
        }
        return data[ptr];
    }

    private boolean isEmpty(){
        return ptr == -1;
    }
    protected boolean isFull(){
        return ptr == data.length - 1;
    }
}
