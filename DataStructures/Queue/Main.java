package DataStructures.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();

        queue.insert(90);
        queue.insert(32);
        queue.insert(21);
        queue.insert(345);

        queue.display();
        System.out.println();
        System.out.println(queue.remove());
        queue.display();

    }
}
