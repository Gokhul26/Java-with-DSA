package DataStructures.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Singly Linked LIst
        LL list = new LL();      
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(13);
        list.insertFirst(2);
        list.insertlast(22);
        // list.insert(100, 3);
        // // list.insert(140, 6);  
        // list.display();
        // list.insertRec(89, 4);
        list.display();

        list.duplicates();
        list.display();
        // System.out.println(list.deleteFirst());
        // System.out.println(list.deleteLast());   
        //     list.display(); 
        // list.deleteLast();
        // System.out.println(list.delete(2));
        // list.delete(2);
        // int index = list.find(5);
        // System.out.println(index);
        // list.display();

        // Doubly Linked List
        // DLL list = new DLL();
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(54);
        // list.insertFirst(89);
        // list.insert(54, 76);
        // list.insertLast(67);
        // list.insert(3, 89);
        // list.display(); 

        // CLL list = new CLL();
        // list.insert(56);
        // list.insert(12);
        // list.insert(89);
        // list.insert(58);
        // list.display();
        // // System.out.println();
        // list.delete(12);
        // list.display();
    }
}
