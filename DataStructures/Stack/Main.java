package DataStructures.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(2);

        stack.push(3);
        stack.push(1);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());

    }
}
