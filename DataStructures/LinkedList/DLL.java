package DataStructures.LinkedList;

public class DLL {
    private Node head;

    private class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;

        if(head == null){
            head.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }

    public Node find(int value){
        Node node = new Node(value);
        node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int value){
        Node previous = find(after);
        if(previous== null){
            System.out.println("doesn't exist");
            return;
        }
        Node node = new Node(value);
        // previous.next = node;
        node.next = previous.next;
        previous.next = node;
        node.prev = previous;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    // display the linkedlist
    public void display(){
        Node node = head;
        Node last = null;

        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        //print in reverse

        // System.out.println("Print in reverse");

        // while(last!= null){
        //     System.out.print(last.value + " -> ");
        //     last = last.prev;
        // }

        // System.out.println("START");
    }
}
