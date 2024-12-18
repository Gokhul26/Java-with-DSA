package DataStructures.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1; 
    }

    //Insert using recursion

    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;

    }
    public void insert(int val, int index){
        if(index == size){
            insertlast(val);
            return;
        }

        if(index == 0){
            insertFirst(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertlast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public int deleteFirst(){
        int value = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -- ;
        return value;   
    }

//     // delete last
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.val;

        prev.next = prev.next.next;

        return value;
    }

   public int find(int value){
        Node node = head;
        int index = 0;
        while(node != null){
            if(node.val == value){
                return index;
            }else{
                node = node.next;
                index++;
            }
        }   
        return -1;
   }

   public void duplicates(){
        Node node = head;

        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null; 
}

    //Merge
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null){
            if(f.val < s.val){
                ans.insertlast(f.val);
                f = f.next;
            }else{
                ans.insertlast(s.val);
                s = s.next;
            }
        }

        while(f != null){
            ans.insertlast(f.val);
            f = f.next;
        }
        while(s != null){
            ans.insertlast(s.val);
            s = s.next;
        }

        return ans;
    } 

    private class Node{
        private int val ;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertlast(1);
        first.insertlast(1);
        first.insertlast(3);

        second.insertlast(4);
        second.insertlast(6);
        second.insertlast(8);
        second.insertlast(14);

        LL ans = merge(first, second);
        ans.display();
        }
}


//  problems

