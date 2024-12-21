package DataStructures.Queue;

import Recursion.returnAllIndex;

public class CustomQueue {
    private int[] data;
    int ptr = 0;

    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);    
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int value) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        data[ptr++] = value;
        return true;
    }


    //Complexity : O(n)
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];

        for (int i = 1 ; i < ptr; i++) {
            data[i-1] = data[i];
        }

        ptr--;

        return removed;
    }

    public boolean isFull(){
        return ptr == data.length;
    }

    public boolean isEmpty(){
        return ptr == 0;
    }

    public void display(){
        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
