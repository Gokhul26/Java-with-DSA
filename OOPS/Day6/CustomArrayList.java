package OOPS.Day6;
// but here we can only store integers
import java.util.Arrays;

public class CustomArrayList {
    
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
        
        public CustomArrayList() {
            this.data = new int[DEFAULT_SIZE];
        }
    
        private void add(int num){
            if(isFull()){
            resize();
        }
        data[size++] = num;
    }

        private boolean isFull(){
            return size == data.length;
        }

        private void resize(){
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];                
            }
            data = temp;
        }

        private int remove(){
            int removed = data[--size];
            return removed;
        }

        private int get(int index){
            return data[index];
        }

        private void set(int num, int index){
            data[index] = num;

        }

        private int size(){
            return size;
        }
    
        // @Override
        // public String toString() {
        //     return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + ", isFull()=" + isFull()
        //             + ", remove()=" + remove() + ", size()=" + size() + ", getClass()=" + getClass() + ", hashCode()="
        //             + hashCode() + ", toString()=" + super.toString() + "]";
        // }  
        
        
        // @Override
        // public String toString() {
        //     StringBuilder sb = new StringBuilder("[");
        //     for (int i = 0; i < size; i++) {
        //          sb.append(data[i]);
        //          if (i < size - 1) {
        //              sb.append(", ");
        //     }
        // }
        //     sb.append("]");
        //     return sb.toString();
        // }

        @Override
        public String toString() {
            return "CustomArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        // list.add(2);
        // list.add(6);
        // list.get(1);
        // list.size();

        for (int i = 0; i < 12; i++) {
            list.add(i * 2);            
        }
        System.out.println(list);
    }
}
